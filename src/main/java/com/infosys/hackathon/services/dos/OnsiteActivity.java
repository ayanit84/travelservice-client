package com.infosys.hackathon.services.dos;

import com.infosys.hackathon.services.JsonData;

public class OnsiteActivity implements JsonData {

	private String country;
	private Boolean i9SectionCompleted = false;
	private Boolean panApplied = false;
	private Boolean bankAccountCreated = false;
	private Boolean aimsUpdated = false;
	private Boolean ssnApplied = false;
	private Boolean payworldUpdated = false;
	private Boolean enrolledForBenefits = false;
	private Boolean manadatoryTrainingAttended = false;

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public Boolean getI9SectionCompleted() {
		return i9SectionCompleted;
	}

	public void setI9SectionCompleted(Boolean i9SectionCompleted) {
		this.i9SectionCompleted = i9SectionCompleted;
	}

	public Boolean getPanApplied() {
		return panApplied;
	}

	public void setPanApplied(Boolean panApplied) {
		this.panApplied = panApplied;
	}

	public Boolean getBankAccountCreated() {
		return bankAccountCreated;
	}

	public void setBankAccountCreated(Boolean bankAccountCreated) {
		this.bankAccountCreated = bankAccountCreated;
	}

	public Boolean getAimsUpdated() {
		return aimsUpdated;
	}

	public void setAimsUpdated(Boolean aimsUpdated) {
		this.aimsUpdated = aimsUpdated;
	}

	public Boolean getSsnApplied() {
		return ssnApplied;
	}

	public void setSsnApplied(Boolean ssnApplied) {
		this.ssnApplied = ssnApplied;
	}

	public Boolean getPayworldUpdated() {
		return payworldUpdated;
	}

	public void setPayworldUpdated(Boolean payworldUpdated) {
		this.payworldUpdated = payworldUpdated;
	}

	public Boolean getEnrolledForBenefits() {
		return enrolledForBenefits;
	}

	public void setEnrolledForBenefits(Boolean enrolledForBenefits) {
		this.enrolledForBenefits = enrolledForBenefits;
	}

	public Boolean getManadatoryTrainingAttended() {
		return manadatoryTrainingAttended;
	}

	public void setManadatoryTrainingAttended(Boolean manadatoryTrainingAttended) {
		this.manadatoryTrainingAttended = manadatoryTrainingAttended;
	}

	public OnsiteActivity(String country, Boolean i9SectionCompleted, Boolean panApplied, Boolean bankAccountCreated,
			Boolean aimsUpdated, Boolean ssnApplied, Boolean payworldUpdated, Boolean enrolledForBenefits,
			Boolean manadatoryTrainingAttended) {
		super();
		this.country = country;
		this.i9SectionCompleted = i9SectionCompleted;
		this.panApplied = panApplied;
		this.bankAccountCreated = bankAccountCreated;
		this.aimsUpdated = aimsUpdated;
		this.ssnApplied = ssnApplied;
		this.payworldUpdated = payworldUpdated;
		this.enrolledForBenefits = enrolledForBenefits;
		this.manadatoryTrainingAttended = manadatoryTrainingAttended;
	}

	public OnsiteActivity() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "OnsiteActivity [country=" + country + ", i9SectionCompleted=" + i9SectionCompleted + ", panApplied="
				+ panApplied + ", bankAccountCreated=" + bankAccountCreated + ", aimsUpdated=" + aimsUpdated
				+ ", ssnApplied=" + ssnApplied + ", payworldUpdated=" + payworldUpdated + ", enrolledForBenefits="
				+ enrolledForBenefits + ", manadatoryTrainingAttended=" + manadatoryTrainingAttended + "]";
	}

}
