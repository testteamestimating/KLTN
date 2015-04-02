package com.estimating.dao;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.List;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.estimating.dao.core.ICustomerDao;
import com.estimating.dao.core.IDepartmentDao;
import com.estimating.dao.core.IUsersDao;
import com.estimating.dao.core.PersistenceContext;
import com.estimating.dao.core.ResourcesDao;
import com.estimating.entity.Customers;
import com.estimating.entity.DateEmbedded;
import com.estimating.entity.Departments;
import com.estimating.entity.Users;
import com.estimating.enums.RoleEnum;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = { PersistenceContext.class , TestConfig.class})
public class DaoTest {
	@Autowired IUsersDao userDao;
	@Autowired IDepartmentDao departmentDao;
	@Autowired ICustomerDao customerDao;
	
	private ApplicationContext context;
	
	private DateEmbedded date;
	
	@Before
	public void setup() {
		context = new ClassPathXmlApplicationContext("classpath:META-INF/estimating-config/estimating-config.xml");
		long time = System.currentTimeMillis();
		date = new DateEmbedded();
		date.setCreatedDate(new Timestamp(time));
		date.setUpdatedDate(new Timestamp(time));
	}
		
	//@Test
	public void saveUserTest() {
		Users user1 = new Users("hung5", "789", RoleEnum.ROLE_ADMIN, date);
		userDao.create(user1);
		Assert.assertNotNull(user1);
	}
	
	//@Test
	public void saveDepartmentTest() {
		Departments department1 = new Departments("def", date);
		departmentDao.create(department1);
		Assert.assertNotNull(department1);
	}
	
	@Test
	public void saveCustomerTest() {
		Departments department = departmentDao.findOneById(Long.parseLong("2"));
		Customers customer1 = new Customers("customer3", new BigDecimal("10000"), department, date);
		customerDao.create(customer1);
		Assert.assertNotNull(customer1);
	}
	
	/**
	 * NOTE: To use laze loading, remember call getDepartment(or any entity) before end transaction in ...DaoImpl
	 */
	//@Test
	public void testLoadLazy() {
		// Find by id
		//Customers customer = customerDao.findOneById(Long.parseLong("2"));
		
		// Find by name
		Customers customer = customerDao.findOneByName("customer1"); 
		Departments department = customer.getDepartment();
		String departmentName = department.getDepartmentName();
		Assert.assertEquals("abc", departmentName);
	}
	
	//@Test
	public void findUserByUsernameTest() {
		Users user = userDao.findUserByUserName("hung4");
		Assert.assertNotNull(user);
		System.out.println(user);
		Assert.assertEquals("hung4", user.getUsername());
	}

	//@Test
	public void loadResourcesTest() {
    	ResourcesDao resources = (ResourcesDao)context.getBean("resourcesDao");
    	Assert.assertNotNull(resources);
    	Assert.assertNotNull(resources.getNameQuery().get("findUserByUserName"));
    	// Assert.assertEquals("SELECT * FROM users WHERE username = ?", resources.getNameQuery().get("findUserByUserName"));
	}
	
	@Test
	public void findAllCustomerTest() {
		List<Customers> customers = customerDao.findAll();
		for (Customers customer : customers) {
			System.out.println(customer);
		}
		Assert.assertNotNull(customers);
	}
}

