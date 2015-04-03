package com.estimating.dao.core;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.persistence.criteria.CriteriaQuery;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.util.Assert;

import com.estimating.utils.EstimatingConstants;

public abstract class AbstractBaseDao<T> implements IBaseDao<T> {

	private ResourcesDao resourcesDao;
	private Class<T> entityClass;
	private EstimatingConstants estimatingConstants;
	
	@Value("${database.vendor}")
	private String queryType;

	@PersistenceContext
	protected EntityManager entityManager;

	public AbstractBaseDao(Class<T> entityClass) {
		this.entityClass = entityClass;
	}

	public AbstractBaseDao() {
	}

	protected EntityManager getEntityManager() {
		return this.entityManager;
	}
	
	public EstimatingConstants getEstimatingConstants() {
		return estimatingConstants;
	}

	public void setEstimatingConstants(EstimatingConstants estimatingConstants) {
		this.estimatingConstants = estimatingConstants;
	}
	
	public ResourcesDao getResourcesDao() {
		return resourcesDao;
	}

	public void setResourcesDao(ResourcesDao resourcesDao) {
		this.resourcesDao = resourcesDao;
	}
	
	@Transactional
	public void create(T entity) {
		this.entityManager.persist(entity);
	}
	
	@Transactional
	public void update(T entity) {
		this.entityManager.merge(entity);
	}

	@Transactional
	public void remove(T entity) {
		this.entityManager.remove(this.entityManager.merge(entity));
	}

	/**
	 * 
	 * @param primaryKey
	 * @return only entity from parameter
	 */
	public T findOneById(Long primaryKey) {
		return this.entityManager.find(entityClass, primaryKey);
	}

	/**
	 * Using Criteria Query
	 * @return all field of entity
	 */
	@SuppressWarnings("unchecked")
	public List<T> findAll() {
		@SuppressWarnings("rawtypes")
		CriteriaQuery cq = this.entityManager.getCriteriaBuilder().createQuery();
		cq.select(cq.from(entityClass));
		return this.entityManager.createQuery(cq).getResultList();
	}
	
	/**
	 * 
	 * @return string query from xml file
	 */
	public String getQuery(String queryName) {
		String query = "";
		query = resourcesDao.getNameQuery().get(queryName);
		Assert.notNull(query, "Name query not found. Please re-check in file config.");
		return query;
	}
	
	/**
	 * Get Type Query
	 * @param stringQuery
	 * @return type Query is using Native Query (MySQL, Oracle,...) or JPQL if query type from properties file is JPQL
	 */
	public Query getTypeQuery(String stringQuery) {
		if(queryType.equals(estimatingConstants.getJpqlQuery())) {
			return entityManager.createQuery(stringQuery, entityClass);
		} else {
			return entityManager.createNativeQuery(stringQuery, entityClass);
		}
	}
}
