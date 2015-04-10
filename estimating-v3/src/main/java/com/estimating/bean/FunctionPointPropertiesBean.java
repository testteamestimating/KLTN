package com.estimating.bean;


public class FunctionPointPropertiesBean {
	
	private static final long serialVersionUID = 1L;
	
	private int functionPointPropertiesId;
	private String functionPointPropertiesName;
	private int commonTypeId;
	private int functionPointId;
	/**
	 * @param functionPointPropertiesId
	 * @param functionPointPropertiesName
	 * @param commonTypeId
	 * @param functionPointId
	 */
	public FunctionPointPropertiesBean(int functionPointPropertiesId,
			String functionPointPropertiesName, int commonTypeId,
			int functionPointId) {
		super();
		this.functionPointPropertiesId = functionPointPropertiesId;
		this.functionPointPropertiesName = functionPointPropertiesName;
		this.commonTypeId = commonTypeId;
		this.functionPointId = functionPointId;
	}
	/**
	 * 
	 */
	public FunctionPointPropertiesBean() {
		super();
	}
	/**
	 * @return the functionPointPropertiesId
	 */
	public int getFunctionPointPropertiesId() {
		return functionPointPropertiesId;
	}
	/**
	 * @param functionPointPropertiesId the functionPointPropertiesId to set
	 */
	public void setFunctionPointPropertiesId(int functionPointPropertiesId) {
		this.functionPointPropertiesId = functionPointPropertiesId;
	}
	/**
	 * @return the functionPointPropertiesName
	 */
	public String getFunctionPointPropertiesName() {
		return functionPointPropertiesName;
	}
	/**
	 * @param functionPointPropertiesName the functionPointPropertiesName to set
	 */
	public void setFunctionPointPropertiesName(String functionPointPropertiesName) {
		this.functionPointPropertiesName = functionPointPropertiesName;
	}
	/**
	 * @return the commonTypeId
	 */
	public int getCommonTypeId() {
		return commonTypeId;
	}
	/**
	 * @param commonTypeId the commonTypeId to set
	 */
	public void setCommonTypeId(int commonTypeId) {
		this.commonTypeId = commonTypeId;
	}
	/**
	 * @return the functionPointId
	 */
	public int getFunctionPointId() {
		return functionPointId;
	}
	/**
	 * @param functionPointId the functionPointId to set
	 */
	public void setFunctionPointId(int functionPointId) {
		this.functionPointId = functionPointId;
	}
	/**
	 * @return the serialversionuid
	 */
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
}
