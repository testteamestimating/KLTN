package com.estimating.service.core;

import org.springframework.beans.factory.annotation.Autowired;

import com.estimating.dao.core.IProjectDao;
import com.estimating.dao.core.IProjectTypeDao;
import com.estimating.dao.core.IUsersDao;
import com.estimating.utils.EstimatingConstants;

public abstract class AbstractBaseService {
	@Autowired protected IProjectDao projectDao;
	@Autowired protected IUsersDao userDao;
	@Autowired protected IProjectTypeDao projectTypeDao;
	
	private EstimatingConstants estimatingConstants;

	public EstimatingConstants getEstimatingConstants() {
		return estimatingConstants;
	}

	public void setEstimatingConstants(EstimatingConstants estimatingConstants) {
		this.estimatingConstants = estimatingConstants;
	}
}
