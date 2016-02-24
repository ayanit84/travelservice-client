package com.infosys.hackathon.services.directory;

public class EmployeDirectoryInfo {
	private String firstName;
	private String lastName;
	private String mobileNo;
	private String emailAddress;

	// TODO
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	@Override
	public String toString() {
		return "EmployeDirectoryInfo [mobileNo=" + mobileNo + ", emailAddress="
			+ emailAddress + "]";
	}

}
