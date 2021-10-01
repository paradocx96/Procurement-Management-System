package com.csse.pms.domain;

import org.springframework.http.ResponseEntity;

public interface SupplierDataAdapter {
	
	ResponseEntity<?> registerSupplier(Supplier supplier);
	
}
