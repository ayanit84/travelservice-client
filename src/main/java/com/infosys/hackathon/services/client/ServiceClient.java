package com.infosys.hackathon.services.client;

import com.infosys.hackathon.services.ServiceRequest;
import com.infosys.hackathon.services.ServiceResponse;

public interface ServiceClient<T extends ServiceRequest, V extends ServiceResponse> {
	public String getServiceUrl();

	public V getRequest(Class<V> responseType);

	public V postRequest(T request, Class<V> responseType);
}
