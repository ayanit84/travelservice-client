package com.infosys.hackathon.services.contact;

import java.util.List;

import com.infosys.hackathon.services.ServiceResponse;
import com.infosys.hackathon.services.contact.ContactInformation;
import com.infosys.hackathon.services.directory.EmployeeDirectoryInformation;

public class SearchResponse extends ServiceResponse {
	private ContactInformation country;
	private EmployeeDirectoryInformation bphr;
	private EmployeeDirectoryInformation countryHead;
	
	public SearchResponse() {
	}
	
	public EmployeeDirectoryInformation getBphr() {
		return bphr;
	}

	public void setBphr(EmployeeDirectoryInformation bphr) {
		this.bphr = bphr;
	}

	public EmployeeDirectoryInformation getCountryHead() {
		return countryHead;
	}

	public void setCountryHead(EmployeeDirectoryInformation countryHead) {
		this.countryHead = countryHead;
	}

	public ContactInformation getCountry() {
		return country;
	}

	public void setCountry(ContactInformation country) {
		this.country = country;
	}
	
	
}
