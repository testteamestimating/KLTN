package com.estimating.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import com.estimating.bean.ProjectBean;
import com.estimating.entity.Project;
import com.estimating.entity.ProjectType;
import com.estimating.service.core.AbstractBaseService;
import com.estimating.service.core.IProjectService;

@Service
public class ProjectServiceImpl extends AbstractBaseService implements IProjectService {

	@Override
	public List<ProjectBean> findAll() {
		List<Project> projects = projectDao.findAll();
		List<ProjectBean> results = new ArrayList<ProjectBean>(projects.size());
		for (Project project : projects) {
			ProjectBean bean = new ProjectBean(); 
			BeanUtils.copyProperties(project, bean);
			results.add(bean);
		}
		return results;
	}

	@Override
	public List<ProjectBean> findListProjectByUsername(String username) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ProjectBean create(ProjectBean projectBean) {
		Project project = new Project();
		project.setProjectName(projectBean.getProjectName());
		project.setDescription(projectBean.getDescription());
		ProjectType projectType = projectTypeDao.findOneById(projectBean.getProjectTypeId());
		project.setProjectType(projectType);
		projectDao.create(project);
		return projectBean;
	}

}
