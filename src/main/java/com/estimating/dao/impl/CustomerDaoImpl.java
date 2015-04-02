package com.estimating.dao.impl;

import javax.persistence.Query;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.estimating.dao.core.AbstractBaseDao;
import com.estimating.dao.core.ICustomerDao;
import com.estimating.entity.Customers;
import com.estimating.entity.Departments;

@Repository
@Transactional
public class CustomerDaoImpl  extends AbstractBaseDao<Customers> implements ICustomerDao {
	public CustomerDaoImpl() {
		super(Customers.class);
	}

	/**
	 * If want to use department loading lazy, call getDepartment before end transaction 
	 */
	@Override
	public Customers findOneByName(String name) {
		String stringQuery = getQuery("findCustomerByName");
		Query query = getTypeQuery(stringQuery);
		query.setParameter("customername", name);
		Customers result = (Customers) query.getSingleResult();
		Departments de = result.getDepartment();
		System.out.println(de.getDepartmentName());
		return result;
	}
}
