package com.laksara.gocheeta.model;

public class Administrator extends User {
	private boolean admin;

	public Administrator() {
		super();

	}

	public Administrator(String userID, String username, String password,boolean admin) {
		super(userID, username, password);
		this.admin = admin;
	}

	public boolean getAdmin() {
		return admin;
	}

	public void setAdmin(boolean admin) {
		this.admin = admin;
	}
	
	
	
	
}
