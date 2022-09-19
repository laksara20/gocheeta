package com.laksara.gocheeta.model;

public class Driver extends User {
	private char gender;
	private int age;
	private String phoneNumber;
	private String numberPlate;
	
	public Driver() {
		super();

	}
	public Driver(String userID, String username, String password, char gender, int age, String phoneNumber, String numberPlate) {
		super(userID, username, password);
		this.gender = gender;
		this.age = age;
		this.phoneNumber = phoneNumber;
		this.numberPlate = numberPlate;

	}
	
	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getNumberPlate() {
		return numberPlate;
	}
	public void setNumberPlate(String numberPlate) {
		this.numberPlate = numberPlate;
	}
	
	
	
	
	
}
