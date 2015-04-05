package com.estimating.dao.core;

import com.estimating.entity.FunctionPoint;

public interface IFunctionPointDao extends IBaseDao<FunctionPoint> {
	public FunctionPoint findOneByName(String name);
}
