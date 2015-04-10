package com.estimating.bean;


public class UsecasePointPropertiesBean {
	
	private static final long serialVersionUID = 1L;
	
	private int UsecasePointPropertiesId;
	private int usecasePointId;
	private int commonTypeId;
	private String usecasePointPropertiesName;
	/**
	 * @param usecasePointPropertiesId
	 * @param usecasePointId
	 * @param commonTypeId
	 * @param usecasePointPropertiesName
	 */
	public UsecasePointPropertiesBean(int usecasePointPropertiesId,
			int usecasePointId, int commonTypeId,
			String usecasePointPropertiesName) {
		super();
		UsecasePointPropertiesId = usecasePointPropertiesId;
		this.usecasePointId = usecasePointId;
		this.commonTypeId = commonTypeId;
		this.usecasePointPropertiesName = usecasePointPropertiesName;
	}
	/**
	 * 
	 */
	public UsecasePointPropertiesBean() {
		super();
	}
	/**
	 * @return the usecasePointPropertiesId
	 */
	public int getUsecasePointPropertiesId() {
		return UsecasePointPropertiesId;
	}
	/**
	 * @param usecasePointPropertiesId the usecasePointPropertiesId to set
	 */
	public void setUsecasePointPropertiesId(int usecasePointPropertiesId) {
		UsecasePointPropertiesId = usecasePointPropertiesId;
	}
	/**
	 * @return the usecasePointId
	 */
	public int getUsecasePointId() {
		return usecasePointId;
	}
	/**
	 * @param usecasePointId the usecasePointId to set
	 */
	public void setUsecasePointId(int usecasePointId) {
		this.usecasePointId = usecasePointId;
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
	 * @return the usecasePointPropertiesName
	 */
	public String getUsecasePointPropertiesName() {
		return usecasePointPropertiesName;
	}
	/**
	 * @param usecasePointPropertiesName the usecasePointPropertiesName to set
	 */
	public void setUsecasePointPropertiesName(String usecasePointPropertiesName) {
		this.usecasePointPropertiesName = usecasePointPropertiesName;
	}
	/**
	 * @return the serialversionuid
	 */
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
}
