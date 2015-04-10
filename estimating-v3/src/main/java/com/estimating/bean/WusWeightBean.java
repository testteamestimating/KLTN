package com.estimating.bean;


public class WusWeightBean {
	private static final long serialVersionUID = 1L;
	
	private int usimple;
	private int uaverage;
	private int ucomplex;
	/**
	 * @param usimple
	 * @param uaverage
	 * @param ucomplex
	 */
	public WusWeightBean(int usimple, int uaverage, int ucomplex) {
		super();
		this.usimple = usimple;
		this.uaverage = uaverage;
		this.ucomplex = ucomplex;
	}
	/**
	 * 
	 */
	public WusWeightBean() {
		super();
	}
	/**
	 * @return the usimple
	 */
	public int getUsimple() {
		return usimple;
	}
	/**
	 * @param usimple the usimple to set
	 */
	public void setUsimple(int usimple) {
		this.usimple = usimple;
	}
	/**
	 * @return the uaverage
	 */
	public int getUaverage() {
		return uaverage;
	}
	/**
	 * @param uaverage the uaverage to set
	 */
	public void setUaverage(int uaverage) {
		this.uaverage = uaverage;
	}
	/**
	 * @return the ucomplex
	 */
	public int getUcomplex() {
		return ucomplex;
	}
	/**
	 * @param ucomplex the ucomplex to set
	 */
	public void setUcomplex(int ucomplex) {
		this.ucomplex = ucomplex;
	}
	/**
	 * @return the serialversionuid
	 */
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
}
