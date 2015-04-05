package com.estimating.dao.core;

import com.estimating.entity.CommonType;;

public interface ICommonTypeDao extends IBaseDao<CommonType> {
	public CommonType findOneByName(String name);
}
