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
@Table(name = "eiWeight")
@Inheritance(strategy  = InheritanceType.TABLE_PER_CLASS)
@AttributeOverride(name = "id", column = @Column(name = "eiId"))
public class EiWeight extends BaseEntity {
	private static final long serialVersionUID = 1L;
	
	@OneToOne
	@PrimaryKeyJoinColumn
	FunctionPoint functionPoint;
	
	@Column(name = "eiSimple", nullable = false, columnDefinition = "int default 0")
	private int eiSimple;
	
	@Column(name  = "eiAverage", nullable = false, columnDefinition = "int default 0")
	private int eiAverage;
	
	@Column(name = "eiComplex", nullable = false, columnDefinition = "int default 0")
	private int eiComplex;

	/**
	 * @param eiWeight
	 * @param eiAverage
	 * @param eiComplex
	 */
	public EiWeight(int eiSimple, int eiAverage, int eiComplex) {
		super();
		this.eiSimple = eiSimple;
		this.eiAverage = eiAverage;
		this.eiComplex = eiComplex;
	}
	public EiWeight() {
		super();
		
	}
	/**
	 * @return the functionPoint
	 */
	public FunctionPoint getFunctionPoint() {
		return functionPoint;
	}
	/**
	 * @param functionPoint the functionPoint to set
	 */
	public void setFunctionPoint(FunctionPoint functionPoint) {
		this.functionPoint = functionPoint;
	}
	/**
	 * @return the eiSimple
	 */
	public int getEiSimple() {
		return eiSimple;
	}
	/**
	 * @param eiSimple the eiSimple to set
	 */
	public void setEiSimple(int eiSimple) {
		this.eiSimple = eiSimple;
	}
	/**
	 * @return the eiAverage
	 */
	public int getEiAverage() {
		return eiAverage;
	}
	/**
	 * @param eiAverage the eiAverage to set
	 */
	public void setEiAverage(int eiAverage) {
		this.eiAverage = eiAverage;
	}
	/**
	 * @return the eiComplex
	 */
	public int getEiComplex() {
		return eiComplex;
	}
	/**
	 * @param eiComplex the eiComplex to set
	 */
	public void setEiComplex(int eiComplex) {
		this.eiComplex = eiComplex;
	}
	/**
	 * @return the serialversionuid
	 */
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
	
}
