package com.csse.pms.dal.adapter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.transaction.annotation.Transactional;

import com.csse.pms.dal.model.SupplierModel;
import com.csse.pms.dal.repository.SupplierRepository;

/**
 * 
 * @author Malwatta H.G.
 * 
 * This class is for find the by their unique data
 * like email(in here i get email instead of username)
 * 
 * Then, after find that user by their email set that details into user object
 * after that that object pass as a parameter to SupplierDetailsServiceImpl class
 * 
 * @see # SupplierDetailsServiceImpl.build(supplier);
 *
 */

public class SupplierDetailsImpl implements UserDetailsService{
	
	@Autowired
	SupplierRepository supplierRepository;

	//Find the user email in the database if not throw custom exception error
	@Override
	@Transactional
	public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
			
		SupplierModel supplier = supplierRepository.findByEmail(email).orElseThrow(() -> new UsernameNotFoundException(email + " not found!"));

		return SupplierDetailsServiceImpl.build(supplier);
	}

}
