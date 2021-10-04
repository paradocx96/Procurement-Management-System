package com.csse.pms.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.csse.pms.api.SupplierApi;
import com.csse.pms.domain.Item;
import com.csse.pms.domain.Supplier;
import com.csse.pms.util.CommonConstants;

@RestController
@RequestMapping(CommonConstants.SUPPLIER_REQUEST_MAPPING)
@CrossOrigin(origins = CommonConstants.STAR, allowedHeaders = CommonConstants.STAR, exposedHeaders = CommonConstants.STAR)

public class SupplierController {
	
	@Autowired
	private SupplierApi supplierApi;
	
	
	@PostMapping(CommonConstants.SUPPLIER_POST_MAPPING_REGISTER)
    @ResponseStatus(HttpStatus.CREATED)
	public ResponseEntity<?> registerSupplier(@RequestBody Supplier supplier){
		return supplierApi.registerSupplier(supplier);
	}
	
	@PostMapping(CommonConstants.SUPPLIER_POST_MAPPING_LOGIN)
    @ResponseStatus(HttpStatus.CREATED)
	public ResponseEntity<?> loginSupplier(@RequestBody Supplier supplier){
		return supplierApi.loginSupplier(supplier);
	}
	
	@PostMapping(CommonConstants.SUPPLIER_POST_MAPPING_ADD_ITEM)
    @ResponseStatus(HttpStatus.CREATED)
	public ResponseEntity<?> addItem(@RequestBody Item item){
		return supplierApi.addItem(item);
	}
	
	@GetMapping(CommonConstants.SUPPLIER_GET_MAPPING_BY_SUPPLIER_ID)
    @ResponseStatus(HttpStatus.OK)
	public List<Item> getItemBySupplierID(@PathVariable String id){
		return supplierApi.getItemBySupplierID(id);
	}
	
	
}
