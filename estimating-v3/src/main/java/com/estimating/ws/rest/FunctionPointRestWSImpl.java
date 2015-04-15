package com.estimating.ws.rest;

import com.estimating.bean.EiWeightBean;
import com.estimating.bean.EifWeightBean;
import com.estimating.bean.EoWeightBean;
import com.estimating.bean.EqWeightBean;
import com.estimating.bean.FunctionPointBean;
import com.estimating.bean.IlfWeightBean;
import com.estimating.bean.VafWeightBean;

public class FunctionPointRestWSImpl extends AbstractRestService implements IFunctionPointRestWS {

	@Override
	public double calEiWeight(EiWeightBean eiWeightBean) {
		String url = urlFunctionPoint + "calEiWeight";
		Double result = restTemplate.postForObject(url, eiWeightBean, Double.class);
		return result;
	}

	@Override
	public double calEoWeight(EoWeightBean eoWeightBean) {
		String url = urlFunctionPoint + "calEoWeight";
		Double result = restTemplate.postForObject(url, eoWeightBean, Double.class);
		return result;
	}

	@Override
	public double calEqWeight(EqWeightBean eqWeightBean) {
		String url = urlFunctionPoint + "calEqWeight";
		Double result = restTemplate.postForObject(url, eqWeightBean, Double.class);
		return result;
	}

	@Override
	public double calEifWeight(EifWeightBean eifWeightBean) {
		String url = urlFunctionPoint + "calEifWEight";
		Double result = restTemplate.postForObject(url, eifWeightBean, Double.class);
		return result;
	}

	@Override
	public double calIlfWeight(IlfWeightBean ilfWeightBean) {
		String url = urlFunctionPoint + "calIlfWeight";
		Double result = restTemplate.postForObject(url, ilfWeightBean, Double.class);
		return result;
	}

	@Override
	public double calVafWeight(VafWeightBean vafWeightBean) {
		String url = urlFunctionPoint + "calVafWeight";
		Double result = restTemplate.postForObject(url, vafWeightBean, Double.class);
		return result;
	}

	@Override
	public double calTotalPoint(FunctionPointBean functionPointBean) {
		String url = urlFunctionPoint + "calTotalPoint";
		Double result = restTemplate.postForObject(url, functionPointBean, Double.class);
		return result;
	}

	@Override
	public double calTotalHour(FunctionPointBean functionPointBean) {
		String url = urlFunctionPoint + "calTotalHour";
		Double result = restTemplate.postForObject(url, functionPointBean, Double.class);
		return result;
	}

	@Override
	public double calTotalCost(FunctionPointBean functionPointBean) {
		String url = urlFunctionPoint + "calTotalCost";
		Double result = restTemplate.postForObject(url, functionPointBean, Double.class);
		return result;
	}
	
	
}
