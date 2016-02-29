package com.infosys.hackathon.services.directory.dto;

import java.util.HashMap;
import java.util.Map;

import org.apache.commons.lang3.StringUtils;

public class SearchRequest {
	private String country;
	private String state;
	private String city;

	public SearchRequest() {
	}

	public SearchRequest(String country, String state, String city) {
		this.country = country;
		this.state = state;
		this.city = city;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Override
	public String toString() {
		return "SearchRequest [country=" + country + ", state=" + state
				+ ", city=" + city + "]";
	}

	public Map<String, Object> getMap() {
		Map<String, Object> params = new HashMap<String, Object>();
		if (StringUtils.isEmpty(this.country)) {
			params.put(SearchParameter.Country.getKey(), getCountry());
		}
		if (StringUtils.isEmpty(this.state)) {
			params.put(SearchParameter.State.getKey(), getState());
		}
		if (StringUtils.isEmpty(this.city)) {
			params.put(SearchParameter.City.getKey(), getCity());
		}
		return params;

	}

}
