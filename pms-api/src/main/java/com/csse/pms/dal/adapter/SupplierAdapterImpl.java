package com.csse.pms.dal.adapter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

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
		
		//return success MSG to frontEnd user is registered successfully
		return ResponseEntity.ok(new SupplierMessageResponseDto("You have successfully registered!"));
	}
	
}
