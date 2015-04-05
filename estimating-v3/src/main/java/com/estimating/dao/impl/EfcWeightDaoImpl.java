package com.estimating.dao.impl;

import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.estimating.dao.core.AbstractBaseDao;
import com.estimating.dao.core.IEfcWeightDao;
import com.estimating.entity.EfcWeight;
@Repository
@Transactional
public class EfcWeightDaoImpl extends AbstractBaseDao<EfcWeight> implements IEfcWeightDao {
	public EfcWeightDaoImpl() {	
		super(EfcWeight.class);
	}
}
