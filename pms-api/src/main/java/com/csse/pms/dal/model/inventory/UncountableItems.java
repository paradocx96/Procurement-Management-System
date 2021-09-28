package com.csse.pms.dal.model.inventory;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class UncountableItems {
	
	@Id
	private String id;
	private String name;
	private String status;
	private double amount;
	private String unit;
	private double minimumAmount;
	
	public UncountableItems() {
		
	}
	
	public UncountableItems(String id, String name, String status, double amount, String unit, double minimumAmount) {
		super();
		this.id = id;
		this.name = name;
		this.status = status;
		this.amount = amount;
		this.unit = unit;
		this.minimumAmount = minimumAmount;
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

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public String getUnit() {
		return unit;
	}

	public void setUnit(String unit) {
		this.unit = unit;
	}

	public double getMinimumAmount() {
		return minimumAmount;
	}

	public void setMinimumAmount(double minimumAmount) {
		this.minimumAmount = minimumAmount;
	}
	
	
	
	

}
