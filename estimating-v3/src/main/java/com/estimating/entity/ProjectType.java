package com.estimating.entity;

import java.util.List;

import javax.persistence.AttributeOverride;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "projectType")
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
@AttributeOverride(name = "id", column = @Column(name = "ptId"))
public class ProjectType extends BaseEntity {
	private static final long serialVersionUID = 1L;
	
	@Column(name = "typeName", nullable = false, length = 50)
	private String typeName;
	
	@Column(name = "description", length = 200)
	private String descripton;
	
	@OneToMany(mappedBy = "projectType")
	private List<Project> project;

	/**
	 * @param typeName
	 * @param descripton
	 */
	public ProjectType(String typeName, String descripton) {
		super();
		this.typeName = typeName;
		this.descripton = descripton;
	}

	/**
	 * 
	 */
	public ProjectType() {
		super();
	}

	/**
	 * @return the typeName
	 */
	public String getTypeName() {
		return typeName;
	}

	/**
	 * @param typeName the typeName to set
	 */
	public void setTypeName(String typeName) {
		this.typeName = typeName;
	}

	/**
	 * @return the descripton
	 */
	public String getDescripton() {
		return descripton;
	}

	/**
	 * @param descripton the descripton to set
	 */
	public void setDescripton(String descripton) {
		this.descripton = descripton;
	}

	/**
	 * @return the project
	 */
	public List<Project> getProject() {
		return project;
	}

	/**
	 * @param project the project to set
	 */
	public void setProject(List<Project> project) {
		this.project = project;
	}

	/**
	 * @return the serialversionuid
	 */
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
}
