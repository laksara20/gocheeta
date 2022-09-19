package com.laksara.gocheeta.model;

public class Vehicle {
	private String numberPlate;
	private String categoryID;
	
	public Vehicle() {

	}

	public Vehicle(String numberPlate, String categoryID) {
		super();
		this.numberPlate = numberPlate;
		this.categoryID = categoryID;
	}

	public String getNumberPlate() {
		return numberPlate;
	}

	public void setNumberPlate(String numberPlate) {
		this.numberPlate = numberPlate;
	}

	public String getCategoryID() {
		return categoryID;
	}

	public void setCategoryID(String categoryID) {
		this.categoryID = categoryID;
	}
	
	
}
