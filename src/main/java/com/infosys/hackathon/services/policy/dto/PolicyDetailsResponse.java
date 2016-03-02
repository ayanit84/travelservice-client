package com.infosys.hackathon.services.policy.dto;

import java.util.List;

import com.infosys.hackathon.services.ServiceResponse;
import com.infosys.hackathon.services.policy.EligibilityInformation;

public class PolicyDetailsResponse extends ServiceResponse {
	
	private List<EligibilityInformation> eligibilityDetails;

	public List<EligibilityInformation> getEligibilityDetails() {
		return eligibilityDetails;
	}

	public void setEligibilityDetails(
			List<EligibilityInformation> eligibilityDetails) {
		this.eligibilityDetails = eligibilityDetails;
	}
	
	
	

}
