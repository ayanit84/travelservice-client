package com.infosys.hackathon.services.country;

import java.util.List;

import com.infosys.hackathon.services.JsonData;

public class CountryDetails implements JsonData {

	private String code;
	private String name;
	private List<StateDetails> states;

	public CountryDetails() {
	}

	public CountryDetails(String code, String name) {
		this.code = code;
		this.name = name;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<StateDetails> getStates() {
		return states;
	}

	public void setStates(List<StateDetails> states) {
		this.states = states;
	}

	@Override
	public String toString() {
		return "CountryDetails [code=" + code + ", name=" + name + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((code == null) ? 0 : code.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CountryDetails other = (CountryDetails) obj;
		if (code == null) {
			if (other.code != null)
				return false;
		} else if (!code.equals(other.code))
			return false;
		return true;
	}

}
