package com.csse.pms.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.csse.pms.domain.Supplier;
import com.csse.pms.domain.SupplierDataAdapter;

@Service
public class SupplierApi {

	@Autowired
	private SupplierDataAdapter supplierDataAdapter;
	
	 /**
     * This Method gets parameter as Supplier object.
     * Then call supplier register method in Adapter.
     *
     * @param supplier - Relevant supplier object from Controller.
     * @return ResponseEntity<?> - Customized message will be return.
     * @see #registerSupplier(Supplier)
     */
	
	public ResponseEntity<?> registerSupplier(Supplier supplier){
		return supplierDataAdapter.registerSupplier(supplier);
	}

	
}
