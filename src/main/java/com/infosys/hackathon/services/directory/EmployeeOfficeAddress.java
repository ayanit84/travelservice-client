package com.infosys.hackathon.services.directory;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.infosys.hackathon.services.JsonData;

@JsonIgnoreProperties(ignoreUnknown = true)
public class EmployeeOfficeAddress implements JsonData {

	private int officeId;
	private String addressLine;
	private String city;
	private String state;
	private String country;

	@JsonProperty("zip")
	private int pincode;

	public EmployeeOfficeAddress() {
		// TODO Auto-generated constructor stub
	}

	public EmployeeOfficeAddress(int officeId, String addressLine, String city,
			String state, String country, int pincode) {
		this.officeId = officeId;
		this.addressLine = addressLine;
		this.city = city;
		this.state = state;
		this.country = country;
		this.pincode = pincode;
	}

	public int getOfficeId() {
		return officeId;
	}

	public void setOfficeId(int officeId) {
		this.officeId = officeId;
	}

	public String getAddressLine() {
		return addressLine;
	}

	public void setAddressLine(String addressLine) {
		this.addressLine = addressLine;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public int getPincode() {
		return pincode;
	}

	public void setPincode(int pincode) {
		this.pincode = pincode;
	}

	@Override
	public String toString() {
		return "EmployeeOfficeAddress [officeId=" + officeId + ", city=" + city
				+ ", country=" + country + "]";
	}

}
