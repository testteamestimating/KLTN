package com.estimating.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.estimating.bean.ProjectBean;

@Controller
@RequestMapping("/project")
public class ProjectController extends AbstractBaseController {
	
	/**
	 * 
	 * @return map object contains projectTypeBea and projectBean
	 */
	@RequestMapping(value = "/findall", method = RequestMethod.GET)
	@ResponseBody
	public Map<String, Object> findAll() {
		Map<String, Object> result = new HashMap<String, Object>();
		result.put("projects", projectService.findAll());
		result.put("projectTypes", projectTypeService.findAll());
		return result;
	}
	
	@RequestMapping(value = "/add", method = RequestMethod.POST)
	@ResponseBody
	public ProjectBean add(@RequestBody ProjectBean projectBean) {
		return projectService.create(projectBean);
	}
}
