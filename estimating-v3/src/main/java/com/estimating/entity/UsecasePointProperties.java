package com.estimating.entity;

import javax.persistence.AttributeOverride;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "usecasePointProperties")
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
@AttributeOverride(name = "id", column = @Column(name = "ucppId"))
public class UsecasePointProperties extends BaseEntity {
	private static final long serialVersionUID = 1L;
	
	@ManyToOne
	@JoinColumn(name = "ucpId")
	private UsecasePoint usecasePoint;
	
	@OneToOne
	@JoinColumn(name = "cmId")
	private CommonType commonType;
}
