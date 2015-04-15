package com.estimating.bean;


public class EifWeightBean {
	private static final long serialVersionUID = 1L;
	
	private int eifSimple;
	private int eifAverage;
	private int eifComplex;
	/**
	 * @param eifSimple
	 * @param eifAverage
	 * @param eifComplex
	 */
	public EifWeightBean(int eifSimple, int eifAverage, int eifComplex) {
		super();
		this.eifSimple = eifSimple;
		this.eifAverage = eifAverage;
		this.eifComplex = eifComplex;
	}
	/**
	 * 
	 */
	public EifWeightBean() {
		super();
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
