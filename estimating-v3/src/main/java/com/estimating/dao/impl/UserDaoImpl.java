package com.estimating.dao.impl;

import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;
import javax.persistence.Query;
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
		String stringQuery = getQuery("findUserByUserName");
		Query query = getTypeQuery(stringQuery);
		query.setParameter("username", name);
		return (Users) query.getSingleResult();
	}
}
