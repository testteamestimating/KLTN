package com.estimating.dao.core;

import com.estimating.entity.UsecasePoint;

public interface IUseCasePointDao extends IBaseDao<UsecasePoint> {
	public UsecasePoint findOnebyName(String name);
}
