package com.estimating.dao.impl;

import com.estimating.dao.core.AbstractBaseDao;
import com.estimating.dao.core.ICommonTypeDao;
import com.estimating.entity.CommonType;

public class CommonTypeDaoImpl extends AbstractBaseDao<CommonType> implements ICommonTypeDao {

	public CommonTypeDaoImpl() {
		super(CommonType.class);
	}
	
	@Override
	public CommonType findOneByName(String name) {
		// TODO Auto-generated method stub
		return null;
	}

}
