package com.estimating.dao.impl;

import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.estimating.dao.core.AbstractBaseDao;
import com.estimating.dao.core.IFunctionPointPropertiesDao;
import com.estimating.entity.FunctionPointProperties;

@Repository
@Transactional
public class FunctionPointPropertiesDaoImpl extends AbstractBaseDao<FunctionPointProperties> implements IFunctionPointPropertiesDao {

	public FunctionPointPropertiesDaoImpl()	{
		super(FunctionPointProperties.class);
	}
	
	@Override
	public FunctionPointProperties findOneByName(String name) {
		// TODO Auto-generated method stub
		return null;
	}

}
