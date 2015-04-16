package com.estimating.ws.rest;

import com.estimating.bean.EfcWeightBean;
import com.estimating.bean.TcfWeightBean;
import com.estimating.bean.UsecasePointBean;
import com.estimating.bean.WasWeightBean;
import com.estimating.bean.WusWeightBean;

public class UseCasePointRestWSImpl extends AbstractRestService implements IUseCasePointRestWS {
	
	@Override
	public double calWusWeight(WusWeightBean wusWeightBean) {
		String url = urlUseCasePoint + "calWusWeight";
		Double result = restTemplate.postForObject(url, wusWeightBean, Double.class);
		return result;
	}

	@Override
	public double calWasWeight(WasWeightBean wasWeightBean) {
		String url = urlUseCasePoint + "calWasWeight";
		Double result = restTemplate.postForObject(url, wasWeightBean, Double.class);
		return result;
	}

	@Override
	public double calEfcWeight(EfcWeightBean efcWeightBean) {
		String url = urlUseCasePoint + "calEfcWeight";
		Double result = restTemplate.postForObject(url, efcWeightBean, Double.class);
		return result;
	}

	@Override
	public double calTcfWeight(TcfWeightBean tcfWeightBean) {
		String url = urlUseCasePoint + "calTcfWeight";
		Double result = restTemplate.postForObject(url, tcfWeightBean, Double.class);
		return result;
	}

	@Override
	public double calTotalPoint(UsecasePointBean usecasePointBean) {
		String url = urlUseCasePoint + "calTotalPoint";
		Double result = restTemplate.postForObject(url, usecasePointBean, Double.class);
		return result;
	}


	@Override
	public double calTotalHour(UsecasePointBean usecasePointBean) {
		String url = urlUseCasePoint + "calTotalHour";
		Double result = restTemplate.postForObject(url, usecasePointBean, Double.class);
		return result;
	}

	@Override
	public double calTotalCost(UsecasePointBean usecasePointBean) {
		String url = urlUseCasePoint + "calTotalCost";
		Double result = restTemplate.postForObject(url, usecasePointBean, Double.class);
		return result;
	}	
}
