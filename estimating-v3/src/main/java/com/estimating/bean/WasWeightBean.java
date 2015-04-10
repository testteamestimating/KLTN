package com.estimating.bean;


public class WasWeightBean {
	private static final long serialVersionUID = 1L;
	
	private int asimple;
	private int aaverage;
	private int acomplex;
	/**
	 * @param asimple
	 * @param aaverage
	 * @param acomplex
	 */
	public WasWeightBean(int asimple, int aaverage, int acomplex) {
		super();
		this.asimple = asimple;
		this.aaverage = aaverage;
		this.acomplex = acomplex;
	}
	/**
	 * 
	 */
	public WasWeightBean() {
		super();
	}
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
	/**
	 * @return the serialversionuid
	 */
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
}
