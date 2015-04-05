package com.estimating.dao.impl;

import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.estimating.dao.core.AbstractBaseDao;
import com.estimating.dao.core.IEoWeightDao;
import com.estimating.entity.EoWeight;

@Repository
@Transactional
public class EoWeightDaoImpl extends AbstractBaseDao<EoWeight> implements IEoWeightDao {
	public EoWeightDaoImpl() {
		super(EoWeight.class);
	}
}
