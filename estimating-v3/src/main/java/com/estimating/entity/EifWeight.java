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
@Table(name  = "eifWeight")
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
@AttributeOverride(name = "id", column = @Column(name = "eifId"))
public class EifWeight extends BaseEntity {
	private static final long serialVersionUID = 1L;
	
	@OneToOne
	@PrimaryKeyJoinColumn
	private FunctionPoint functionPoint;
	
	@Column(name = "eifSimple", nullable = false, columnDefinition = "int default 0")
	private int eifSimple;
	
	@Column(name = "eifAverage", nullable = false, columnDefinition = "int default 0")
	private int eifAverage;
	
	@Column(name = "eifComplex", nullable = false, columnDefinition = "int default 0")
	private int eifComplex;

	/**
	 * @param eifSimple
	 * @param eifAverage
	 * @param eifComplex
	 */
	public EifWeight(int eifSimple, int eifAverage, int eifComplex) {
		super();
		this.eifSimple = eifSimple;
		this.eifAverage = eifAverage;
		this.eifComplex = eifComplex;
	}

	/**
	 * 
	 */
	public EifWeight() {
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
	 * @return the eifSimple
	 */
	public int getEifSimple() {
		return eifSimple;
	}

	/**
	 * @param eifSimple the eifSimple to set
	 */
	public void setEifSimple(int eifSimple) {
		this.eifSimple = eifSimple;
	}

	/**
	 * @return the eifAverage
	 */
	public int getEifAverage() {
		return eifAverage;
	}

	/**
	 * @param eifAverage the eifAverage to set
	 */
	public void setEifAverage(int eifAverage) {
		this.eifAverage = eifAverage;
	}

	/**
	 * @return the eifComplex
	 */
	public int getEifComplex() {
		return eifComplex;
	}

	/**
	 * @param eifComplex the eifComplex to set
	 */
	public void setEifComplex(int eifComplex) {
		this.eifComplex = eifComplex;
	}

	/**
	 * @return the serialversionuid
	 */
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
}
