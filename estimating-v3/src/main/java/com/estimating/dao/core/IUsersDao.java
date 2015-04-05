package com.estimating.dao.core;

import com.estimating.entity.Users;

public interface IUsersDao extends IBaseDao<Users> {
	public Users findOneByName(String name);
}
