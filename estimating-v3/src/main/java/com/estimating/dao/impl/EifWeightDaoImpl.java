package com.estimating.dao.impl;

import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.estimating.dao.core.AbstractBaseDao;
import com.estimating.dao.core.IEifWeightDao;
import com.estimating.entity.EifWeight;

@Repository
@Transactional
public class EifWeightDaoImpl extends AbstractBaseDao<EifWeight> implements IEifWeightDao {
	public EifWeightDaoImpl() {
		super(EifWeight.class);
	}
}
