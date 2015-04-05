package com.estimating.controller;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class NavigationController {
	private static final Logger logger = Logger.getLogger(NavigationController.class);
	
	@RequestMapping(value = "/homepage", method = RequestMethod.GET)
	public String goHomePage() {
		logger.info("Go to Homepage");
		return "main_content";
	}
	
	@ResponseBody
	@RequestMapping(value = "/test", method = RequestMethod.GET)
	public int test() {
		return 23;
	}
}
