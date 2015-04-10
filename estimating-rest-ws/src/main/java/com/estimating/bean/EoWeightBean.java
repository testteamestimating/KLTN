package com.estimating.bean;


public class EoWeightBean {
	private static final long serialVersionUID = 1L;
	private int eoSimple;
	private int eoAverage;
	private int eoComplex;
	/**
	 * @param eoSimple
	 * @param eoAverage
	 * @param eoComplex
	 */
	public EoWeightBean(int eoSimple, int eoAverage, int eoComplex) {
		super();
		this.eoSimple = eoSimple;
		this.eoAverage = eoAverage;
		this.eoComplex = eoComplex;
	}
	/**
	 * 
	 */
	public EoWeightBean() {
		super();
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
