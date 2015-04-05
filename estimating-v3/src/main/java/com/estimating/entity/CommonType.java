package com.estimating.entity;

import javax.persistence.AttributeOverride;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name = "commonType")
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
@AttributeOverride(name = "id", column = @Column(name = "cmId"))
public class CommonType  extends BaseEntity {
	
	

	private static final long serialVersionUID = 1L;
	
	@OneToOne
	@PrimaryKeyJoinColumn
	private UsecasePointProperties usecasePointProperties;
	
	@OneToOne
	@PrimaryKeyJoinColumn
	private FunctionPointProperties functionPointProperties;
	
	@Column(name = "commonName", nullable = false, length = 50)
	private String commonName;
	
	/**
	 * @param commonName
	 */
	public CommonType(String commonName) {
		super();
		this.commonName = commonName;
	}

	/**
	 * 
	 */
	public CommonType() {
		super();
	}

	/**
	 * @return the usecasePointProperties
	 */
	public UsecasePointProperties getUsecasePointProperties() {
		return usecasePointProperties;
	}

	/**
	 * @param usecasePointProperties the usecasePointProperties to set
	 */
	public void setUsecasePointProperties(
			UsecasePointProperties usecasePointProperties) {
		this.usecasePointProperties = usecasePointProperties;
	}

	/**
	 * @return the functionPointProperties
	 */
	public FunctionPointProperties getFunctionPointProperties() {
		return functionPointProperties;
	}

	/**
	 * @param functionPointProperties the functionPointProperties to set
	 */
	public void setFunctionPointProperties(
			FunctionPointProperties functionPointProperties) {
		this.functionPointProperties = functionPointProperties;
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
