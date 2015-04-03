package com.estimating.dao.impl;

import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.estimating.dao.core.AbstractBaseDao;
import com.estimating.dao.core.IUsersDao;
import com.estimating.entity.Users;

@Repository
@Transactional
public class UserImpl  extends AbstractBaseDao<Users> implements IUsersDao {
	public UserImpl() {
		super(Users.class);
	}
}
