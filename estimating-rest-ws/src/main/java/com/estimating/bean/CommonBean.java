package com.estimating.bean;

public class CommonBean {
	private static final long serialVersionUID = 1L;
	
	private int cm_id;
	private String commonName;
	/**
	 * @param cm_id
	 * @param commonName
	 */
	public CommonBean(int cm_id, String commonName) {
		super();
		this.cm_id = cm_id;
		this.commonName = commonName;
	}
	/**
	 * 
	 */
	public CommonBean() {
		super();
	}
	/**
	 * @return the cm_id
	 */
	public int getCm_id() {
		return cm_id;
	}
	/**
	 * @param cm_id the cm_id to set
	 */
	public void setCm_id(int cm_id) {
		this.cm_id = cm_id;
	}
	/**
	 * @return the commonName
	 */
	public String getCommonName() {
		return commonName;
	}
	/**
	 * @param commonName the commonName to set
	 */
	public void setCommonName(String commonName) {
		this.commonName = commonName;
	}
	/**
	 * @return the serialversionuid
	 */
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
}
