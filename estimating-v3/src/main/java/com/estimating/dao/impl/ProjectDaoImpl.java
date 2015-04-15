package com.estimating.dao.impl;

import java.util.List;

import javax.persistence.Query;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.estimating.dao.core.AbstractBaseDao;
import com.estimating.dao.core.IProjectDao;
import com.estimating.entity.Project;

@Repository
@Transactional
public class ProjectDaoImpl extends AbstractBaseDao<Project> implements IProjectDao {

	public ProjectDaoImpl() {
		super(Project.class);
	}
	
	@Override
	public Project findOneByName(String name) {
		String stringQuery = getQuery("findProjectByName");
		Query query = getTypeQuery(stringQuery);
		query.setParameter("projectname", name);
		return (Project) query.getSingleResult();
		
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Project> findListByUsername(String username) {
		String stringQuery = getQuery("findListProjectByName");
		Query query = getTypeQuery(stringQuery);
		query.setParameter("username", username);
		return (List<Project>) query.getResultList();
	}

	@Override
	public List<Project> findListByType(int type) {
		String stringQuery = getQuery("findListProjectByType");
		Query query = getTypeQuery(stringQuery);
		query.setParameter("type", type);
		return (List<Project>) query.getResultList();
	}

	@Override
	public List<Project> findListUCPByUserName(String username) {
		String stringQuery = getQuery("findListProjectUCPByUserName");
		Query query = getTypeQuery(stringQuery);
		query.setParameter("username", username);
		return (List<Project>) query.getResultList();
	}

	@Override
	public List<Project> findListFpByUserName(String username) {
		String stringQuery = getQuery("findListProjectFPByUserName");
		Query query = getTypeQuery(stringQuery);
		query.setParameter("username", username);
		return (List<Project>) query.getResultList();
	}

	@Override
	public List<Project> findListProjectShareByUser(String username) {
		String stringQuery = getQuery("findListProjectShareByUser");
		Query query = getTypeQuery(stringQuery);
		query.setParameter(1, username);
		return (List<Project>) query.getResultList();
	}

	@Override
	public List<Project> findListProjectShareToUser(String username) {
		String stringQuery = getQuery("findListProjectShareToUser");
		Query query = getTypeQuery(stringQuery);
		query.setParameter("username", username);
		return (List<Project>) query.getResultList();
	}

	@Override
	public List<Project> findListProjectShareUserToUser(String owner_user,	String share_user) {
		String stringQuery = getQuery("findListProjectUserShareToUser");
		Query query = getTypeQuery(stringQuery);
		query.setParameter("owner_user", owner_user);
		query.setParameter("share_user", share_user);
		return (List<Project>) query.getResultList();
	}

	@Override
	public List<Project> findListProjectOfUserVipByUsername(String username) {
		String stringQuery = getQuery("findListProjectOfUserVipByUsername");
		Query query = getTypeQuery(stringQuery);
		query.setParameter("username", username);
		return (List<Project>) query.getResultList();
	}
	
	@Override
	public List<Project> findListProjectOfUserRegularByUsername(String username) {
		String stringQuery = getQuery("findListProjectOfUserRegularByUsername");
		Query query = getTypeQuery(stringQuery);
		query.setParameter("username", username);
		return (List<Project>) query.getResultList();
	}
	
}
