package com.estimating.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class NavigationController {
	
	@RequestMapping(value = "/homepage", method = RequestMethod.GET)
	public String goHomePage() {
		return "main_content";
	}
}
