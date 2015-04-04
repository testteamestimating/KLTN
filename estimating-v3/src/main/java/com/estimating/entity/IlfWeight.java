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
@Table(name = "ilfWeight")
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
@AttributeOverride(name = "id", column = @Column(name = "ilfId"))
public class IlfWeight extends BaseEntity {
	private static final long serialVersionUID = 1L;
	
	@OneToOne
	@PrimaryKeyJoinColumn
	private FunctionPoint functionPoint;
	
	@Column(name = "ilfSimple", nullable = false, columnDefinition = "int default 0")
	private int ilfSimple;
	
	@Column(name = "ilfAverage", nullable = false, columnDefinition = "int default 0")
	private int ilfAverage;
	
	@Column(name = "ilfComplex", nullable = false, columnDefinition = "int default 0")
	private int ilfComplex;

	/**
	 * @param ilfSimple
	 * @param ilfAverage
	 * @param ilfComplex
	 */
	public IlfWeight(int ilfSimple, int ilfAverage, int ilfComplex) {
		super();
		this.ilfSimple = ilfSimple;
		this.ilfAverage = ilfAverage;
		this.ilfComplex = ilfComplex;
	}

	/**
	 * 
	 */
	public IlfWeight() {
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
	 * @return the ilfSimple
	 */
	public int getilfSimple() {
		return ilfSimple;
	}

	/**
	 * @param ilfSimple the ilfSimple to set
	 */
	public void setilfSimple(int ilfSimple) {
		this.ilfSimple = ilfSimple;
	}

	/**
	 * @return the ilfAverage
	 */
	public int getilfAverage() {
		return ilfAverage;
	}

	/**
	 * @param ilfAverage the ilfAverage to set
	 */
	public void setilfAverage(int ilfAverage) {
		this.ilfAverage = ilfAverage;
	}

	/**
	 * @return the ilfComplex
	 */
	public int getilfComplex() {
		return ilfComplex;
	}

	/**
	 * @param ilfComplex the ilfComplex to set
	 */
	public void setilfComplex(int ilfComplex) {
		this.ilfComplex = ilfComplex;
	}
	
	
	
}
