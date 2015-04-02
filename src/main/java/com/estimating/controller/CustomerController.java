package com.estimating.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.estimating.entity.Customers;

@Controller
public class CustomerController extends AbstractBaseController {
	
	@RequestMapping(value = "/customers/getall", method = RequestMethod.GET)
	@ResponseBody
	public List<Customers> getAllCustomers() {
		List<Customers> result = customerService.findAll();
		return result;
	}
}
