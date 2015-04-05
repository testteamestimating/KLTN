package com.estimating.dao.impl;

import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.estimating.dao.core.AbstractBaseDao;
import com.estimating.entity.UsecasePoint;

@Repository
@Transactional
public class UseCasePointDaoImpl  extends AbstractBaseDao<UsecasePoint> {
	public UseCasePointDaoImpl() {
		super(UsecasePoint.class);
	}
}
