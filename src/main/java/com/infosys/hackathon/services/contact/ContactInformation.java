package com.infosys.hackathon.services.contact;

import java.util.Map;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.infosys.hackathon.services.JsonData;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ContactInformation implements JsonData {
	
	private String country;
	private int countryHead;
	private int bphr;
	@JsonProperty("serviceDesk")
	private Map<String, String> serviceDesk;
	@JsonProperty("emergencyContacts")
	private Map<String, String> emergencyContacts;
	@JsonProperty("incidentReporting")
	private Map<String, String> incidentReporting;
	
	enum ServiceDeskType {
		GlobalSupportOld, ReachableOld, GlobalSupportInfy, ReachableInfy;
	}
	
	enum EmergencyContactType {
		Ambulance, Police, FireBridge, Hospitals, localDialingCode;
	}
	
	enum IncidentReportingType {
		ItSecurityRelated, PhysicalSecurityRelated, PeopleRelated;
	}
	
	public ContactInformation() {
	}	
	
	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public int getCountryHead(){
		return countryHead;
	}
	
	public void setCountryHead(int countryHead){
		this.countryHead = countryHead;
	}
	
	public int getbphr(){
		return bphr;
	}
	
	public void setbphr(int bphr){
		this.bphr = bphr;
	}
	
	public Map<String, String> getServiceDesk() {
		return serviceDesk;
	}

	public void setServiceDesk(Map<String, String> serviceDesk) {
		this.serviceDesk = serviceDesk;
	}

	public Map<String, String> getEmergencyContacts() {
		return emergencyContacts;
	}

	public void setEmergencyContacts(Map<String, String> emergencyContacts) {
		this.emergencyContacts = emergencyContacts;
	}
	
	public Map<String, String> getIncidentReporting() {
		return incidentReporting;
	}

	public void setIncidentReporting(Map<String, String> incidentReporting) {
		this.incidentReporting = incidentReporting;
	}
	
	public String getSerDesk(ServiceDeskType type) {
		return this.serviceDesk.get(type);
	}

	public String getEmergencyCont(EmergencyContactType type) {
		return this.emergencyContacts.get(type);
	}
	
	public String getIncidentRep(IncidentReportingType type) {
		return this.incidentReporting.get(type);
	}

	@Override
	public String toString() {
		return "ContactInformation [country=" + country + ", countryHead="
				+ countryHead + ", bphr=" + bphr + ", serviceDesk="
				+ serviceDesk + ", emergencyContacts=" + emergencyContacts
				+ ", incidentReporting=" + incidentReporting + "]";
	}
	
	
}
