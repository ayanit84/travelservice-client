package com.infosys.hackathon.services.policy.dto;

import com.infosys.hackathon.services.ServiceResponse;
import com.infosys.hackathon.services.policy.EligibilityInformation;

public class PolicyDetailsResponse extends ServiceResponse {
	
	private EligibilityInformation eligibilityDetails;

	public EligibilityInformation getEligibilityDetails() {
		return eligibilityDetails;
	}

	public void setEligibilityDetails(EligibilityInformation eligibilityDetails) {
		this.eligibilityDetails = eligibilityDetails;
	}

}
