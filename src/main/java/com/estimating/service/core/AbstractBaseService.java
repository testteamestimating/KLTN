package com.estimating.service.core;

import org.springframework.beans.factory.annotation.Autowired;

import com.estimating.dao.core.ICustomerDao;
import com.estimating.dao.core.IDepartmentDao;
import com.estimating.dao.core.IUsersDao;
import com.estimating.utils.EstimatingConstants;

public abstract class AbstractBaseService<T> implements IBaseService<T>  {
	@Autowired protected ICustomerDao customerDao;
	@Autowired protected IDepartmentDao departmentDao;
	@Autowired protected IUsersDao userDao;
	
	private EstimatingConstants estimatingConstants;

	public EstimatingConstants getEstimatingConstants() {
		return estimatingConstants;
	}

	public void setEstimatingConstants(EstimatingConstants estimatingConstants) {
		this.estimatingConstants = estimatingConstants;
	}
}
