package com.csse.pms.dal.model.inventory;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class UncountableItemsModel {
	
	@Id
	private String id;
	private String name;
	private String status;
	private double amount;
	private String unit;
	private double minimumAmount;
	private String siteid;
	private String sitename;
	
	public UncountableItemsModel() {
		
	}
	
	

	public UncountableItemsModel(String id, String name, String status, double amount, String unit,
			double minimumAmount, String siteid, String sitename) {
		super();
		this.id = id;
		this.name = name;
		this.status = status;
		this.amount = amount;
		this.unit = unit;
		this.minimumAmount = minimumAmount;
		this.siteid = siteid;
		this.sitename = sitename;
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



	public String getSiteid() {
		return siteid;
	}



	public void setSiteid(String siteid) {
		this.siteid = siteid;
	}



	public String getSitename() {
		return sitename;
	}



	public void setSitename(String sitename) {
		this.sitename = sitename;
	}
	
	
	
	

}
