package com.infosys.hackathon.services.directory.dto;

import java.util.List;

import com.infosys.hackathon.services.ServiceResponse;
import com.infosys.hackathon.services.directory.EmployeDirectoryInformation;

public class SearchResponse extends ServiceResponse {
	private List<EmployeDirectoryInformation> employees;

	public SearchResponse() {
	}

	public List<EmployeDirectoryInformation> getEmployees() {
		return employees;
	}

	public void setEmployees(List<EmployeDirectoryInformation> employees) {
		this.employees = employees;
	}
}
