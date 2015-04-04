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
@Table(name = "functionPointProperties")
@Inheritance(strategy  = InheritanceType.TABLE_PER_CLASS)
@AttributeOverride(name = "id", column = @Column(name = "fppId"))
public class FunctionPointProperties extends BaseEntity {
	private static final long serialVersionUID = 1L;
	
	@ManyToOne
	@JoinColumn(name = "fpId")
	private FunctionPoint functionPoint;
	
	@OneToOne
	@JoinColumn(name = "fpType")
	private CommonType commonType;
	
	@Column(name = "fppName", nullable = false, length = 100)
	private String fppName;
}
