package com.infosys.hackathon.services.directory.dto;

import java.util.List;

import com.infosys.hackathon.services.ServiceResponse;
import com.infosys.hackathon.services.directory.EmployeDirectoryInfo;

public class SearchResponse extends ServiceResponse {
	private List<EmployeDirectoryInfo> employees;

	public SearchResponse() {
	}

	public List<EmployeDirectoryInfo> getEmployees() {
		return employees;
	}

	public void setEmployees(List<EmployeDirectoryInfo> employees) {
		this.employees = employees;
	}
}
