package com.estimating.entity;

import javax.persistence.AttributeOverride;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name = "commonType")
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
@AttributeOverride(name = "id", column = @Column(name = "cmId"))
public class CommonType  extends BaseEntity {
	
	private static final long serialVersionUID = 1L;
	
	@OneToOne
	@PrimaryKeyJoinColumn
	private UsecasePointProperties usecasePointProperties;
	
	@OneToOne
	@PrimaryKeyJoinColumn
	private FunctionPointProperties functionPointProperties;
	
	@Column(name = "commonName", nullable = false, length = 50)
	private String commonName;
}
