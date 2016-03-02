package com.infosys.hackathon.services.directory.dto;

public enum SearchParameter {
	Country("country"), State("state"), City("city"), officeId("office"), EmpId(
			"empid") , JobLevel("jobLevel");

	private String key;

	private SearchParameter(String keyValue) {
		this.key = keyValue;
	}

	public String getKey() {
		return key;
	}
}
