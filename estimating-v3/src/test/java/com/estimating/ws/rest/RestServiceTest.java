package com.estimating.ws.rest;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.estimating.bean.WusWeightBean;
import com.estimating.dao.TestConfig;
import com.estimating.dao.core.PersistenceContext;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = { PersistenceContext.class , TestConfig.class})
public class RestServiceTest {
	@Autowired IUseCasePointRestWS useCasePointRestWS;
	
	// Resource Bean
	WusWeightBean wusWeightBean;
	
	@Before
	public void setup() {
		wusWeightBean = new WusWeightBean(1, 2, 3);
	}
	
	@Test
	public void calWusWeigthTest() {
		double result = useCasePointRestWS.calWusWeight(wusWeightBean);
		Assert.assertEquals(String.valueOf("6.0"), String.valueOf(result));
	}
}
