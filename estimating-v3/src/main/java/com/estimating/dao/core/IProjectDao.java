package com.estimating.dao.core;

import java.util.List;

import com.estimating.entity.Project;

public interface IProjectDao extends IBaseDao<Project> {
	public Project findOneByName(String name);
	public List<Project> findListByUsername(String username);
	public List<Project> findListByType(int type);
	public List<Project> findListUCPByUserName(String username);
	public List<Project> findListFpByUserName(String username);
	public List<Project> findListProjectShareByUser(String username);
	public List<Project> findListProjectShareToUser(String username);
	public List<Project> findListProjectShareUserToUser(String owner_user, String share_user);
	public List<Project> findListProjectOfUserVipByUsername(String username);
	public List<Project> findListProjectOfUserRegularByUsername(String username);
}
