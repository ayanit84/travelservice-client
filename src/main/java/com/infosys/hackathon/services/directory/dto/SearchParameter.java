package com.infosys.hackathon.services.directory.dto;

public enum SearchParameter {
	Country("country"), State("state"), City("city");
	private String key;

	private SearchParameter(String keyValue) {
		this.key = keyValue;
	}

	public String getKey() {
		return key;
	}
}
