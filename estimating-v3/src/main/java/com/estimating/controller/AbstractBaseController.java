package com.estimating.controller;

import org.springframework.beans.factory.annotation.Autowired;

import com.estimating.dao.core.IProjectDao;
import com.estimating.service.core.IProjectService;


public class AbstractBaseController  {
	@Autowired protected IProjectService projectService;
	@Autowired protected IProjectDao projectDao;
}
