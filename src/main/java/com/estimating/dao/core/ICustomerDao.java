package com.estimating.dao.core;

import com.estimating.entity.Customers;

public interface ICustomerDao extends IBaseDao<Customers> {
//	public void create(Customers customer);
//	public Customers findOneById(Long id);
//	public List<Customers> findAll();
	public Customers findOneByName(String name);
}
