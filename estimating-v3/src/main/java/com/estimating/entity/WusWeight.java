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
	private UsecasePoint ucp;
	
	@Column(name="usimple", nullable = false)
	private int usimple;
	
	@Column(name="uaverage", nullable = false)
	private int uaverage;
	
	@Column(name="ucomplex", nullable = false)
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
		
	}
	
	public WusWeight(int usimple, int uaverage, int ucpmplex) {
		super();
		this.usimple = usimple;
		this.uaverage = uaverage;
		this.ucomplex = ucpmplex;
	}
}
