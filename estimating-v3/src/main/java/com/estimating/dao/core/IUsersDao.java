package com.estimating.dao.core;

import java.util.List;

import com.estimating.entity.Users;

public interface IUsersDao extends IBaseDao<Users> {
	public Users findOneByName(String name);
	public List<Users> findList(int id);
}
