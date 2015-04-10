package com.estimating.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.estimating.bean.EiWeightBean;
import com.estimating.bean.EifWeightBean;
import com.estimating.bean.EoWeightBean;
import com.estimating.bean.EqWeightBean;
import com.estimating.bean.FunctionPointBean;
import com.estimating.bean.IlfWeightBean;
import com.estimating.bean.VafWeightBean;
import com.estimating.service.IFunctionPointService;

@RestController
@RequestMapping("/funtionpoint")
public class FunctionPointController {
	@Autowired IFunctionPointService FunctionPointService;
	
	@RequestMapping(value="/calEiWeight", method = RequestMethod.POST)
	public double calEiWeight(EiWeightBean eiWeightBean) {
		return FunctionPointService.calEiWeight(eiWeightBean);
	}
	
	@RequestMapping(value="/calEifWEight", method = RequestMethod.POST)
	public double calEifWEight(EifWeightBean eifWeightBean) {
		return FunctionPointService.calEifWeight(eifWeightBean);
	}
	
	@RequestMapping(value="/calEoWeight", method = RequestMethod.POST)
	public double calEoWeight(EoWeightBean eoWeightBean) {
		return FunctionPointService.calEoWeight(eoWeightBean);
	}
	
	@RequestMapping(value="/calEqWeight", method = RequestMethod.POST)
	public double calEqWeight(EqWeightBean eqWeightBean) {
		return FunctionPointService.calEqWeight(eqWeightBean);
	}
	
	@RequestMapping(value="/calIlfWeight", method = RequestMethod.POST)
	public double calIlfWeight(IlfWeightBean ilfWeightBean) {
		return FunctionPointService.calIlfWeight(ilfWeightBean);
	}
	
	@RequestMapping(value="/calVafWeight", method = RequestMethod.POST)
	public double calVafWeight(VafWeightBean vafWeightBean) {
		return FunctionPointService.calVafWeight(vafWeightBean);
	}
	
	@RequestMapping(value="/calTotalPoint", method = RequestMethod.POST)
	public double calTotalPoint(FunctionPointBean functionPointBean) {
		return FunctionPointService.calTotalPoint(functionPointBean);
	}
	
	@RequestMapping(value="/calTotalHour", method = RequestMethod.POST)
	public double calTotalHour(FunctionPointBean functionPointBean) {
		return FunctionPointService.calTotalHour(functionPointBean);
	}
	
	@RequestMapping(value="/calTotalCost", method = RequestMethod.POST)
	public double calTotalCost(FunctionPointBean functionPointBean) {
		return FunctionPointService.calTotalCost(functionPointBean);
	}
	
}
