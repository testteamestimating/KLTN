package com.estimating.dao.impl;

import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import com.estimating.dao.core.AbstractBaseDao;
import com.estimating.dao.core.IUsersDao;
import com.estimating.entity.Users;

@Repository
public class UserDaoImpl extends AbstractBaseDao<Users> implements IUsersDao {
	public UserDaoImpl() {
		super(Users.class);
	}

	@Override
	public Users findUserByUserName(String username) {
		String stringQuery = getQuery("findUserByUserName");
		Query query = getTypeQuery(stringQuery);
		query.setParameter("username", username);
		return (Users) query.getSingleResult();
	}
}
