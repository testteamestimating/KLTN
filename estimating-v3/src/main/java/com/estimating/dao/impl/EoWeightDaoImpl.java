package com.estimating.dao.impl;

import com.estimating.dao.core.AbstractBaseDao;
import com.estimating.dao.core.IEoWeightDao;
import com.estimating.entity.EoWeight;

public class EoWeightDaoImpl extends AbstractBaseDao<EoWeight> implements IEoWeightDao {
	public EoWeightDaoImpl() {
		super(EoWeight.class);
	}
}
