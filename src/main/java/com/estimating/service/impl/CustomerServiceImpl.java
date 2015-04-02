package com.estimating.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.estimating.entity.Customers;
import com.estimating.service.core.AbstractBaseService;
import com.estimating.service.core.ICustomerService;

@Service
public class CustomerServiceImpl extends AbstractBaseService<Customers> implements ICustomerService {

	@Override
	public void create(Customers customer) {
		customerDao.create(customer);
	}

	@Override
	public Customers findOneById(Long id) {
		return findOneById(id);
	}

	@Override
	public Customers findOneByName(String name) {
		return findOneByName(name);
	}

	@Override
	public void update(Customers entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void remove(Customers entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Customers> findAll() {
		return customerDao.findAll();
	}
	
	@Override
	public List<String> validation(Customers customer) {
		List<String> result = new ArrayList<String>();
		if (customer.getSalary().equals(0))
			result.add("Salary must be bigger than 0");
		return result;
	}

}
