package com.infosys.hackathon.services.policy;

import com.infosys.hackathon.services.JsonData;

public class EligibilityInformation implements JsonData {

	private String country;
	private String jobLevel;
	private Integer childEducationReimburse;
	private Integer medicalExpenseReimburse;
	private Integer leave;
	private Integer compensation;

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

	public Integer getChildEducationReimburse() {
		return childEducationReimburse;
	}

	public void setChildEducationReimburse(Integer childEducationReimburse) {
		this.childEducationReimburse = childEducationReimburse;
	}

	public Integer getMedicalExpenseReimburse() {
		return medicalExpenseReimburse;
	}

	public void setMedicalExpenseReimburse(Integer medicalExpenseReimburse) {
		this.medicalExpenseReimburse = medicalExpenseReimburse;
	}

	public Integer getLeave() {
		return leave;
	}

	public void setLeave(Integer leave) {
		this.leave = leave;
	}

	public Integer getCompensation() {
		return compensation;
	}

	public void setCompensation(Integer compensation) {
		this.compensation = compensation;
	}

	public EligibilityInformation(String country, String jobLevel,
			Integer childEducationReimburse, Integer medicalExpenseReimburse,
			Integer leave, Integer compensation) {
		super();
		this.country = country;
		this.jobLevel = jobLevel;
		this.childEducationReimburse = childEducationReimburse;
		this.medicalExpenseReimburse = medicalExpenseReimburse;
		this.leave = leave;
		this.compensation = compensation;
	}

	public EligibilityInformation() {
		super();
	}

	@Override
	public String toString() {
		return "EligibilityInformation [country=" + country + ", jobLevel="
				+ jobLevel + ", childEducationReimburse="
				+ childEducationReimburse + ", medicalExpenseReimburse="
				+ medicalExpenseReimburse + ", leave=" + leave
				+ ", compensation=" + compensation + "]";
	}

}
