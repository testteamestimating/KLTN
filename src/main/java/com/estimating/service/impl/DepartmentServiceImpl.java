package com.estimating.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.estimating.entity.Departments;
import com.estimating.service.core.AbstractBaseService;
import com.estimating.service.core.IDepartmentService;

@Service
public class DepartmentServiceImpl extends AbstractBaseService<Departments> implements IDepartmentService {

	@Override
	public void create(Departments departments) {
		departmentDao.create(departments);
	}

	@Override
	public Departments findOneById(Long id) {
		return departmentDao.findOneById(id);
	}

	@Override
	public void update(Departments entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void remove(Departments entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Departments> findAll() {
		return departmentDao.findAll();
	}

}
