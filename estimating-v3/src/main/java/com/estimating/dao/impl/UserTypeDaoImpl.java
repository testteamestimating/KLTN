package com.estimating.dao.impl;

import com.estimating.dao.core.AbstractBaseDao;
import com.estimating.dao.core.IUserTypeDao;
import com.estimating.entity.UserType;

public class UserTypeDaoImpl extends AbstractBaseDao<UserType> implements IUserTypeDao {
	public UserTypeDaoImpl() {	
		super(UserType.class);
	}
}
