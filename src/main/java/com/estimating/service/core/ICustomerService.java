package com.estimating.service.core;

import java.util.List;

import com.estimating.entity.Customers;

public interface ICustomerService extends IBaseService<Customers> {
	public Customers findOneByName(String name);
	public List<String> validation(Customers customer);
}
