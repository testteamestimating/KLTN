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
	
	
}
