package com.estimating.dao.impl;

import com.estimating.dao.core.AbstractBaseDao;
import com.estimating.dao.core.IEiWeightDao;
import com.estimating.entity.EiWeight;

public class EiWeightDaoImpl extends AbstractBaseDao<EiWeight> implements IEiWeightDao {
	public EiWeightDaoImpl() {
		super(EiWeight.class);
	}
}
