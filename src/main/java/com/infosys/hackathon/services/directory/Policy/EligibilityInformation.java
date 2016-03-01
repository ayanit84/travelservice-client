package com.infosys.hackathon.services.directory.Policy;

import com.infosys.hackathon.services.JsonData;

public class EligibilityInformation implements JsonData {

	private Integer childEducationReimburse;
	private Integer medicalExpenseReimburse;
	private Integer leave;
	private Integer compensation;

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

	public EligibilityInformation(Integer childEducationReimburse,
			Integer medicalExpenseReimburse, Integer leave, Integer compensation) {
		super();
		this.childEducationReimburse = childEducationReimburse;
		this.medicalExpenseReimburse = medicalExpenseReimburse;
		this.leave = leave;
		this.compensation = compensation;
	}

	@Override
	public String toString() {
		return "EligibilityInformation [childEducationReimburse="
				+ childEducationReimburse + ", medicalExpenseReimburse="
				+ medicalExpenseReimburse + ", leave=" + leave
				+ ", compensation=" + compensation + "]";
	}

}
