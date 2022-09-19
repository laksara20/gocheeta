package com.laksara.gocheeta.model;

public class UserFactory {
	public User getUser(String userType) {
		
		if(userType.equalsIgnoreCase("Customer"))
			return new Customer();
		else if(userType.equalsIgnoreCase("Administrator"))
			return new Administrator();
		else if(userType.equalsIgnoreCase("Driver"))
			return new Driver();
		else
			return null;

		
	}
}
