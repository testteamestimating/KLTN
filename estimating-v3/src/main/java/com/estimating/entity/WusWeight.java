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
@Table(name="wusWeight")
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
@AttributeOverride(name = "id", column = @Column(name = "wusId"))
public class WusWeight  extends BaseEntity {
	
	private static final long serialVersionUID = 1L;
	
	@OneToOne
	@PrimaryKeyJoinColumn
	private UsecasePoint usecasePoint;
	
	@Column(name="usimple", nullable = false, columnDefinition = "int default 0")
	private int usimple;
	
	@Column(name="uaverage", nullable = false, columnDefinition = "int default 0")
	private int uaverage;
	
	@Column(name="ucomplex", nullable = false, columnDefinition = "int default 0")
	private int ucomplex;

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
	
	public WusWeight() {
		this.usimple = 0;
		this.uaverage = 0;
		this.ucomplex = 0;
	}
	
	public WusWeight(int usimple, int uaverage, int ucpmplex) {
		super();
		this.usimple = usimple;
		this.uaverage = uaverage;
		this.ucomplex = ucpmplex;
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
}
