package com.estimating.bean;


public class EiWeightBean {
	private static final long serialVersionUID = 1L;
	
	private int eiSimple;
	private int eiAverage;
	private int eiComplex;
	/**
	 * @param eiSimple
	 * @param eiAverage
	 * @param eiComplex
	 */
	public EiWeightBean(int eiSimple, int eiAverage, int eiComplex) {
		super();
		this.eiSimple = eiSimple;
		this.eiAverage = eiAverage;
		this.eiComplex = eiComplex;
	}
	/**
	 * 
	 */
	public EiWeightBean() {
		super();
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
