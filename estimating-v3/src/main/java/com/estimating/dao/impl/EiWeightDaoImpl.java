package com.estimating.dao.impl;

import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.estimating.dao.core.AbstractBaseDao;
import com.estimating.dao.core.IEiWeightDao;
import com.estimating.entity.EiWeight;

@Repository
@Transactional
public class EiWeightDaoImpl extends AbstractBaseDao<EiWeight> implements IEiWeightDao {
	public EiWeightDaoImpl() {
		super(EiWeight.class);
	}
}
