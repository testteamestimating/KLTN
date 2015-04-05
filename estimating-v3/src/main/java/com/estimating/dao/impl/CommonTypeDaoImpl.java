package com.estimating.dao.impl;

import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.estimating.dao.core.AbstractBaseDao;
import com.estimating.dao.core.ICommonTypeDao;
import com.estimating.entity.CommonType;

@Repository
@Transactional
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
