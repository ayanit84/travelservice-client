package com.infosys.hackathon.services;

public class ServiceResponse {
	private ResultCodes result;

	public ServiceResponse() {

	}

	public ServiceResponse(ResultCodes result) {
		this.result = result;
	}

	public ResultCodes getResult() {
		return result;
	}

	public void setResult(ResultCodes result) {
		this.result = result;
	}

}
