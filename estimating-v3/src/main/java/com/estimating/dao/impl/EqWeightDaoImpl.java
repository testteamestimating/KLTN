package com.estimating.dao.impl;

import com.estimating.dao.core.AbstractBaseDao;
import com.estimating.dao.core.IEqWeightDao;
import com.estimating.entity.EqWeight;

public class EqWeightDaoImpl extends AbstractBaseDao<EqWeight> implements IEqWeightDao {
	public EqWeightDaoImpl() {
		super(EqWeight.class);
	}
}
