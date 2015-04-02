package com.estimating.service;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.List;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.BeanUtils;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.estimating.entity.Customers;
import com.estimating.entity.DateEmbedded;
import com.estimating.entity.Departments;
import com.estimating.model.CustomerTemp;

public class ServiceTest extends AbstractBaseServiceTest {

	@SuppressWarnings("unused")
	private ApplicationContext context;

	private DateEmbedded date;

	@Before
	public void setup() {
		context = new ClassPathXmlApplicationContext(
				"classpath:META-INF/estimating-config/estimating-config.xml");
		long time = System.currentTimeMillis();
		date = new DateEmbedded();
		date.setCreatedDate(new Timestamp(time));
		date.setUpdatedDate(new Timestamp(time));
	}

	//@Test
	public void createCustomerTest() {
		Departments department = departmentService.findOneById(Long
				.parseLong("2"));
		Customers customer1 = new Customers("customer4", new BigDecimal("0"),
				department, date);
		customerService.create(customer1);
		Assert.assertNotNull(customer1);
	}
	
	//@Test
	public void findAllDepartmentTest() {
		List<Departments> departments = departmentService.findAll();
		for (Departments department : departments) {
			System.out.println(department.getDepartmentName());
		}
		Assert.assertNotNull(departments);
	}
	
	@Test
	public void findAllCustomerTest() {
		List<Customers> customers = customerService.findAll();
		Assert.assertNotNull(customers);
		//CustomerModel model = new CustomerModel();
		//DepartmentModel model = new DepartmentModel();
		CustomerTemp model = new CustomerTemp();
		for (Customers customer : customers) {
			BeanUtils.copyProperties(customer, model);
			System.out.println(customer);
		}
	}
}
