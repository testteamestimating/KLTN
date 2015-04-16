package com.estimating.controller;

import org.springframework.beans.factory.annotation.Autowired;

import com.estimating.dao.core.IProjectDao;
import com.estimating.service.core.IProjectService;
import com.estimating.service.core.IProjectTypeService;


public class AbstractBaseController  {
	@Autowired protected IProjectService projectService;
	@Autowired protected IProjectTypeService projectTypeService;
}
