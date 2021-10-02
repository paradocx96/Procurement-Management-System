package com.csse.pms.dal.adapter;

import java.io.UnsupportedEncodingException;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.stream.Collectors;

import javax.mail.MessagingException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Component;

import com.csse.pms.dal.model.ERole;
import com.csse.pms.dal.model.EmailSender;
import com.csse.pms.dal.model.InternelUserModel;
import com.csse.pms.dal.model.Role;
import com.csse.pms.dal.model.SupplierModel;
import com.csse.pms.dal.repository.InternelUserRepository;
import com.csse.pms.dal.repository.RoleMongoRepository;
import com.csse.pms.dal.repository.SupplierRepository;
import com.csse.pms.domain.InternelUser;
import com.csse.pms.domain.InternelUserDataAdapter;
import com.csse.pms.domain.Supplier;
import com.csse.pms.domain.SupplierDataAdapter;
import com.csse.pms.dto.JwtResponseDto;
import com.csse.pms.dto.SupplierMessageResponseDto;
import com.csse.pms.security.jwt.JwtUtils;
import com.csse.pms.util.CommonConstants;



/**
 * 
 * @author Malwatta H.G.
 * 
 * This class handle by the Internal users related methods
 *     - register @see #registerInternelUser(InternelUser)
 *     - login @see #loginInternelUser(InternelUser)
 *
 */

@Component
public class InternelUserAdapterImpl implements InternelUserDataAdapter{

	@Autowired
	InternelUserRepository internelUserRepository;
	
	@Autowired
	private EmailSender emailSender;
	
	@Autowired
	AuthenticationManager authenticationManager;
	
	@Autowired
	JwtUtils jwtUtils;
	
	@Autowired
	UserDetailsServiceImpl userDetailsServiceImpl;
	
	@Autowired
	RoleMongoRepository roleMongoRepository;
	
	/**
     * Initialize Logger
     */
    public static final Logger LOGGER = Logger.getLogger(InternelUserAdapterImpl.class.getName());

	@Override
	public ResponseEntity<?> registerInternelUser(InternelUser internelUser) {
		
		/**
		 * Check whether user mail is already in the database,
		 * because user mail should be unique 
		 *  
		 */
		if(internelUserRepository.existsByEmail(internelUser.getEmail())) {
			return ResponseEntity.badRequest().body(new SupplierMessageResponseDto(CommonConstants.SUPPLIER_EMAIL_REGISTRATION_ERROR_MSG));
		}
		
		
		InternelUserModel interelUserDetails = new InternelUserModel(
				internelUser.getName(),
				internelUser.getEmail(),
				internelUser.getPassword(),
				internelUser.getContactNo(),
				internelUser.getAddress()
				);
		
		//Create new HashSet to store user Roles
		Set<Role> roles = new HashSet<>();
						
		//If it is true, Add ROLE_USER to that user
		Role userRole = roleMongoRepository.findByName(ERole.ROLE_ADMIN)
								.orElseThrow(() -> new RuntimeException("Error: Role is not found."));
				
		roles.add(userRole);
		
		//set all roles to user object
		interelUserDetails.setRoles(roles);
		
		internelUserRepository.save(interelUserDetails);
		
		/**
		 * Set the values to email sender class and call 
		 * send email method to send the email
		 * 
		 */
		emailSender.setEmail(internelUser.getEmail());
		emailSender.setUsername(internelUser.getName());
		
		try {
				emailSender.sendEmail();
				
		} catch (UnsupportedEncodingException | MessagingException e) {
			
			 LOGGER.log(Level.SEVERE, e.getMessage());
		}
		
		//return success MSG to frontEnd user is registered successfully
		return ResponseEntity.ok(new SupplierMessageResponseDto(CommonConstants.SUPPLIER_REGISTRATION_SUCCESS_MSG));
	}

	@Override
	public ResponseEntity<?> loginInternelUser(InternelUser internelUser) {
		
		
				//Get user name and password and create new AuthenticationToken 
				Authentication authentication = authenticationManager.authenticate(
								new UsernamePasswordAuthenticationToken(internelUser.getEmail(), internelUser.getPassword()));

				//Set above assigned user credentials using Authentication object
				SecurityContextHolder.getContext().setAuthentication(authentication);
						
				//After that create new JWT Token for that person
				String jwt = jwtUtils.generateJwtToken(authentication);
						
				//Then get authentication principles and set that UserDetailimpl object 
				UserDetailsImpl userDetails = (UserDetailsImpl) authentication.getPrincipal();	
						
				//Get getAuthorities and set to List object
				List<String> roles = userDetails.getAuthorities().stream()
								.map(item -> item.getAuthority())
								.collect(Collectors.toList());
				
				//This is for check the program display correct values or not
				System.out.println(userDetails.getUsername());
				System.out.println(userDetails.getPassword());
				System.out.println(jwt);
				System.out.println(roles.toString());
				
				
				//Return JWT response to FrontEnd
				return ResponseEntity.ok(new JwtResponseDto(jwt, 
															userDetails.getId(), 
															userDetails.getUsername(), 
															userDetails.getName(), 
															roles));
	}
	
}
