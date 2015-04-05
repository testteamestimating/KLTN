package com.estimating.dao.impl;

import com.estimating.dao.core.AbstractBaseDao;
import com.estimating.dao.core.IFunctionPointDao;
import com.estimating.entity.FunctionPoint;

public class FunctionPointDaoImpl extends AbstractBaseDao<FunctionPoint> implements IFunctionPointDao {

	public FunctionPointDaoImpl() {
		super(FunctionPoint.class);
	}
	
	@Override
	public FunctionPoint findOneByName(String name) {
		// TODO Auto-generated method stub
		return null;
	}

}
