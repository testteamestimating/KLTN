package com.estimating.dao.core;

import com.estimating.entity.Project;

public interface IProjectDao extends IBaseDao<Project> {
	public Project findOneByName(String name);
}
