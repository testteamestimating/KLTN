package com.estimating.dao;

import java.sql.Timestamp;
import java.util.ArrayList;
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

import com.estimating.dao.core.ICommonTypeDao;
import com.estimating.dao.core.IEfcWeightDao;
import com.estimating.dao.core.IEiWeightDao;
import com.estimating.dao.core.IEifWeightDao;
import com.estimating.dao.core.IEoWeightDao;
import com.estimating.dao.core.IEqWeightDao;
import com.estimating.dao.core.IFunctionPointDao;
import com.estimating.dao.core.IFunctionPointPropertiesDao;
import com.estimating.dao.core.IIlfWeightDao;
import com.estimating.dao.core.IProjectDao;
import com.estimating.dao.core.IProjectTypeDao;
import com.estimating.dao.core.ITcfWeightDao;
import com.estimating.dao.core.IUseCasePointDao;
import com.estimating.dao.core.IUsecasePointPropertiesDao;
import com.estimating.dao.core.IUserTypeDao;
import com.estimating.dao.core.IUsersDao;
import com.estimating.dao.core.IVafWeightDao;
import com.estimating.dao.core.IWasWeightDao;
import com.estimating.dao.core.IWusWeightDao;
import com.estimating.dao.core.PersistenceContext;
import com.estimating.entity.DateEmbedded;
import com.estimating.entity.Project;
import com.estimating.entity.Users;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = { PersistenceContext.class , TestConfig.class})
public class DaoTest {
	
	@Autowired IWasWeightDao wasWeightDao;
	@Autowired IWusWeightDao wusWeightDao;
	@Autowired ICommonTypeDao commonTypeDao;
	@Autowired IEfcWeightDao efcWeightcDao;
	@Autowired IEifWeightDao eifWeightfDao;
	@Autowired IEiWeightDao eiDWeightDao;
	@Autowired IEoWeightDao eoWeightDao;
	@Autowired IEqWeightDao eqWeightDao;
	@Autowired IFunctionPointDao functionPointDao;
	@Autowired IFunctionPointPropertiesDao functionPointPropertiesDao;
	@Autowired IIlfWeightDao ilfWeightfDao;
	@Autowired IProjectDao projectDao;
	@Autowired IProjectTypeDao projectTyoeDao;
	@Autowired ITcfWeightDao tcfWeightDao;
	@Autowired IUseCasePointDao usecasePointDao;
	@Autowired IUsecasePointPropertiesDao usecasePointPropertiesDao;
	@Autowired IUserTypeDao userTypeDao;
	@Autowired IVafWeightDao vafWeightDao;
	@Autowired IUsersDao userDao;
	
	@SuppressWarnings("unused")
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
		
	@Test
	public void saveUserTest() {
		Users user1 = new Users("long", "789", date);
		userDao.create(user1);
		Assert.assertNotNull(user1);
	}
	//failed
	@Test
	public void findUserByName() {
		Users user = new Users();
		user = userDao.findOneByName("thanhlong");
		Assert.assertNotNull("User not found", user);
		System.out.println(user.getUsername());
		System.out.println(user.getPassword());
		System.out.println(user.getDate());
	}
	
	@Test
	public void findProjecByName() {
		Project project = new Project();
		project = projectDao.findOneByName("pikachu");
		System.out.println(project.getId());
		System.out.println(project.getProjectName());
		System.out.println(project.getUser());
		System.out.println(project.getDescription());
	}
	
	
	@Test
	public void findListProject() {
		List<Project> projects = new ArrayList<Project>();
		projects = projectDao.findListByUsername("hung");
		for (Project project : projects) {
			System.out.println(project.getProjectName());
			
		}
	}
	
	@Test
	public void findListByType() {
		List<Project> projects = new ArrayList<Project>();
		projects = projectDao.findListByType(1);
		for (Project project : projects) {
			System.out.println(project.getProjectName());
		}
	}
	
	@Test
	public void findlistucpbyusername() {
		List<Project> projects = new ArrayList<Project>();
		projects = projectDao.findListUCPByUserName("vuhung");
		for (Project project : projects) {
			System.out.println(project.getProjectName());
		}
	}
	
	@Test
	public void findListFpByUsername() {
		List<Project> projects = new ArrayList<Project>();
		projects = projectDao.findListFpByUserName("longnguyen");
		for (Project project : projects) {
			System.out.println(project.getProjectName());
		}
	}
	
	@Test
	public void findListProjectShareByUser() {
		List<Project> projects = new ArrayList<Project>();
		projects = projectDao.findListProjectShareByUser("long");
		for (Project project : projects) {
			System.out.println(project.getProjectName());
		}
	}
	
	@Test
	public void findListProjectShareToUser() {
		List<Project> projects = new ArrayList<Project>();
		projects = projectDao.findListProjectShareToUser("longnguyen");
		for (Project project : projects) {
			System.out.println(project.getProjectName());
		}
	}
	
	@Test
	public void findListProjectUserShareToUser() {
		List<Project> projects = new ArrayList<Project>();
		projects = projectDao.findListProjectShareUserToUser("longnguyen", "vuhung");
		for (Project project : projects) {
			System.out.println(project.getProjectName());
		}
	}
	
	@Test
	public void findListProjectOfUserVipByUsername() {
		List<Project> projects = new ArrayList<Project>();
		projects = projectDao.findListProjectOfUserVipByUsername("vuhung");
		for (Project project : projects) {
			System.out.println(project.getProjectName());
		}
	}
	
}
