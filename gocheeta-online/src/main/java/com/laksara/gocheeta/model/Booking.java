package com.laksara.gocheeta.model;

public class Booking {
	private String bookingID;
	private String driverID;
	private String numberPlate;
	private String source;
	private String destination;
	private double fixedCost;
	private double journeyCost;
	private double totalCost;
	private String feedback;
	
	public Booking() {

	}

	public Booking(String bookingID, String driverID, String numberPlate, String source, String destination,
			double fixedCost, double journeyCost, String feedback) {
		super();
		this.bookingID = bookingID;
		this.driverID = driverID;
		this.numberPlate = numberPlate;
		this.source = source;
		this.destination = destination;
		this.fixedCost = fixedCost;
		this.journeyCost = journeyCost;
		this.feedback = feedback;
	}

	public String getBookingID() {
		return bookingID;
	}

	public void setBookingID(String bookingID) {
		this.bookingID = bookingID;
	}

	public String getDriverID() {
		return driverID;
	}

	public void setDriverID(String driverID) {
		this.driverID = driverID;
	}

	public String getNumberPlate() {
		return numberPlate;
	}

	public void setNumberPlate(String numberPlate) {
		this.numberPlate = numberPlate;
	}

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public double getFixedCost() {
		return fixedCost;
	}

	public void setFixedCost(double fixedCost) {
		this.fixedCost = fixedCost;
	}

	public double getJourneyCost() {
		return journeyCost;
	}

	public void setJourneyCost(double journeyCost) {
		this.journeyCost = journeyCost;
	}

	public String getFeedback() {
		return feedback;
	}

	public void setFeedback(String feedback) {
		this.feedback = feedback;
	}
	
	public void calculateCost() {
		totalCost = fixedCost + journeyCost;
	}
	
	public double getTotalCost() {
		return totalCost;
	}
	
	
}
