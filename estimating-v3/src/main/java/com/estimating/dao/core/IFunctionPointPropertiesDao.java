package com.estimating.dao.core;

import com.estimating.entity.FunctionPointProperties;

public interface IFunctionPointPropertiesDao extends IBaseDao<FunctionPointProperties> {
	public FunctionPointProperties findOneByName(String name);
}
