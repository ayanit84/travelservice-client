package com.infosys.hackathon.services.directory.dto;

import java.util.List;

import com.infosys.hackathon.services.ServiceResponse;
import com.infosys.hackathon.services.directory.EmployeeDirectoryInformation;

public class SearchResponse extends ServiceResponse {
	private List<EmployeeDirectoryInformation> employees;

	public SearchResponse() {
	}

	public List<EmployeeDirectoryInformation> getEmployees() {
		return employees;
	}

	public void setEmployees(List<EmployeeDirectoryInformation> employees) {
		this.employees = employees;
	}
}
