package com.infosys.hackathon.services.country.dto;

import java.util.List;

import com.infosys.hackathon.services.KeyValuePair;
import com.infosys.hackathon.services.ServiceResponse;

public class CountryServiceResponse extends ServiceResponse {
	private List<KeyValuePair> details;

	public List<KeyValuePair> getDetails() {
		return details;
	}

	public void setDetails(List<KeyValuePair> details) {
		this.details = details;
	}

}
