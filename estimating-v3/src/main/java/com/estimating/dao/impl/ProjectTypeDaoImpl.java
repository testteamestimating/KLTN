package com.estimating.dao.impl;

import com.estimating.dao.core.AbstractBaseDao;
import com.estimating.dao.core.IProjectTypeDao;
import com.estimating.entity.ProjectType;

public class ProjectTypeDaoImpl extends AbstractBaseDao<ProjectType> implements IProjectTypeDao {
	public ProjectTypeDaoImpl()	{
		super(ProjectType.class);
	}
}
