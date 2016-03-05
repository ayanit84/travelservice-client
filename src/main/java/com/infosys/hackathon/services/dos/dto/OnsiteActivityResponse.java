package com.infosys.hackathon.services.dos.dto;

import com.infosys.hackathon.services.ResultCodes;
import com.infosys.hackathon.services.ServiceResponse;
import com.infosys.hackathon.services.dos.OnsiteActivity;

public class OnsiteActivityResponse extends ServiceResponse {

	private OnsiteActivity onsiteActivity;

	public OnsiteActivity getOnsiteActivity() {
		return onsiteActivity;
	}

	public void setOnsiteActivity(OnsiteActivity onsiteActivity) {
		this.onsiteActivity = onsiteActivity;
	}

	public OnsiteActivityResponse(OnsiteActivity onsiteActivity) {
		super();
		this.onsiteActivity = onsiteActivity;
	}

	public OnsiteActivityResponse() {
		super();
		// TODO Auto-generated constructor stub
	}

	public OnsiteActivityResponse(ResultCodes result) {
		super(result);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "OnsiteActivityResponse [onsiteActivity=" + onsiteActivity + "]";
	}

}
