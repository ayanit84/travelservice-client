package com.infosys.hackathon.services.contact;

import com.infosys.hackathon.services.ServiceResponse;
import com.infosys.hackathon.services.contact.ContactInformation;

public class SearchResponse extends ServiceResponse {
	private ContactInformation country;

	public SearchResponse() {
	}

	public ContactInformation getCountry() {
		return country;
	}

	public void setCountry(ContactInformation country) {
		this.country = country;
	}
}
