package com.estimating.dao.impl;

import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.estimating.dao.core.AbstractBaseDao;
import com.estimating.dao.core.IEqWeightDao;
import com.estimating.entity.EqWeight;

@Repository
@Transactional
public class EqWeightDaoImpl extends AbstractBaseDao<EqWeight> implements IEqWeightDao {
	public EqWeightDaoImpl() {
		super(EqWeight.class);
	}
}
