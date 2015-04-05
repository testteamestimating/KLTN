package com.estimating.dao.impl;

import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.estimating.dao.core.AbstractBaseDao;
import com.estimating.dao.core.IUsecasePointPropertiesDao;
import com.estimating.entity.UsecasePointProperties;

@Repository
@Transactional
public class UsecasePointPropertiesDaoImpl extends AbstractBaseDao<UsecasePointProperties> implements IUsecasePointPropertiesDao {
	public UsecasePointPropertiesDaoImpl() {
		super(UsecasePointProperties.class);
	}
}
