package com.estimating.bean;


public class IlfWeightBean {
	private static final long serialVersionUID = 1L;
	
	private int ilfSimple;
	private int ilfAverage;
	private int ilfComplex;
	/**
	 * @param ilfSimple
	 * @param ilfAverage
	 * @param ilfComplex
	 */
	public IlfWeightBean(int ilfSimple, int ilfAverage, int ilfComplex) {
		super();
		this.ilfSimple = ilfSimple;
		this.ilfAverage = ilfAverage;
		this.ilfComplex = ilfComplex;
	}
	/**
	 * 
	 */
	public IlfWeightBean() {
		super();
	}
	/**
	 * @return the ilfSimple
	 */
	public int getIlfSimple() {
		return ilfSimple;
	}
	/**
	 * @param ilfSimple the ilfSimple to set
	 */
	public void setIlfSimple(int ilfSimple) {
		this.ilfSimple = ilfSimple;
	}
	/**
	 * @return the ilfAverage
	 */
	public int getIlfAverage() {
		return ilfAverage;
	}
	/**
	 * @param ilfAverage the ilfAverage to set
	 */
	public void setIlfAverage(int ilfAverage) {
		this.ilfAverage = ilfAverage;
	}
	/**
	 * @return the ilfComplex
	 */
	public int getIlfComplex() {
		return ilfComplex;
	}
	/**
	 * @param ilfComplex the ilfComplex to set
	 */
	public void setIlfComplex(int ilfComplex) {
		this.ilfComplex = ilfComplex;
	}
	/**
	 * @return the serialversionuid
	 */
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
}
