package com.estimating.dao.impl;

import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.estimating.dao.core.AbstractBaseDao;
import com.estimating.dao.core.IWusWeightDao;
import com.estimating.entity.WusWeight;
@Repository
@Transactional
public class WusWeightDaoImpl extends AbstractBaseDao<WusWeight> implements IWusWeightDao {
	public WusWeightDaoImpl() { 
		super(WusWeight.class);
	}
}
