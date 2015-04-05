package com.estimating.dao.impl;

import com.estimating.dao.core.AbstractBaseDao;
import com.estimating.dao.core.IUsecasePointPropertiesDao;
import com.estimating.entity.UsecasePointProperties;

public class UsecasePointPropertiesDaoImpl extends AbstractBaseDao<UsecasePointProperties> implements IUsecasePointPropertiesDao {
	public UsecasePointPropertiesDaoImpl() {
		super(UsecasePointProperties.class);
	}
}
