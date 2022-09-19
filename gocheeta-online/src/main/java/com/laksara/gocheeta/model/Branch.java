package com.laksara.gocheeta.model;

public class Branch {
	private String branchID;
	private String branchName;
	
	public Branch() {

	}

	public Branch(String branchID, String branchName) {
		super();
		this.branchID = branchID;
		this.branchName = branchName;
	}

	public String getBranchID() {
		return branchID;
	}

	public void setBranchID(String branchID) {
		this.branchID = branchID;
	}

	public String getBranchName() {
		return branchName;
	}

	public void setBranchName(String branchName) {
		this.branchName = branchName;
	}
	
	
}
