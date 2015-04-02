package com.estimating.dao.core;

import java.util.Map;

public class ResourcesDao {
	private Map<String, String> nameQuery;

	/**
	 * @return the nameQuery
	 */
	public Map<String, String> getNameQuery() {
		return nameQuery;
	}

	/**
	 * @param nameQuery the nameQuery to set
	 */
	public void setNameQuery(Map<String, String> nameQuery) {
		this.nameQuery = nameQuery;
	} 
}
