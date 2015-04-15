package com.estimating.service.core;

import java.util.List;

import com.estimating.bean.ProjectBean;

public interface IProjectService extends IBaseService<ProjectBean> {
	public List<ProjectBean> findListProjectByUsername(String username);
}
