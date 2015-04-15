package com.estimating.dao.impl;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import javax.persistence.NoResultException;
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
		Users user = null; 
		try {
			String stringQuery = getQuery("findUserByUserName");
			Query query = getTypeQuery(stringQuery);
			query.setParameter("username", name);
			user =  (Users)query.getSingleResult();
		} catch(NoResultException ex) {
		}
		return user;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Users> findList(int id) {
		String stringQuery = getQuery("findListUserByUserName");
		Query query = getTypeQuery(stringQuery);
		query.setParameter("id", id);
		return (List<Users>) query.getResultList();
	}
}
