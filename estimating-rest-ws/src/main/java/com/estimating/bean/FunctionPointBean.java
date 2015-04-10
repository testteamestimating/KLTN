package com.estimating.bean;

import java.sql.Timestamp;

public class FunctionPointBean {

	private static final long serialVersionUID = 1L;
	
	private int functionPointId;
	
	private int eiWeight;
	private int eoWeight;
	private int ilfWeight;
	private int eqWeight;
	private int eifWeight;
	private int vafWeight;
	private int version;
	private Timestamp createDate;
	private Timestamp updateDate;
	private double eiPoint;
	private double lifPoint;
	private double eoPoint;
	private double upPoint;
	private double eifPoint;
	private double vafPoint;
	private double totalPoint;
	private double totalCost;
	private double totalHour;
	private int payment;
	/**
	 * @param functionPointId
	 * @param eiWeight
	 * @param eoWeight
	 * @param ilfWeight
	 * @param eqWeight
	 * @param eifWeight
	 * @param vafWeight
	 * @param version
	 * @param createDate
	 * @param updateDate
	 * @param eiPoint
	 * @param lifPoint
	 * @param eoPoint
	 * @param eqPoint
	 * @param upPoint
	 * @param eifPoint
	 * @param vafPoint
	 * @param totalPoint
	 * @param totalCost
	 * @param totalHour
	 * @param payment
	 */
	public FunctionPointBean(int functionPointId, int eiWeight, int eoWeight,
			int ilfWeight, int eqWeight, int eifWeight, int vafWeight,
			int version, Timestamp createDate, Timestamp updateDate,
			double eiPoint, double lifPoint, double eoPoint, double eqPoint,
			double upPoint, double eifPoint, double vafPoint,
			double totalPoint, double totalCost, double totalHour, int payment) {
		super();
		this.functionPointId = functionPointId;
		this.eiWeight = eiWeight;
		this.eoWeight = eoWeight;
		this.ilfWeight = ilfWeight;
		this.eqWeight = eqWeight;
		this.eifWeight = eifWeight;
		this.vafWeight = vafWeight;
		this.version = version;
		this.createDate = createDate;
		this.updateDate = updateDate;
		this.eiPoint = eiPoint;
		this.lifPoint = lifPoint;
		this.eoPoint = eoPoint;
		this.eqPoint = eqPoint;
		this.upPoint = upPoint;
		this.eifPoint = eifPoint;
		this.vafPoint = vafPoint;
		this.totalPoint = totalPoint;
		this.totalCost = totalCost;
		this.totalHour = totalHour;
		this.payment = payment;
	}
	/**
	 * 
	 */
	public FunctionPointBean() {
		super();
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
	 * @return the eiWeight
	 */
	public int getEiWeight() {
		return eiWeight;
	}
	/**
	 * @param eiWeight the eiWeight to set
	 */
	public void setEiWeight(int eiWeight) {
		this.eiWeight = eiWeight;
	}
	/**
	 * @return the eoWeight
	 */
	public int getEoWeight() {
		return eoWeight;
	}
	/**
	 * @param eoWeight the eoWeight to set
	 */
	public void setEoWeight(int eoWeight) {
		this.eoWeight = eoWeight;
	}
	/**
	 * @return the ilfWeight
	 */
	public int getIlfWeight() {
		return ilfWeight;
	}
	/**
	 * @param ilfWeight the ilfWeight to set
	 */
	public void setIlfWeight(int ilfWeight) {
		this.ilfWeight = ilfWeight;
	}
	/**
	 * @return the eqWeight
	 */
	public int getEqWeight() {
		return eqWeight;
	}
	/**
	 * @param eqWeight the eqWeight to set
	 */
	public void setEqWeight(int eqWeight) {
		this.eqWeight = eqWeight;
	}
	/**
	 * @return the eifWeight
	 */
	public int getEifWeight() {
		return eifWeight;
	}
	/**
	 * @param eifWeight the eifWeight to set
	 */
	public void setEifWeight(int eifWeight) {
		this.eifWeight = eifWeight;
	}
	/**
	 * @return the vafWeight
	 */
	public int getVafWeight() {
		return vafWeight;
	}
	/**
	 * @param vafWeight the vafWeight to set
	 */
	public void setVafWeight(int vafWeight) {
		this.vafWeight = vafWeight;
	}
	/**
	 * @return the eqPoint
	 */
	public double getEqPoint() {
		return eqPoint;
	}
	/**
	 * @param eqPoint the eqPoint to set
	 */
	public void setEqPoint(double eqPoint) {
		this.eqPoint = eqPoint;
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
	 * @return the createDate
	 */
	public Timestamp getCreateDate() {
		return createDate;
	}
	/**
	 * @param createDate the createDate to set
	 */
	public void setCreateDate(Timestamp createDate) {
		this.createDate = createDate;
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
	 * @return the eiPoint
	 */
	public double getEiPoint() {
		return eiPoint;
	}
	/**
	 * @param eiPoint the eiPoint to set
	 */
	public void setEiPoint(double eiPoint) {
		this.eiPoint = eiPoint;
	}
	/**
	 * @return the lifPoint
	 */
	public double getLifPoint() {
		return lifPoint;
	}
	/**
	 * @param lifPoint the lifPoint to set
	 */
	public void setLifPoint(double lifPoint) {
		this.lifPoint = lifPoint;
	}
	/**
	 * @return the eoPoint
	 */
	public double getEoPoint() {
		return eoPoint;
	}
	/**
	 * @param eoPoint the eoPoint to set
	 */
	public void setEoPoint(double eoPoint) {
		this.eoPoint = eoPoint;
	}
	/**
	 * @return the upPoint
	 */
	public double getUpPoint() {
		return upPoint;
	}
	/**
	 * @param upPoint the upPoint to set
	 */
	public void setUpPoint(double upPoint) {
		this.upPoint = upPoint;
	}
	/**
	 * @return the eifPoint
	 */
	public double getEifPoint() {
		return eifPoint;
	}
	/**
	 * @param eifPoint the eifPoint to set
	 */
	public void setEifPoint(double eifPoint) {
		this.eifPoint = eifPoint;
	}
	/**
	 * @return the vafPoint
	 */
	public double getVafPoint() {
		return vafPoint;
	}
	/**
	 * @param vafPoint the vafPoint to set
	 */
	public void setVafPoint(double vafPoint) {
		this.vafPoint = vafPoint;
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
