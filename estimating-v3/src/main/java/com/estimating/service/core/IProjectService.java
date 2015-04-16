package com.estimating.service.core;

import java.util.List;

import com.estimating.bean.ProjectBean;

public interface IProjectService {
	public ProjectBean create(ProjectBean projectBean);
	public List<ProjectBean> findAll();
	public List<ProjectBean> findListProjectByUsername(String username);
}
