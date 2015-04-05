package com.estimating.dao.impl;

import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.estimating.dao.core.AbstractBaseDao;
import com.estimating.dao.core.IUserTypeDao;
import com.estimating.entity.UserType;
@Repository
@Transactional
public class UserTypeDaoImpl extends AbstractBaseDao<UserType> implements IUserTypeDao {
	public UserTypeDaoImpl() {	
		super(UserType.class);
	}
}
