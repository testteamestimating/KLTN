package com.estimating.ws.rest;

import com.estimating.bean.WusWeightBean;

public class UseCasePointRestWSImpl extends AbstractRestService implements IUseCasePointRestWS {
	
	@Override
	public double calWusWeight(WusWeightBean wusWeightBean) {
		String url = urlUseCasePoint + "calWusWeight";
		Double result = restTemplate.postForObject(url, wusWeightBean, Double.class);
		return result;
	}
	
}
