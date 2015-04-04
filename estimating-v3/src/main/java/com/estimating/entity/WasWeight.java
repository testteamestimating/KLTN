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
@Table(name="wasWeight")
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
@AttributeOverride(name = "id", column = @Column(name = "wasId"))
public class WasWeight extends BaseEntity{
private static final long serialVersionUID = 1L;
	
	@Column(name="asimple", nullable = false, columnDefinition = "int default 0")
	private int asimple;
	
	@Column(name="aaverage", nullable = false, columnDefinition = "int default 0")
	private int aaverage;
	
	@Column(name="acomplex", nullable = false, columnDefinition = "int default 0")
	private int acomplex;

	@OneToOne
	@PrimaryKeyJoinColumn
	private UsecasePoint usecasePoint;
	
	/**
	 * @return the asimple
	 */
	public int getAsimple() {
		return asimple;
	}

	/**
	 * @param asimple the asimple to set
	 */
	public void setAsimple(int asimple) {
		this.asimple = asimple;
	}

	/**
	 * @return the aaverage
	 */
	public int getAaverage() {
		return aaverage;
	}

	/**
	 * @param aaverage the aaverage to set
	 */
	public void setAaverage(int aaverage) {
		this.aaverage = aaverage;
	}

	/**
	 * @return the acomplex
	 */
	public int getAcomplex() {
		return acomplex;
	}

	/**
	 * @param acomplex the acomplex to set
	 */
	public void setAcomplex(int acomplex) {
		this.acomplex = acomplex;
	}

	public WasWeight() {
		this.asimple = 0;
		this.aaverage = 0;
		this.acomplex = 0;
	}
	
	public WasWeight(int asimple, int aaverage, int acpmplex) {
		super();
		this.asimple = asimple;
		this.aaverage = aaverage;
		this.acomplex = acpmplex;
	}

	/**
	 * @return the usecasePoint
	 */
	public UsecasePoint getUsecasePoint() {
		return usecasePoint;
	}

	/**
	 * @param usecasePoint the usecasePoint to set
	 */
	public void setUsecasePoint(UsecasePoint usecasePoint) {
		this.usecasePoint = usecasePoint;
	}
}
