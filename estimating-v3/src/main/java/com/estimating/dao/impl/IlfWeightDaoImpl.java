package com.estimating.dao.impl;

import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.estimating.dao.core.AbstractBaseDao;
import com.estimating.dao.core.IIlfWeightDao;
import com.estimating.entity.IlfWeight;

@Repository
@Transactional
public class IlfWeightDaoImpl extends AbstractBaseDao<IlfWeight> implements IIlfWeightDao {
	public IlfWeightDaoImpl() {
		super(IlfWeight.class);
	}
}
