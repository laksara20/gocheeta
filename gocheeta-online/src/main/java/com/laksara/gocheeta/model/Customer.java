package com.laksara.gocheeta.model;

public class Customer extends User {
	private String dateCreated;

	public Customer() {
		super();
	}

	public Customer(String userID, String username, String password,String dateCreated) {
		super(userID, username, password);
		this.dateCreated = dateCreated;
		
	}

	public String getDateCreated() {
		return dateCreated;
	}

	public void setDateCreated(String dateCreated) {
		this.dateCreated = dateCreated;
	}
	
}
