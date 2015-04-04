package com.estimating.entity;

import java.util.List;

import javax.persistence.AttributeOverride;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;


@Entity
@Table(name = "usecase_point")
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
@AttributeOverride(name = "id", column = @Column(name = "ucpId"))
public class UsecasePoint  extends BaseEntity {
	private static final long serialVersionUID = 1L;
	
	@ManyToOne
	@PrimaryKeyJoinColumn
	private Project project;
	
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
	
	@Column(name = "version", nullable = false)
	private int version;
	
	@Embedded
	private DateEmbedded date;
	
	@Column(name = "wasPoint", nullable = false, columnDefinition = "double default 0.0")
	private double wasPoint;
	
	@Column(name = "wusPoint", nullable =  false, columnDefinition = "double default 0.0")
	private double wusPoint;
	
	@Column(name = "tcfPoint", nullable = false, columnDefinition = "double default 0.0")
	private double tcfPoint;
	
	@Column(name = "efcPOint", nullable = false, columnDefinition = "double default 0.0")
	private double efcPoint;
	
	@Column(name = "totalPoint", nullable = false, columnDefinition = "double default 0.0")
	private double totalPoint;
	
	@Column(name = "totalCost", nullable = false, columnDefinition = "double default 0.0")
	private double totalCost;
	
	@Column(name = "totalHour", nullable = false, columnDefinition = "double default 0.0")
	private double totalHour;
	
	@Column(name = "payment", nullable = false, columnDefinition = "double default 0.0")
	private int payment;
	
	
}
