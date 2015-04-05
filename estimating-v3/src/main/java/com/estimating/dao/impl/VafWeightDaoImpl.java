package com.estimating.dao.impl;

import com.estimating.dao.core.AbstractBaseDao;
import com.estimating.dao.core.IVafWeightDao;
import com.estimating.entity.VafWeight;

public class VafWeightDaoImpl extends AbstractBaseDao<VafWeight> implements IVafWeightDao {
	public VafWeightDaoImpl() {
		super(VafWeight.class);
	}
}
