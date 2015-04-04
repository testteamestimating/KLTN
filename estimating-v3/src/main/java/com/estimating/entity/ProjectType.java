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
}
