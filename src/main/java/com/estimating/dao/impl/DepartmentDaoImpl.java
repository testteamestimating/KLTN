package com.estimating.dao.impl;

import org.springframework.stereotype.Repository;

import com.estimating.dao.core.AbstractBaseDao;
import com.estimating.dao.core.IDepartmentDao;
import com.estimating.entity.Departments;

@Repository
public class DepartmentDaoImpl extends AbstractBaseDao<Departments> implements IDepartmentDao {
	public DepartmentDaoImpl() {
		super(Departments.class);
	}
}
