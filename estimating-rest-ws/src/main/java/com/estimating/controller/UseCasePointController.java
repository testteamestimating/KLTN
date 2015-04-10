package com.estimating.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.estimating.bean.WusWeightBean;
import com.estimating.service.IUseCasePointService;

@RestController
@RequestMapping("/usecasepoint")
public class UseCasePointController {
	@Autowired IUseCasePointService useCasePointService;
	
	@RequestMapping(value = "/calWusWeight", method = RequestMethod.POST)
	public double showUser(@RequestBody WusWeightBean wusWeightBean) {
		return useCasePointService.calWusWeight(wusWeightBean);
	}
}
