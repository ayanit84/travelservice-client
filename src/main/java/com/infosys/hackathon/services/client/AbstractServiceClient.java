package com.infosys.hackathon.services.client;

import org.springframework.web.client.RestTemplate;

import com.infosys.hackathon.services.ServiceRequest;
import com.infosys.hackathon.services.ServiceResponse;

public abstract class AbstractServiceClient<T extends ServiceRequest, V extends ServiceResponse>
	implements ServiceClient<T, V> {

	private RestTemplate restTemplate;

	public AbstractServiceClient() {
		restTemplate = new RestTemplate();
	}

	public RestTemplate getRestTemplate() {
		return restTemplate;
	}
}
