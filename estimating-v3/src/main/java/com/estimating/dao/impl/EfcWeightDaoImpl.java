package com.estimating.dao.impl;

import com.estimating.dao.core.AbstractBaseDao;
import com.estimating.dao.core.IEfcWeightDao;
import com.estimating.entity.EfcWeight;

public class EfcWeightDaoImpl extends AbstractBaseDao<EfcWeight> implements IEfcWeightDao {
	public EfcWeightDaoImpl() {	
		super(EfcWeight.class);
	}
}
