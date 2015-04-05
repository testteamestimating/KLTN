package com.estimating.dao.impl;

import com.estimating.dao.core.AbstractBaseDao;
import com.estimating.dao.core.IProjectDao;
import com.estimating.entity.Project;

public class ProjectDaoImpl extends AbstractBaseDao<Project> implements IProjectDao {

	public ProjectDaoImpl() {
		super(Project.class);
	}
	
	@Override
	public Project findOneByName(String name) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
