package com.estimating.entity;

import java.util.List;

import javax.persistence.AttributeOverride;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.MapsId;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;


@Entity
@Table(name = "usecase_point")
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
@AttributeOverride(name = "id", column = @Column(name = "ucpId"))
public class UsecasePoint  extends BaseEntity {
	private static final long serialVersionUID = 1L;
	
	@MapsId
	@OneToOne
	@JoinColumn(name="wusId")
	private WusWeight wusId;
	
	@OneToMany(mappedBy="usecasePoint")
	private List<WasWeight> wasIds;
	
}
