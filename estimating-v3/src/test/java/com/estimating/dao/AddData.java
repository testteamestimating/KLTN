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
	@Autowired IEfcWeightDao efcWeightcDao;
	@Autowired IEifWeightDao eifWeightfDao;
	@Autowired IEiWeightDao eiWeightDao;
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
			efcWeightcDao.create(lst.get(i));
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
			eiWeightDao.create(lst.get(i));
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
		
		int i = 0;
		while(i<21) {
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
		
		FunctionPoint f1 = new FunctionPoint(projectDao.findOneById(1), eiWeightDao.findOneById(2), eoWeightDao.findOneById(1), ilfWeightfDao.findOneById(1),
				eqWeightDao.findOneById(1),eifWeightfDao.findOneById(1), vafWeightDao.findOneById(1), 
				1, date, 12.3, 12.3, 12.3, 12.3, 12.3, 12.3, 12.3, 12.3, 12.3, 1);
	functionPointDao.create(f1);
	}
	
	
	
	
	
	
	@Test
	public void addUsecasePoint() {
		ArrayList<UsecasePoint> lst = new ArrayList<UsecasePoint>();
			lst.add(new UsecasePoint(projectDao.findOneById(1), wusWeightDao.findOneById(1), wasWeightDao.findOneById(1), tcfWeightDao.findOneById(1), efcWeightcDao.findOneById(1),
					1, date, 123.1, 11.3, 12.4, 15.8, 123.5, 1234.9, 112.4, 123));
			usecasePointDao.create(lst.get(0));
			lst.add(new UsecasePoint(projectDao.findOneById(2), wusWeightDao.findOneById(2), wasWeightDao.findOneById(2), tcfWeightDao.findOneById(2), efcWeightcDao.findOneById(2),
					1, date, 43.1, 23.3, 12.4, 15.8, 123.5, 1234.9, 112.4, 123));
			usecasePointDao.create(lst.get(1));
			lst.add(new UsecasePoint(projectDao.findOneById(3), wusWeightDao.findOneById(3), wasWeightDao.findOneById(4), tcfWeightDao.findOneById(2), efcWeightcDao.findOneById(1),
					1, date, 67.1, 11.3, 12.4, 15.8, 11.5, 21.9, 12.4, 12));
			usecasePointDao.create(lst.get(2));
	}
	
	//*
	@Test
	public void addUsecasePointProerties() {
		ArrayList<UsecasePointProperties> lst = new ArrayList<UsecasePointProperties>();
		lst.add(new UsecasePointProperties(usecasePointDao.findOneById(1), commonTypeDao.findOneById(1), "name 1"));
		usecasePointPropertiesDao.create(lst.get(0));
	}
	
	
	@Test
	public void findUserByName() {
		Users user = new Users();
		user = userDao.findOneByName("thanhlong");
		System.out.println(user.getUsername());
		System.out.println(user.getPassword());
		System.out.println(user.getDate());
	}
	
	@Test
	public void findprojecbyname() {
		Project project = new Project();
		project = projectDao.findOneByName("Game pikachu");
		System.out.println(project.getId());
		System.out.println(project.getProjectName());
		System.out.println(project.getUser());
		System.out.println(project.getDescription());
	}
	
	@Test
	public void find() {
		List<Users> users = new ArrayList<Users>();
		users = userDao.findList(1);
		for (Users users2 : users) {
			System.out.println(users2.getUsername());
			System.out.println(users2.getPassword());
		}
	}
	
	@Test
	public void findlistproject() {
		List<Project> projects = new ArrayList<Project>();
		projects = projectDao.findListByUsername("vuhung");
		for (Project project : projects) {
			System.out.println(project.getProjectName());
			
		}
	}
	
	@Test
	public void findlistbytype() {
		List<Project> projects = new ArrayList<Project>();
		projects = projectDao.findListByType(1);
		for (Project project : projects) {
			System.out.println(project.getProjectName());
		}
	}
}
