package com.estimating.bean;

import java.sql.Timestamp;

public class UsecasePointBean {
private static final long serialVersionUID = 1L;
	
	private int usecasePointId;
	private int projectId;
	private int wusWeightId;
	private int waWeightId;
	private int tcfWeightId;
	private int efcWeightId;
	private int version;
	private Timestamp createdDate;
	private Timestamp updateDate;
	private double wasPoint;
	private double wusPoint;
	private double tcfPoint;
	private double efcPoint;
	private double totalPoint;
	private double totalCost;
	private double totalHour;
	private int payment;
	/**
	 * @param usecasePointId
	 * @param projectId
	 * @param wusWeightId
	 * @param waWeightId
	 * @param tcfWeightId
	 * @param efcWeightId
	 * @param version
	 * @param createdDate
	 * @param updateDate
	 * @param wasPoint
	 * @param wusPoint
	 * @param tcfPoint
	 * @param efcPoint
	 * @param totalPoint
	 * @param totalCost
	 * @param totalHour
	 * @param payment
	 */
	public UsecasePointBean(int usecasePointId, int projectId, int wusWeightId,
			int waWeightId, int tcfWeightId, int efcWeightId, int version,
			Timestamp createdDate, Timestamp updateDate, double wasPoint,
			double wusPoint, double tcfPoint, double efcPoint,
			double totalPoint, double totalCost, double totalHour, int payment) {
		super();
		this.usecasePointId = usecasePointId;
		this.projectId = projectId;
		this.wusWeightId = wusWeightId;
		this.waWeightId = waWeightId;
		this.tcfWeightId = tcfWeightId;
		this.efcWeightId = efcWeightId;
		this.version = version;
		this.createdDate = createdDate;
		this.updateDate = updateDate;
		this.wasPoint = wasPoint;
		this.wusPoint = wusPoint;
		this.tcfPoint = tcfPoint;
		this.efcPoint = efcPoint;
		this.totalPoint = totalPoint;
		this.totalCost = totalCost;
		this.totalHour = totalHour;
		this.payment = payment;
	}
	/**
	 * 
	 */
	public UsecasePointBean() {
		super();
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
	 * @return the projectId
	 */
	public int getProjectId() {
		return projectId;
	}
	/**
	 * @param projectId the projectId to set
	 */
	public void setProjectId(int projectId) {
		this.projectId = projectId;
	}
	/**
	 * @return the wusWeightId
	 */
	public int getWusWeightId() {
		return wusWeightId;
	}
	/**
	 * @param wusWeightId the wusWeightId to set
	 */
	public void setWusWeightId(int wusWeightId) {
		this.wusWeightId = wusWeightId;
	}
	/**
	 * @return the waWeightId
	 */
	public int getWaWeightId() {
		return waWeightId;
	}
	/**
	 * @param waWeightId the waWeightId to set
	 */
	public void setWaWeightId(int waWeightId) {
		this.waWeightId = waWeightId;
	}
	/**
	 * @return the tcfWeightId
	 */
	public int getTcfWeightId() {
		return tcfWeightId;
	}
	/**
	 * @param tcfWeightId the tcfWeightId to set
	 */
	public void setTcfWeightId(int tcfWeightId) {
		this.tcfWeightId = tcfWeightId;
	}
	/**
	 * @return the efcWeightId
	 */
	public int getEfcWeightId() {
		return efcWeightId;
	}
	/**
	 * @param efcWeightId the efcWeightId to set
	 */
	public void setEfcWeightId(int efcWeightId) {
		this.efcWeightId = efcWeightId;
	}
	/**
	 * @return the version
	 */
	public int getVersion() {
		return version;
	}
	/**
	 * @param version the version to set
	 */
	public void setVersion(int version) {
		this.version = version;
	}
	/**
	 * @return the createdDate
	 */
	public Timestamp getCreatedDate() {
		return createdDate;
	}
	/**
	 * @param createdDate the createdDate to set
	 */
	public void setCreatedDate(Timestamp createdDate) {
		this.createdDate = createdDate;
	}
	/**
	 * @return the updateDate
	 */
	public Timestamp getUpdateDate() {
		return updateDate;
	}
	/**
	 * @param updateDate the updateDate to set
	 */
	public void setUpdateDate(Timestamp updateDate) {
		this.updateDate = updateDate;
	}
	/**
	 * @return the wasPoint
	 */
	public double getWasPoint() {
		return wasPoint;
	}
	/**
	 * @param wasPoint the wasPoint to set
	 */
	public void setWasPoint(double wasPoint) {
		this.wasPoint = wasPoint;
	}
	/**
	 * @return the wusPoint
	 */
	public double getWusPoint() {
		return wusPoint;
	}
	/**
	 * @param wusPoint the wusPoint to set
	 */
	public void setWusPoint(double wusPoint) {
		this.wusPoint = wusPoint;
	}
	/**
	 * @return the tcfPoint
	 */
	public double getTcfPoint() {
		return tcfPoint;
	}
	/**
	 * @param tcfPoint the tcfPoint to set
	 */
	public void setTcfPoint(double tcfPoint) {
		this.tcfPoint = tcfPoint;
	}
	/**
	 * @return the efcPoint
	 */
	public double getEfcPoint() {
		return efcPoint;
	}
	/**
	 * @param efcPoint the efcPoint to set
	 */
	public void setEfcPoint(double efcPoint) {
		this.efcPoint = efcPoint;
	}
	/**
	 * @return the totalPoint
	 */
	public double getTotalPoint() {
		return totalPoint;
	}
	/**
	 * @param totalPoint the totalPoint to set
	 */
	public void setTotalPoint(double totalPoint) {
		this.totalPoint = totalPoint;
	}
	/**
	 * @return the totalCost
	 */
	public double getTotalCost() {
		return totalCost;
	}
	/**
	 * @param totalCost the totalCost to set
	 */
	public void setTotalCost(double totalCost) {
		this.totalCost = totalCost;
	}
	/**
	 * @return the totalHour
	 */
	public double getTotalHour() {
		return totalHour;
	}
	/**
	 * @param totalHour the totalHour to set
	 */
	public void setTotalHour(double totalHour) {
		this.totalHour = totalHour;
	}
	/**
	 * @return the payment
	 */
	public int getPayment() {
		return payment;
	}
	/**
	 * @param payment the payment to set
	 */
	public void setPayment(int payment) {
		this.payment = payment;
	}
	/**
	 * @return the serialversionuid
	 */
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
}
