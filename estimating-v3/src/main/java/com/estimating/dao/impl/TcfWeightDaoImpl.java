package com.estimating.dao.impl;

import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.estimating.dao.core.AbstractBaseDao;
import com.estimating.dao.core.ITcfWeightDao;
import com.estimating.entity.TcfWeight;

@Repository
@Transactional
public class TcfWeightDaoImpl extends AbstractBaseDao<TcfWeight> implements ITcfWeightDao {
	public TcfWeightDaoImpl() {
		super(TcfWeight.class);
	}
}
