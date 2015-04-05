package com.estimating.dao.impl;

import com.estimating.dao.core.AbstractBaseDao;
import com.estimating.dao.core.IIlfWeightDao;
import com.estimating.entity.IlfWeight;

public class IlfWeightDaoImpl extends AbstractBaseDao<IlfWeight> implements IIlfWeightDao {
	public IlfWeightDaoImpl() {
		super(IlfWeight.class);
	}
}
