package com.estimating.dao.impl;

import com.estimating.dao.core.AbstractBaseDao;
import com.estimating.dao.core.ITcfWeightDao;
import com.estimating.entity.TcfWeight;

public class TcfWeightDaoImpl extends AbstractBaseDao<TcfWeight> implements ITcfWeightDao {
	public TcfWeightDaoImpl() {
		super(TcfWeight.class);
	}
}
