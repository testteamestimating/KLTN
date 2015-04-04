package com.estimating.entity;

import java.util.List;

import javax.persistence.AttributeOverride;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;


@Entity
@Table(name = "usecase_point")
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
@AttributeOverride(name = "id", column = @Column(name = "ucpId"))
public class UsecasePoint  extends BaseEntity {
	private static final long serialVersionUID = 1L;
	
	@OneToOne
	@JoinColumn(name="wusId")
	private WusWeight wusWeight;
	
	@OneToOne
	@JoinColumn(name="wasId")
	private WasWeight waWeight;
	
	@OneToOne
	@JoinColumn(name="tcfId")
	private TcfWeight tcfWeight;
	
	@OneToOne
	@JoinColumn(name = "efcId")
	private EfcWeight efcWeight;
	
	@OneToMany(mappedBy = "usecasePoint")
	private List<UsecasePointProperties> usecaseProperties;
	
	@Embedded
	private DateEmbedded date;
	
	@Column(name = "wasPoint", nullable = false)
	private double wasPoint;
	
	@Column(name = "wusPoint", nullable =  false)
	private double wusPoint;
	
	@Column(name = "tcfPoint", nullable = false)
	private double tcfPoint;
	
	@Column(name = "efcPOint", nullable = false)
	private double efcPoint;
	
	@Column(name = "totalPoint", nullable = false)
	private double totalPoint;
	
	@Column(name = "totalCost", nullable = false)
	private double totalCost;
	
	@Column(name = "totalHour", nullable = false)
	private double totalHour;
	
	@Column(name = "payment", nullable = false)
	private int payment;
	
	
}
