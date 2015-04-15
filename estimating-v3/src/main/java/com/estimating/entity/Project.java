package com.estimating.entity;

import java.util.List;

import javax.persistence.AttributeOverride;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "project")
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
@AttributeOverride(name  = "id", column= @Column(name = "pId"))
public class Project extends BaseEntity {
	

	private static final long serialVersionUID = 1L;
	
	@ManyToOne
	@JoinColumn(name = "username")
	private Users user;
	
	@ManyToOne
	@JoinColumn(name = "projectType")
	private ProjectType projectType;
	
	@Column(name = "projectName", nullable = false, length = 100)
	private String projectName;
	
	@Column(name = "description")
	private String description;
	
	@OneToMany(mappedBy = "project")
	private List<UsecasePoint> usecasePoints;
	
	@OneToMany(mappedBy = "project")
	private List<FunctionPoint> functionPoints;
	
	@OneToMany(mappedBy = "project")
	private List<Shared> shareds;
	
	/**
	 * @return the shareds
	 */
	public List<Shared> getShareds() {
		return shareds;
	}

	/**
	 * @param shareds the shareds to set
	 */
	public void setShareds(List<Shared> shareds) {
		this.shareds = shareds;
	}

	/**
	 * @param projectName
	 * @param description
	 */
	public Project(String projectName, String description) {
		super();
		this.projectName = projectName;
		this.description = description;
	}

	/**
	 * @param user
	 * @param projectType
	 * @param projectName
	 * @param description
	 */
	public Project(Users user, ProjectType projectType, String projectName,
			String description) {
		super();
		this.user = user;
		this.projectType = projectType;
		this.projectName = projectName;
		this.description = description;
	}

	/**
	 * 
	 */
	public Project() {
		super();
	}

	/**
	 * @return the user
	 */
	public Users getUser() {
		return user;
	}

	/**
	 * @param user the user to set
	 */
	public void setUser(Users user) {
		this.user = user;
	}

	/**
	 * @return the projectType
	 */
	public ProjectType getProjectType() {
		return projectType;
	}

	/**
	 * @param projectType the projectType to set
	 */
	public void setProjectType(ProjectType projectType) {
		this.projectType = projectType;
	}

	/**
	 * @return the projectName
	 */
	public String getProjectName() {
		return projectName;
	}

	/**
	 * @param projectName the projectName to set
	 */
	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}

	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	/**
	 * @return the usecasePoints
	 */
	public List<UsecasePoint> getUsecasePoints() {
		return usecasePoints;
	}

	/**
	 * @param usecasePoints the usecasePoints to set
	 */
	public void setUsecasePoints(List<UsecasePoint> usecasePoints) {
		this.usecasePoints = usecasePoints;
	}

	/**
	 * @return the functionPoints
	 */
	public List<FunctionPoint> getFunctionPoints() {
		return functionPoints;
	}

	/**
	 * @param functionPoints the functionPoints to set
	 */
	public void setFunctionPoints(List<FunctionPoint> functionPoints) {
		this.functionPoints = functionPoints;
	}

	/**
	 * @return the serialversionuid
	 */
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
}
