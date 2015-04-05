package com.estimating.dao.impl;

import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.estimating.dao.core.AbstractBaseDao;
import com.estimating.dao.core.IVafWeightDao;
import com.estimating.entity.VafWeight;
@Repository
@Transactional
public class VafWeightDaoImpl extends AbstractBaseDao<VafWeight> implements IVafWeightDao {
	public VafWeightDaoImpl() {
		super(VafWeight.class);
	}
}
