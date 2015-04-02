package com.estimating.controller;

import org.springframework.beans.factory.annotation.Autowired;

import com.estimating.service.core.ICustomerService;
import com.estimating.service.core.IDepartmentService;

public class AbstractBaseController  {
	@Autowired protected ICustomerService customerService;
	@Autowired protected IDepartmentService departmentService;
}
