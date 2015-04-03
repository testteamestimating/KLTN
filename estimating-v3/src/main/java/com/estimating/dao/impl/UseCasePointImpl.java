package com.estimating.dao.impl;

import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.estimating.dao.core.AbstractBaseDao;
import com.estimating.entity.UsecasePoint;

@Repository
@Transactional
public class UseCasePointImpl  extends AbstractBaseDao<UsecasePoint> {
	public UseCasePointImpl() {
		super(UsecasePoint.class);
	}
}
