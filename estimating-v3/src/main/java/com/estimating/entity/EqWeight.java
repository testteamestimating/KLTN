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
@Table(name = "eqWeight")
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
@AttributeOverride(name = "id", column = @Column(name = "eqId"))
public class EqWeight extends BaseEntity {
	private static final long serialVersionUID = 1L;
	
	@OneToOne
	@PrimaryKeyJoinColumn
	private FunctionPoint functionPoint;
	
	@Column(name = "eqSimple", nullable = false, columnDefinition = "int default 0")
	private int eqSimple;
	
	@Column(name  = "eqAverage", nullable = false, columnDefinition = "int default 0")
	private int eqAverage;
	
	@Column(name = "eqComplex", nullable = false, columnDefinition = "int default 0")
	private int eqComplex;

	/**
	 * @param eqSimple
	 * @param eqAverage
	 * @param eqComplex
	 */
	public EqWeight(int eqSimple, int eqAverage, int eqComplex) {
		super();
		this.eqSimple = eqSimple;
		this.eqAverage = eqAverage;
		this.eqComplex = eqComplex;
	}

	/**
	 * 
	 */
	public EqWeight() {
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
	 * @return the eqSimple
	 */
	public int getEqSimple() {
		return eqSimple;
	}

	/**
	 * @param eqSimple the eqSimple to set
	 */
	public void setEqSimple(int eqSimple) {
		this.eqSimple = eqSimple;
	}

	/**
	 * @return the eqAverage
	 */
	public int getEqAverage() {
		return eqAverage;
	}

	/**
	 * @param eqAverage the eqAverage to set
	 */
	public void setEqAverage(int eqAverage) {
		this.eqAverage = eqAverage;
	}

	/**
	 * @return the eqComplex
	 */
	public int getEqComplex() {
		return eqComplex;
	}

	/**
	 * @param eqComplex the eqComplex to set
	 */
	public void setEqComplex(int eqComplex) {
		this.eqComplex = eqComplex;
	}

	/**
	 * @return the serialversionuid
	 */
	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	
	
}
