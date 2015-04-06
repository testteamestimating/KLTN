package com.estimating.entity;

import javax.persistence.AttributeOverride;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "usecasePointProperties")
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
@AttributeOverride(name = "id", column = @Column(name = "ucppId"))
public class UsecasePointProperties extends BaseEntity {
	private static final long serialVersionUID = 1L;
	
	@ManyToOne
	@JoinColumn(name = "ucpId")
	private UsecasePoint usecasePoint;
	
	@OneToOne
	@JoinColumn(name = "ucpType")
	private CommonType commonType;
	
	@Column(name = "ucppName", nullable = false, length = 100)
	private String ucppName;

	/**
	 * @param usecasePoint
	 * @param commonType
	 * @param ucppName
	 */
	public UsecasePointProperties(UsecasePoint usecasePoint,
			CommonType commonType, String ucppName) {
		super();
		this.usecasePoint = usecasePoint;
		this.commonType = commonType;
		this.ucppName = ucppName;
	}

	/**
	 * 
	 */
	public UsecasePointProperties() {
		super();
	}

	/**
	 * @return the usecasePoint
	 */
	public UsecasePoint getUsecasePoint() {
		return usecasePoint;
	}

	/**
	 * @param usecasePoint the usecasePoint to set
	 */
	public void setUsecasePoint(UsecasePoint usecasePoint) {
		this.usecasePoint = usecasePoint;
	}

	/**
	 * @return the commonType
	 */
	public CommonType getCommonType() {
		return commonType;
	}

	/**
	 * @param commonType the commonType to set
	 */
	public void setCommonType(CommonType commonType) {
		this.commonType = commonType;
	}

	/**
	 * @return the ucppName
	 */
	public String getUcppName() {
		return ucppName;
	}

	/**
	 * @param ucppName the ucppName to set
	 */
	public void setUcppName(String ucppName) {
		this.ucppName = ucppName;
	}

	/**
	 * @return the serialversionuid
	 */
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
}
