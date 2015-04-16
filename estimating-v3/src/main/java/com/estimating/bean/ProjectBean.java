package com.estimating.bean;

import java.io.Serializable;

public class ProjectBean implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String projectName;
	private String description;
	private int id;
	private String username;
	private int projectTypeId;

	public ProjectBean() {
		super();
	}
	
	public ProjectBean(String projectName, String description,
			int projectId, String username) {
		super();
		this.projectName = projectName;
		this.description = description;
		this.id = projectId;
		this.username = username;
	}


	public String getProjectName() {
		return projectName;
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getId() {
		return id;
	}

	public void setId(int projectId) {
		this.id = projectId;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public int getProjectTypeId() {
		return projectTypeId;
	}

	public void setProjectTypeId(int projectTypeId) {
		this.projectTypeId = projectTypeId;
	}
}
