package com.estimating.service;

import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.estimating.dao.TestConfig;
import com.estimating.dao.core.PersistenceContext;
import com.estimating.service.core.ICustomerService;
import com.estimating.service.core.IDepartmentService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = { PersistenceContext.class, TestConfig.class })
public class AbstractBaseServiceTest {
	@Autowired
	ICustomerService customerService;
	@Autowired
	IDepartmentService departmentService;
}
