package com.csse.pms.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.csse.pms.domain.Item;
import com.csse.pms.domain.ItemDataAdapter;
import com.csse.pms.domain.Supplier;
import com.csse.pms.domain.SupplierDataAdapter;

/**
 * This Method gets parameter as Supplier object.
 * Then call supplier register method in Adapter.
 *
 * @param supplier - Relevant supplier object from Controller.
 * @return ResponseEntity<?> - Customized message will be return.
 * @see #registerSupplier(Supplier)
 */

@Service
public class SupplierApi {

	@Autowired
	private SupplierDataAdapter supplierDataAdapter;
	
	@Autowired
	private ItemDataAdapter itemDataAdapter;
	
	
	public ResponseEntity<?> registerSupplier(Supplier supplier){
		return supplierDataAdapter.registerSupplier(supplier);
	}

	public ResponseEntity<?> loginSupplier(Supplier supplier){
		return supplierDataAdapter.loginSupplier(supplier);
	}
	
	public ResponseEntity<?> addItem(Item item){
		return itemDataAdapter.addItem(item);
	}
	
	public List<Item> getItemBySupplierID(String id){
		return itemDataAdapter.getItemBySupplierID(id);
	}
	
	public ResponseEntity<?> deleteByItemID(String id){
		return itemDataAdapter.deleteByItemID(id);
	}
	
}
