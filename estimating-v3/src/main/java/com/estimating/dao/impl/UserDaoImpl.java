package com.estimating.dao.impl;

import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.estimating.dao.core.AbstractBaseDao;
import com.estimating.dao.core.IUsersDao;
import com.estimating.entity.Users;

@Repository
@Transactional
public class UserDaoImpl  extends AbstractBaseDao<Users> implements IUsersDao {
	public UserDaoImpl() {
		super(Users.class);
	}

	@Override
	public Users findOneByName(String name) {
		// TODO Auto-generated method stub
		return null;
	}
}
