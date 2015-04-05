package com.estimating.dao.impl;

import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.estimating.dao.core.AbstractBaseDao;
import com.estimating.dao.core.IProjectTypeDao;
import com.estimating.entity.ProjectType;

@Repository
@Transactional
public class ProjectTypeDaoImpl extends AbstractBaseDao<ProjectType> implements IProjectTypeDao {
	public ProjectTypeDaoImpl()	{
		super(ProjectType.class);
	}
}
