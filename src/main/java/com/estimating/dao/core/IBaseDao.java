package com.estimating.dao.core;

import java.util.List;

public interface IBaseDao<T> {
	void create(T entity);
	void update(T entity);
	void remove(T entity);
	T findOneById(Long primaryKey);
	List<T> findAll();
}
