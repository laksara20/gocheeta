package com.laksara.gocheeta.model;

public class Location {
	private String locationID;
	private String branchID;
	private String streetAddress;
	
	public Location() {

	}

	public Location(String locationID, String branchID, String streetAddress) {
		super();
		this.locationID = locationID;
		this.branchID = branchID;
		this.streetAddress = streetAddress;
	}

	public String getLocationID() {
		return locationID;
	}

	public void setLocationID(String locationID) {
		this.locationID = locationID;
	}

	public String getBranchID() {
		return branchID;
	}

	public void setBranchID(String branchID) {
		this.branchID = branchID;
	}

	public String getStreetAddress() {
		return streetAddress;
	}

	public void setStreetAddress(String streetAddress) {
		this.streetAddress = streetAddress;
	}
	
	
}
