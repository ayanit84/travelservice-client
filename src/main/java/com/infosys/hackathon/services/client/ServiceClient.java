package com.infosys.hackathon.services.client;

import com.infosys.hackathon.services.ServiceRequest;
import com.infosys.hackathon.services.ServiceResponse;
import com.infosys.hackathon.services.exceptions.TravelServiceException;

public interface ServiceClient<T extends ServiceRequest, V extends ServiceResponse> {
	public String getServiceName();

	public V getRequest(Class<V> responseType) throws TravelServiceException;

	public V postRequest(T request, Class<V> responseType)
			throws TravelServiceException;
}
