package com.infosys.hackathon.services.policy.dto;

import java.util.HashMap;
import java.util.Map;

import org.apache.commons.lang3.StringUtils;

import com.infosys.hackathon.services.ServiceRequest;
import com.infosys.hackathon.services.directory.dto.SearchParameter;

public class PolicyDetailsRequest implements ServiceRequest {

	private String country;
	private String jobLevel;

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getJobLevel() {
		return jobLevel;
	}

	public void setJobLevel(String jobLevel) {
		this.jobLevel = jobLevel;
	}

	public PolicyDetailsRequest() {
		super();
	}

	public PolicyDetailsRequest(String country, String jobLevel) {
		super();
		this.country = country;
		this.jobLevel = jobLevel;
	}

	@Override
	public String toString() {
		return "GetPolicyDetailsRequest [country=" + country + ", jobLevel="
				+ jobLevel + "]";
	}

	public Map<String, Object> getRequestMap() {
		Map<String, Object> params = new HashMap<String, Object>();

		if (!StringUtils.isEmpty(country)) {
			params.put(SearchParameter.Country.getKey(), country);
		}

		if (!StringUtils.isEmpty(jobLevel)) {
			params.put(SearchParameter.JobLevel.getKey(), jobLevel);
		}

		return params;

	}

}
