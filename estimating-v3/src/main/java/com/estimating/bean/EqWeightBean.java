package com.estimating.bean;


public class EqWeightBean {
	private static final long serialVersionUID = 1L;
	
	private int eqSimple;
	private int eqAverage;
	private int eqComplex;
	/**
	 * @param eqSimple
	 * @param eqAverage
	 * @param eqComplex
	 */
	public EqWeightBean(int eqSimple, int eqAverage, int eqComplex) {
		super();
		this.eqSimple = eqSimple;
		this.eqAverage = eqAverage;
		this.eqComplex = eqComplex;
	}
	/**
	 * 
	 */
	public EqWeightBean() {
		super();
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
