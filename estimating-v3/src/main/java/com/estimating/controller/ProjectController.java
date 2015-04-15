package com.estimating.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.estimating.bean.ProjectBean;
import com.estimating.entity.Project;

@Controller
@RequestMapping("/project")
public class ProjectController extends AbstractBaseController {
	
	@RequestMapping(value = "/findall", method = RequestMethod.GET)
	@ResponseBody
	public List<ProjectBean> findAll() {
		return projectService.findAll();
	}
	
	@RequestMapping(value = "/findalldao", method = RequestMethod.GET)
	@ResponseBody
	public List<Project> findAllDao() {
		return projectDao.findAll();
	}
}
