package com.estimating.dao;

import java.sql.Timestamp;
import java.util.ArrayList;

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
import com.estimating.dao.core.IVafWeightDao;
import com.estimating.dao.core.IWasWeightDao;
import com.estimating.dao.core.IWusWeightDao;
import com.estimating.dao.core.PersistenceContext;
import com.estimating.dao.impl.FunctionPointPropertiesDaoImpl;
import com.estimating.entity.CommonType;
import com.estimating.entity.DateEmbedded;
import com.estimating.entity.EfcWeight;
import com.estimating.entity.EiWeight;
import com.estimating.entity.EifWeight;
import com.estimating.entity.EoWeight;
import com.estimating.entity.EqWeight;
import com.estimating.entity.FunctionPoint;
import com.estimating.entity.IlfWeight;
import com.estimating.entity.Project;
import com.estimating.entity.VafWeight;
import com.estimating.entity.WasWeight;
import com.estimating.entity.WusWeight;
import com.mysql.fabric.xmlrpc.base.Array;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = { PersistenceContext.class , TestConfig.class})
public class AddData {
	
	@Autowired IWasWeightDao wasDao;
	@Autowired IWusWeightDao wusDao;
	@Autowired ICommonTypeDao cmtDao;
	@Autowired IEfcWeightDao efcDao;
	@Autowired IEifWeightDao eifDao;
	@Autowired IEiWeightDao eiDao;
	@Autowired IEoWeightDao eoDao;
	@Autowired IEqWeightDao eqDao;
	@Autowired IFunctionPointDao fpDao;
	@Autowired IFunctionPointPropertiesDao fppDao;
	@Autowired IIlfWeightDao ilfDao;
	@Autowired IProjectDao pDao;
	@Autowired IProjectTypeDao ptDao;
	@Autowired ITcfWeightDao tcfDao;
	@Autowired IUseCasePointDao ucpDao;
	@Autowired IUsecasePointPropertiesDao ucppDao;
	@Autowired IUserTypeDao utDao;
	@Autowired IVafWeightDao Dao;
	
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
		
	/*@Test
	public void saveUserTest() {
		Users user1 = new Users("long", "789", date);
		userDao.create(user1);
		Assert.assertNotNull(user1);
	}*/
		
	@Test
	public void addWas() {
		ArrayList<WasWeight> list = new ArrayList<WasWeight>();
		int i = 0;
		while(i<10) {
			list.add(new WasWeight(i+2,i+3,i+4));
			wasDao.create(list.get(i));
			i++;
		}
		//Assert.assertNotNull(was);
	}
	
	@Test
	public void addWus() {
		ArrayList<WusWeight> list = new ArrayList<WusWeight>();
		int i = 0;
		while(i<10) {
			list.add(new WusWeight(i+2,i+3,i+4));
			wusDao.create(list.get(i));
			i++;
		}
	}
	
	@Test
	public void addCommonType() {
		ArrayList<CommonType> list = new ArrayList<CommonType>();
		int i = 0;
		while(i<10) {
			String name = "common_" + i;
			list.add(new CommonType(name));
			cmtDao.create(list.get(i));
			i++;
		}
	}
	
	@Test
	public void addEfcWeight() {
		ArrayList<EfcWeight> lst = new ArrayList<EfcWeight>();
		int i=0;
		while(i<10) {
			lst.add(new EfcWeight(i+4,i+3,i+5,i+2,i+1,i+6,i+9,i+7));
			efcDao.create(lst.get(i));
			i++;
		}
	}
	
	@Test
	public void addEifWeight() {
		ArrayList<EifWeight> lst = new ArrayList<EifWeight>();
		int i = 0;
		while(i<10) {
			lst.add(new EifWeight(i+3,i+6,i+2));
			eifDao.create(lst.get(i));
			i++;
		}
	}
	
	@Test
	public void addEiWeight() {
		ArrayList<EiWeight> lst = new ArrayList<EiWeight>();
		int i=0;
		while(i<10) {
			lst.add(new EiWeight(i+12,i+6,i+9));
			eiDao.create(lst.get(i));
			i++;
		}
	}
	
	@Test
	public void addEoWeight() {
		ArrayList<EoWeight> lst = new  ArrayList<EoWeight>();
		int i = 0;
		while(i<10) {
			lst.add(new EoWeight(i+4,i+12,i+8));
			eoDao.create(lst.get(i));
			i++;
		}
	}
	
	@Test
	public void addEqWeight() {
		ArrayList<EqWeight> lst = new ArrayList<EqWeight>();
		int i=0;
		while(i<10) {
			lst.add(new EqWeight(i+2,i+10,i+4));
			eqDao.create(lst.get(i));
			i++;
		}
	}
	
	@Test
	public void addfuncionPoint() {
		
		ArrayList<FunctionPoint> lst = new ArrayList<FunctionPoint>();
		ArrayList<Project> lstProject = new ArrayList<Project>();
		ArrayList<EiWeight> lstEiWeight = new ArrayList<EiWeight>();
		ArrayList<EoWeight> lstEoWeight = new ArrayList<EoWeight>();
		ArrayList<IlfWeight> lstIlfWeight = new ArrayList<IlfWeight>();
		ArrayList<EqWeight> lstEqWeight = new ArrayList<EqWeight>();
		ArrayList<EifWeight> lstEifWeight = new ArrayList<EifWeight>();
		ArrayList<VafWeight> lstVafWeight = new ArrayList<VafWeight>();
		
		int i =0;
		while(i<10) {
			//lst.add(new FunctionPoint(1,date,i+6.6,i+8.6,i+8.6,i+4.9,i+7.8,i+9.3,i+7.9,i+6.8,i+8.8,i*1000+12000));
			lstProject.add(new Project());
			lstEiWeight.add(new EiWeight());
			lstEoWeight.add(new EoWeight());
			lstIlfWeight.add(new IlfWeight());
			lstEqWeight.add(new EqWeight());
			lstEifWeight.add(new EifWeight());
			lstVafWeight.add(new VafWeight());
			lst.add(new FunctionPoint(lstProject.get(i), lstEiWeight.get(i), lstEoWeight.get(i), lstIlfWeight.get(i), lstEqWeight.get(i), lstEifWeight.get(i), 
					lstVafWeight.get(i), i+1, date, i+55.6, i+87.9, i+87.9 , i+87.9, i+87.9, i+87.9, i+87.9, i+87.9, i+87.9, i+80));
			lst.get(i).setEifWeight(new EifWeight(1,2,3));

			fpDao.create(lst.get(i));
			i++;
		}
	}
	
	@Test
	public void addFuntionPointPro() {
		FunctionPointPropertiesDaoImpl a = new 
	}
}
