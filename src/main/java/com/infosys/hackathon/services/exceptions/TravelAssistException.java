package com.infosys.hackathon.services.exceptions;

public class TravelAssistException extends Exception {
	private static final long serialVersionUID = 1L;
	private String errorMessage;

	public TravelAssistException(String message) {
		this.errorMessage = message;
	}

	@Override
	public String getMessage() {
		return this.errorMessage;
	}

}
