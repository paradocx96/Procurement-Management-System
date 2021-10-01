package com.csse.pms.dal.adapter;

import java.io.UnsupportedEncodingException;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.mail.MessagingException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

import com.csse.pms.dal.model.EmailSender;
import com.csse.pms.dal.model.SupplierModel;
import com.csse.pms.dal.repository.SupplierRepository;
import com.csse.pms.domain.Supplier;
import com.csse.pms.domain.SupplierDataAdapter;
import com.csse.pms.dto.SupplierMessageResponseDto;

/**
 * 
 * @author Malwatta H.G.
 * 
 * This class handle by the supplier related methods
 *     - register @see #registerSupplier(Supplier)
 *     - login
 *     - add items
 *     - view items
 *     - delete items
 *     - edit items
 *
 */

@Component
public class SupplierAdapterImpl implements SupplierDataAdapter{

	@Autowired
	private SupplierRepository supplierRepository;
	
	@Autowired
	private EmailSender emailSender;
	
	/**
     * Initialize Logger
     */
    public static final Logger LOGGER = Logger.getLogger(SupplierAdapterImpl.class.getName());

	@Override
	public ResponseEntity<?> registerSupplier(Supplier supplier) {
		
		/**
		 * Check whether user mail is already in the database,
		 * because user mail should be unique 
		 *  
		 */
		if(supplierRepository.existsByEmail(supplier.getEmail())) {
			return ResponseEntity.badRequest().body(new SupplierMessageResponseDto("This mail is already taken!"));
		}
		
		
		SupplierModel supplierDetails = new SupplierModel(
				supplier.getName(),
				supplier.getEmail(),
				supplier.getPassword(),
				supplier.getContactNo(),
				supplier.getAddress(),
				supplier.getLocation(),
				supplier.getStatus()
				);
		
		supplierRepository.save(supplierDetails);
		
		/**
		 * Set the values to email sender class and call 
		 * send email method to send the email
		 * 
		 */
		emailSender.setEmail(supplier.getEmail());
		emailSender.setUsername(supplier.getName());
		
		try {
				emailSender.sendEmail();
				
		} catch (UnsupportedEncodingException | MessagingException e) {
			
			 LOGGER.log(Level.SEVERE, e.getMessage());
		}
		
		//return success MSG to frontEnd user is registered successfully
		return ResponseEntity.ok(new SupplierMessageResponseDto("You have successfully registered!"));
	}
	
}
