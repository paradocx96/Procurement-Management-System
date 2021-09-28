package com.csse.pms.dal.model.inventory;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class CountableItems {
	
	@Id
	private String id;
	private String name;
	private String status;
	private int quantity;
	private int minimumQuantity;
	
	public CountableItems() {
		
	}
	
	
	public CountableItems(String id, String name, String status, int quantity, int minimumQuantity) {
		super();
		this.id = id;
		this.name = name;
		this.status = status;
		this.quantity = quantity;
		this.minimumQuantity = minimumQuantity;
	}


	public String getId() {
		return id;
	}


	public void setId(String id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getStatus() {
		return status;
	}


	public void setStatus(String status) {
		this.status = status;
	}


	public int getQuantity() {
		return quantity;
	}


	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}


	public int getMinimumQuantity() {
		return minimumQuantity;
	}


	public void setMinimumQuantity(int minimumQuantity) {
		this.minimumQuantity = minimumQuantity;
	}
	
	
	
	
	
	
}
