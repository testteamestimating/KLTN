package com.estimating.dao.impl;

import com.estimating.dao.core.AbstractBaseDao;
import com.estimating.dao.core.IWusWeightDao;
import com.estimating.entity.WusWeight;

public class WusWeightDaoImpl extends AbstractBaseDao<WusWeight> implements IWusWeightDao {
	public WusWeightDaoImpl() { 
		super(WusWeight.class);
	}
}
