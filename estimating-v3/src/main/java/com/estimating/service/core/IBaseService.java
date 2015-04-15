package com.estimating.service.core;

import java.util.List;

public interface IBaseService<T> {
	void create(T entity);
	void update(T entity);
	void remove(T entity);
	T findOneById(Long primaryKey);
	List<T> findAll();
}
