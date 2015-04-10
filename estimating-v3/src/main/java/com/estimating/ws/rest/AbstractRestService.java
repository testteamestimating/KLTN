package com.estimating.ws.rest;

import org.springframework.web.client.RestTemplate;

public class AbstractRestService {
	protected String urlUseCasePoint = "http://localhost:8080/estimating-rest-ws/usecasepoint/";
	RestTemplate restTemplate;

	/**
	 * @return the restTemplate
	 */
	public RestTemplate getRestTemplate() {
		return restTemplate;
	}

	/**
	 * @param restTemplate
	 *            the restTemplate to set
	 */
	public void setRestTemplate(RestTemplate restTemplate) {
		this.restTemplate = restTemplate;
	}
}
