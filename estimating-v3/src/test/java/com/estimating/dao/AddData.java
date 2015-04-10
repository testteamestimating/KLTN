package com.estimating.dao;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

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
import com.estimating.entity.ProjectType;
import com.estimating.entity.TcfWeight;
import com.estimating.entity.UsecasePoint;
import com.estimating.entity.UsecasePointProperties;
import com.estimating.entity.UserType;
import com.estimating.entity.Users;
import com.estimating.entity.VafWeight;
import com.estimating.entity.WasWeight;
import com.estimating.entity.WusWeight;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = { PersistenceContext.class , TestConfig.class})
public class AddData {
	
	@Autowired IWasWeightDao wasWeightDao;
	@Autowired IWusWeightDao wusWeightDao;
	@Autowired ICommonTypeDao commonTypeDao;
	@Autowired IEfcWeightDao efWeightcDao;
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
		
	/*@Test
	public void saveUserTest() {
		Users user1 = new Users("long", "789", date);
		userDao.create(user1);
		Assert.assertNotNull(user1);
	}*/
	/**
	 * @author longnguyen
	 * Create data for UsecasePoint
	 */
	@Test
	public void addWasWeight() {
		ArrayList<WasWeight> list = new ArrayList<WasWeight>();
		int i = 0;
		while(i<10) {
			list.add(new WasWeight(i+2,i+3,i+4));
			wasWeightDao.create(list.get(i));
			i++;
		}
	}
	
	@Test
	public void addWusWeight() {
		List<WusWeight> list = new ArrayList<WusWeight>();
		int i = 0;
		while(i<10) {
			list.add(new WusWeight(i+4,i+7,i+1));
			wusWeightDao.create(list.get(i));
			i++;
		}
	}
	
	@Test
	public void addTcfWEight() {	
		List<TcfWeight> lst = new ArrayList<TcfWeight>();
		int i = 0;
		while(i<10) {
			 lst.add(new TcfWeight(i+1, i+2, i+4, i+7, i+12, i+9, i+8, i+6, i+2, i+5, i+11, i+12, i+3));
			 tcfWeightDao.create(lst.get(i));
			 i++;
		}
	}
	
	@Test
	public void addEfcWeight() {
		List<EfcWeight> lst = new ArrayList<EfcWeight>();
		int i=0;
		while(i<10) {
			lst.add(new EfcWeight(i+4,i+3,i+5,i+2,i+1,i+6,i+9,i+7));
			efWeightcDao.create(lst.get(i));
			i++;
		}
	}
	
	/**
	 * create data for function point
	 */
	@Test
	public void addEiWeight() {
		List<EiWeight> lst = new ArrayList<EiWeight>();
		int i=0;
		while(i<10) {
			lst.add(new EiWeight(i+12,i+6,i+9));
			eiDWeightDao.create(lst.get(i));
			i++;
		}
	}
	
	@Test
	public void addEqWeight() {
		List<EqWeight> lst = new ArrayList<EqWeight>();
		int i=0;
		while(i<10) {
			lst.add(new EqWeight(i+2,i+10,i+4));
			eqWeightDao.create(lst.get(i));
			i++;
		}
	}
	
	@Test
	public void addIlfWeight() {
		List<IlfWeight> lst = new ArrayList<IlfWeight>();
		int i=0;
		while (i<10) {
			lst.add(new IlfWeight(i+6,i+3,i+8));
			ilfWeightfDao.create(lst.get(i));
			i++;
		}
	}
	
	@Test
	public void addEifWeight() {
		List<EifWeight> lst = new ArrayList<EifWeight>();
		int i = 0;
		while(i<10) {
			lst.add(new EifWeight(i+3,i+6,i+2));
			eifWeightfDao.create(lst.get(i));
			i++;
		}
	}
	@Test
	
	public void addEoWeight() {
		List<EoWeight> lst = new  ArrayList<EoWeight>();
		int i = 0;
		while(i<10) {
			lst.add(new EoWeight(i+4,i+12,i+8));
			eoWeightDao.create(lst.get(i));
			i++;
		}
	}
	
	@Test
	public void addVafWeight() {
		List<VafWeight> lst = new ArrayList<VafWeight>();
		int i = 0;
		while(i<10) {
			lst.add(new VafWeight(i, i+1, i+2, i+3, i+4, i+5, i+6, i+7, i+8, i+11, i+6, i+2, i+5, i+6));
			vafWeightDao.create(lst.get(i));
			i++;
		}
	}
	
	/**
	 * 
	 */
	
	@Test
	public void addProjectType() {
		List<ProjectType> lst = new ArrayList<ProjectType>();
		int i = 0;
		lst.add(new ProjectType("Androi Mobile", "App for android mobile phone"));
		lst.add(new ProjectType("Windows phone app", "App for microsoft mobile phone"));
		lst.add(new ProjectType("iOs phone app", "App for iphone, ipad..."));
		lst.add(new ProjectType("Web app", "Webside application"));
		lst.add(new ProjectType("Desktop", "Application for Pc"));
		while(i<5) {
			projectTyoeDao.create(lst.get(i));
			i++;
		}
	}
	
	@Test
	public void addUserType() {
		List<UserType> lst = new ArrayList<UserType>();
		lst.add(new UserType("regular"));
		lst.add(new UserType("vip user"));
		int i = 0;
		while(i<2) {
			userTypeDao.create(lst.get(i));
			i++;
		}
	}
	
	@Test
	public void addCommonType() {
		ArrayList<CommonType> lst = new ArrayList<CommonType>();
		//3
		lst.add(new CommonType("usimple"));
		lst.add(new CommonType("uaverage"));
		lst.add(new CommonType("ucomplex"));
		//3
		lst.add(new CommonType("asimple"));
		lst.add(new CommonType("aaverage"));
		lst.add(new CommonType("acomplex"));
		//8
		lst.add(new CommonType("familiarwithDevelopmentProcess"));
		lst.add(new CommonType("applicationExperience"));
		lst.add(new CommonType("objectOrientedExperience"));
		lst.add(new CommonType("leadAnalystCapability"));
		lst.add(new CommonType("motivation"));
		lst.add(new CommonType("stableRequirements"));
		lst.add(new CommonType("parttimeStaff"));
		lst.add(new CommonType("difficulProgrammingLanguage"));
		//13
		lst.add(new CommonType("access_for_3_parties"));
		lst.add(new CommonType("complex_processing"));
		lst.add(new CommonType("concurrent_use"));
		lst.add(new CommonType("distributed_system"));
		lst.add(new CommonType("easy_to_change"));
		lst.add(new CommonType("easy_to_installation"));
		lst.add(new CommonType("easy_to_use"));
		lst.add(new CommonType("end_uses_efficiency"));
		lst.add(new CommonType("performance_objectives"));
		lst.add(new CommonType("portable"));
		lst.add(new CommonType("reusable_code"));
		lst.add(new CommonType("special_security"));
		lst.add(new CommonType("training_needs"));
		
		lst.add(new CommonType("eifSimple"));
		lst.add(new CommonType("eifAverage"));
		lst.add(new CommonType("eifComplex"));
		
		lst.add(new CommonType("eifSimple"));
		lst.add(new CommonType("eiAverage"));
		lst.add(new CommonType("eiComplex"));
		
		lst.add(new CommonType("eoSimple"));
		lst.add(new CommonType("eoAverage"));
		lst.add(new CommonType("eoComplex"));
		
		lst.add(new CommonType("eqSimple"));
		lst.add(new CommonType("eqAverage"));
		lst.add(new CommonType("eqComplex"));
		
		lst.add(new CommonType("ilfSimple"));
		lst.add(new CommonType("ilfAverage"));
		lst.add(new CommonType("ilfComplex"));
		
		lst.add(new CommonType("dataCommunications"));
		lst.add(new CommonType("distributedDataProcessing"));
		lst.add(new CommonType("performance"));
		lst.add(new CommonType("heavilyUsedConfiguration"));
		lst.add(new CommonType("transactionRate"));
		lst.add(new CommonType("onLineDataEntry"));
		lst.add(new CommonType("endUserEfficiency"));
		lst.add(new CommonType("onLineUpdate"));
		lst.add(new CommonType("complexProcessing"));
		lst.add(new CommonType("reusability"));
		lst.add(new CommonType("installationEase"));
		lst.add(new CommonType("operationalEase"));
		lst.add(new CommonType("multipleSites"));
		lst.add(new CommonType("facilitateChange"));
		
		int i = 0;
		while(i<56) {
			commonTypeDao.create(lst.get(i));
			i++;
		}
	}
	
	@Test
	public void adUser() {
		List<Users> users = new ArrayList<Users>();
		List<UserType> userTypes = new ArrayList<UserType>();
		userTypes.add(userTypeDao.findOneById(1));
		userTypes.add(userTypeDao.findOneById(2));
		users.add(new Users("longnguyen", "thanhlong@123", date, userTypes.get(1)));
		users.add(new Users("vuhung", "vuhung123", date, userTypes.get(1)));
		users.add(new Users("tamnguyen", "tamnguyen@123", date, userTypes.get(0)));
		users.add(new Users("minhtri", "minhtri@123", date, userTypes.get(0)));
		users.add(new Users("thangloi", "thangloi@123", date, userTypes.get(0)));
		users.add(new Users("thanhmai", "thanhmai@123", date, userTypes.get(0)));
		users.add(new Users("anhvu", "anhvu@123", date, userTypes.get(1)));
		users.add(new Users("myhue", "muhue@123", date, userTypes.get(0)));
		users.add(new Users("thienviet", "thienviet@123", date, userTypes.get(1)));
		users.add(new Users("minhthai", "minhthai@123", date, userTypes.get(0)));
		int i =0;
		while(i<10) {
			userDao.create(users.get(i));
			i++;
		}
		
	}
	
	@Test
	public void addProject() {
		List<Project> projects = new ArrayList<Project>();
		List<ProjectType> projectTypes = new  ArrayList<ProjectType>();
		List<Users> users = new ArrayList<Users>();
		
		projectTypes.add(projectTyoeDao.findOneById(1));
		projectTypes.add(projectTyoeDao.findOneById(2));
		projectTypes.add(projectTyoeDao.findOneById(3));
		projectTypes.add(projectTyoeDao.findOneById(4));
		

		users.add(userDao.findOneByName("longnguyen"));
		users.add(userDao.findOneByName("vuhung"));
		users.add(userDao.findOneByName("tamnguyen"));
		users.add(userDao.findOneByName("anhvu"));
		
		projects.add(new Project(users.get(0), projectTypes.get(0), "Game pikachu", "Game pikachu for mobile"));
		projects.add(new Project(users.get(1), projectTypes.get(2), "Game pikachu", "Game pikachu for mobile"));
		/*projects.add(new Project(users.get(2), projectTypes.get(2), "BioniX Wallpaper", "Automatically change your desktop wallpaper, download photos from Flickr or custom websites, shuff..."));
		projects.add(new Project(users.get(3), projectTypes.get(2), "Kaspersky Total Security", "A feature-packed security software solution that blocks malware"));
		projects.add(new Project(users.get(2), projectTypes.get(3), "RemoveIT Pro ", "Run on-demand scans to identify and remove malware agents from critical areas of the system"));
		projects.add(new Project(users.get(3), projectTypes.get(4), "Baidu Antivirus", "An intuitive antivirus program that provides real-time monitoring protection against malware"));
		projects.add(new Project(users.get(4), projectTypes.get(1), "The Missing Sync for Android", "A reliable and user-friendly software solution for synchronizing data on your Android phone, such ..."));
		*/
		projectDao.create(projects.get(1));
		
		/*int i=0;
		while(i<10) {
			projectDao.create(projects.get(i));
			i++;
		}*/
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
			lstEiWeight.add(new EiWeight(1,2,3));
			lstEoWeight.add(new EoWeight(1,2,3));
			lstIlfWeight.add(new IlfWeight(1,2,3));
			lstEqWeight.add(new EqWeight(1,2,3));
			lstEifWeight.add(new EifWeight(1,2,3));
			lstVafWeight.add(new VafWeight());
			lst.add(new FunctionPoint(lstProject.get(i), lstEiWeight.get(i), lstEoWeight.get(i), lstIlfWeight.get(i), lstEqWeight.get(i), lstEifWeight.get(i), 
					lstVafWeight.get(i), i+1, date, i+55.6, i+87.9, i+87.9 , i+87.9, i+87.9, i+87.9, i+87.9, i+87.9, i+87.9, i+80));
			lst.get(i).setEifWeight(new EifWeight(1,2,3));

			functionPointDao.create(lst.get(i));
			i++;
		}
	}
	
	
	
	
	
	
	@Test
	public void addUsecasePoint() {
		ArrayList<UsecasePoint> lst = new ArrayList<UsecasePoint>();
		int i = 0;
		while(i<10) {
			lst.add(new UsecasePoint(i, date, i+1, i+54.7, i+22.6, i+99.12, i+56.8, i+44.9, i+45.3, i*100+12000));
			usecasePointDao.create(lst.get(i));
			i++;
		}
	}
	
	//*
	@Test
	public void addUsecasePointProerties() {
		ArrayList<UsecasePointProperties> lst = new ArrayList<UsecasePointProperties>();
		int i= 0;
		while(i<10) {
			//lst.add(new UsecasePointProperties(usecasePoint, commonType, ucppName))
		}
	}
	

	
	
	
}
