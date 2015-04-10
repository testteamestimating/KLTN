package com.estimating.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.estimating.bean.EfcWeightBean;
import com.estimating.bean.TcfWeightBean;
import com.estimating.bean.UsecasePointBean;
import com.estimating.bean.WasWeightBean;
import com.estimating.bean.WusWeightBean;
import com.estimating.service.IUseCasePointService;

@RestController
@RequestMapping("/usecasepoint")
public class UseCasePointController {
	@Autowired IUseCasePointService useCasePointService;
	
	@RequestMapping(value = "/calWusWeight", method = RequestMethod.POST)
	public double calWusWeight(@RequestBody WusWeightBean wusWeightBean) {
		return useCasePointService.calWusWeight(wusWeightBean);
	}
	
	@RequestMapping(value = "/calWssWeight", method = RequestMethod.POST)
	public double calWssWeight(@RequestBody WasWeightBean wasWeightBean) {
		return useCasePointService.calWasWeight(wasWeightBean);
	}
	
	@RequestMapping(value = "/calTcfWeight", method = RequestMethod.POST)
	public double calTcfWeight(@RequestBody TcfWeightBean tcfWeightBean) {
		return useCasePointService.calTcfWeight(tcfWeightBean);
	}
	
	@RequestMapping(value = "/calEfcWeight", method = RequestMethod.POST)
	public double calEfcWeight(@RequestBody EfcWeightBean efcWeightBean) {
		return useCasePointService.calEfcWeight(efcWeightBean);
	}
	
	@RequestMapping(value = "/calTotalPoint", method = RequestMethod.POST)
	public double calTotalPoint(@RequestBody UsecasePointBean usecasePointBean) {
		return useCasePointService.calTotalPoint(usecasePointBean);
	}
	
	@RequestMapping(value = "/calTotalHour", method = RequestMethod.POST)
	public double calTotalHour(@RequestBody UsecasePointBean usecasePointBean) {
		return useCasePointService.calTotalHour(usecasePointBean);
	}
	
	@RequestMapping(value = "/calTotalCost", method = RequestMethod.POST)
	public double calTotalCost(@RequestBody UsecasePointBean usecasePointBean) {
		return useCasePointService.calTotalCost(usecasePointBean);
	}
	
	
}
