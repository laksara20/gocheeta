package com.laksara.gocheeta.model;

public class VehicleCategory {
	private String categoryID;
	private String categoryName;
	
	
	public VehicleCategory() {
	}
	
	
	public VehicleCategory(String categoryID, String categoryName) {
		this.categoryID = categoryID;
		this.categoryName = categoryName;
	}

	public String getCategoryID() {
		return categoryID;
	}
	
	public void setCategoryID(String categoryID) {
		this.categoryID = categoryID;
	}
	
	public String getCategoryName() {
		return categoryName;
	}
	
	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}
	
}
