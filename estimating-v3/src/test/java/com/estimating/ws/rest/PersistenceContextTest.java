package com.estimating.ws.rest;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.estimating.dao.core.PersistenceContext;

public class PersistenceContextTest {
	@Test
	public void bootstrapAppFromJavaConfig() {
		ApplicationContext context = new AnnotationConfigApplicationContext(PersistenceContext.class);
		Assert.assertNotNull(context);
	}
}
