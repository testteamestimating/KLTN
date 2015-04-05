package com.estimating.dao.impl;

import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.estimating.dao.core.AbstractBaseDao;
import com.estimating.dao.core.IWasWeightDao;
import com.estimating.entity.WasWeight;

@Repository
@Transactional
public class WasWeightDaoImpl extends AbstractBaseDao<WasWeight> implements IWasWeightDao {
	public WasWeightDaoImpl() {
		super(WasWeight.class);
	}
}
