package com.infosys.hackathon.services.directory;

import java.util.Map;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.infosys.hackathon.services.JsonData;

@JsonIgnoreProperties(ignoreUnknown = true)
public class EmployeeDirectoryInformation implements JsonData {

	private int empNo;
	private String firstName;
	private String lastName;
	@JsonProperty("phones")
	private Map<String, String> phones;
	@JsonProperty("emails")
	private Map<String, String> emails;
	private String unit;
	private String designation;
	private int officeId;

	enum PhoneNumberType {
		Home, Mobile, Office
	}

	enum EmailType {
		Main, Client
	}

	public EmployeeDirectoryInformation() {
	}

	public int getEmpNo() {
		return empNo;
	}

	public void setEmpNo(int empNo) {
		this.empNo = empNo;
	}

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

	public Map<String, String> getPhones() {
		return phones;
	}

	public void setPhones(Map<String, String> phones) {
		this.phones = phones;
	}

	public Map<String, String> getEmails() {
		return emails;
	}

	public void setEmails(Map<String, String> emails) {
		this.emails = emails;
	}

	public String getUnit() {
		return unit;
	}

	public void setUnit(String unit) {
		this.unit = unit;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public int getOfficeId() {
		return officeId;
	}

	public void setOfficeId(int officeId) {
		this.officeId = officeId;
	}

	public String getPhoneNumber(PhoneNumberType type) {
		return this.phones.get(type);
	}

	public String getEmail(EmailType type) {
		return this.emails.get(type);
	}

	@Override
	public String toString() {
		return "EmployeDirectoryInformation [empNo=" + empNo + ", emails="
			+ emails + ", officeId=" + officeId + "]";
	}
}