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
@Table(name = "eoWeight")
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
@AttributeOverride(name = "id", column =@Column(name = "eoId"))
public class EoWeight extends BaseEntity {
	
	private static final long serialVersionUID = 1L;
	
	@OneToOne
	@PrimaryKeyJoinColumn
	private FunctionPoint functionPoint;
	
	@Column(name = "eoSimple", nullable = false, columnDefinition = "int default 0")
	private int eoSimple;
	
	@Column(name = "eoAverage", nullable = false, columnDefinition = "int default 0")
	private int eoAverage;
	
	@Column(name = "eoComplex", nullable = false, columnDefinition = "int default 0")
	private int eoComplex;

	/**
	 * @param eoSimple
	 * @param eoAverage
	 * @param eoComplex
	 */
	public EoWeight(int eoSimple, int eoAverage, int eoComplex) {
		super();
		this.eoSimple = eoSimple;
		this.eoAverage = eoAverage;
		this.eoComplex = eoComplex;
	}

	/**
	 * 
	 */
	public EoWeight() {
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
	 * @return the eoSimple
	 */
	public int getEoSimple() {
		return eoSimple;
	}

	/**
	 * @param eoSimple the eoSimple to set
	 */
	public void setEoSimple(int eoSimple) {
		this.eoSimple = eoSimple;
	}

	/**
	 * @return the eoAverage
	 */
	public int getEoAverage() {
		return eoAverage;
	}

	/**
	 * @param eoAverage the eoAverage to set
	 */
	public void setEoAverage(int eoAverage) {
		this.eoAverage = eoAverage;
	}

	/**
	 * @return the eoComplex
	 */
	public int getEoComplex() {
		return eoComplex;
	}

	/**
	 * @param eoComplex the eoComplex to set
	 */
	public void setEoComplex(int eoComplex) {
		this.eoComplex = eoComplex;
	}

	/**
	 * @return the serialversionuid
	 */
	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	
}
