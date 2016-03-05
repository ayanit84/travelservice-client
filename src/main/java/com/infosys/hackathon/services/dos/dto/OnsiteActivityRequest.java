package com.infosys.hackathon.services.dos.dto;

import java.util.HashMap;
import java.util.Map;

import org.apache.commons.lang3.StringUtils;

import com.infosys.hackathon.services.ServiceRequest;
import com.infosys.hackathon.services.directory.dto.SearchParameter;

public class OnsiteActivityRequest implements ServiceRequest {

	private String country;

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public OnsiteActivityRequest(String country) {
		super();
		this.country = country;
	}

	public OnsiteActivityRequest() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "OnsiteActivityRequest [country=" + country + "]";
	}

	public Map<String, Object> getRequestMap() {
		Map<String, Object> params = new HashMap<String, Object>();

		if (!StringUtils.isEmpty(country)) {
			params.put(SearchParameter.Country.getKey(), country);
		}

		return params;

	}

}
