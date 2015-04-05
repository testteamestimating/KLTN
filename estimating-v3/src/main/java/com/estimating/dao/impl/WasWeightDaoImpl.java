package com.estimating.dao.impl;

import com.estimating.dao.core.AbstractBaseDao;
import com.estimating.dao.core.IWasWeightDao;
import com.estimating.entity.WasWeight;

public class WasWeightDaoImpl extends AbstractBaseDao<WasWeight> implements IWasWeightDao {
	public WasWeightDaoImpl() {
		super(WasWeight.class);
	}
}
