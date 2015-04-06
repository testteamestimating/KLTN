package com.estimating.entity;

import java.util.List;

import javax.persistence.AttributeOverride;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;


@Entity
@Table(name = "usecase_point")
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
@AttributeOverride(name = "id", column = @Column(name = "ucpId"))
public class UsecasePoint  extends BaseEntity {
	private static final long serialVersionUID = 1L;
	
	@ManyToOne
	@PrimaryKeyJoinColumn
	private Project project;
	
	@OneToOne
	@JoinColumn(name="wusId")
	private WusWeight wusWeight;
	
	@OneToOne
	@JoinColumn(name="wasId")
	private WasWeight waWeight;
	
	@OneToOne
	@JoinColumn(name="tcfId")
	private TcfWeight tcfWeight;
	
	@OneToOne
	@JoinColumn(name = "efcId")
	private EfcWeight efcWeight;
	
	@OneToMany(mappedBy = "usecasePoint")
	private List<UsecasePointProperties> usecaseProperties;
	
	@Column(name = "version", nullable = false)
	private int version;
	
	@Embedded
	private DateEmbedded date;
	
	@Column(name = "wasPoint", nullable = false, columnDefinition = "double default 0.0")
	private double wasPoint;
	
	@Column(name = "wusPoint", nullable =  false, columnDefinition = "double default 0.0")
	private double wusPoint;
	
	@Column(name = "tcfPoint", nullable = false, columnDefinition = "double default 0.0")
	private double tcfPoint;
	
	@Column(name = "efcPOint", nullable = false, columnDefinition = "double default 0.0")
	private double efcPoint;
	
	@Column(name = "totalPoint", nullable = false, columnDefinition = "double default 0.0")
	private double totalPoint;
	
	@Column(name = "totalCost", nullable = false, columnDefinition = "double default 0.0")
	private double totalCost;
	
	@Column(name = "totalHour", nullable = false, columnDefinition = "double default 0.0")
	private double totalHour;
	
	@Column(name = "payment", nullable = false, columnDefinition = "double default 0.0")
	private int payment;

	/**
	 * @param project
	 * @param wusWeight
	 * @param waWeight
	 * @param tcfWeight
	 * @param efcWeight
	 * @param usecaseProperties
	 * @param version
	 * @param date
	 * @param wasPoint
	 * @param wusPoint
	 * @param tcfPoint
	 * @param efcPoint
	 * @param totalPoint
	 * @param totalCost
	 * @param totalHour
	 * @param payment
	 */
	public UsecasePoint(Project project, WusWeight wusWeight,
			WasWeight waWeight, TcfWeight tcfWeight, EfcWeight efcWeight,
			List<UsecasePointProperties> usecaseProperties, int version,
			DateEmbedded date, double wasPoint, double wusPoint,
			double tcfPoint, double efcPoint, double totalPoint,
			double totalCost, double totalHour, int payment) {
		super();
		this.project = project;
		this.wusWeight = wusWeight;
		this.waWeight = waWeight;
		this.tcfWeight = tcfWeight;
		this.efcWeight = efcWeight;
		this.usecaseProperties = usecaseProperties;
		this.version = version;
		this.date = date;
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
	 * @param version
	 * @param date
	 * @param wasPoint
	 * @param wusPoint
	 * @param tcfPoint
	 * @param efcPoint
	 * @param totalPoint
	 * @param totalCost
	 * @param totalHour
	 * @param payment
	 */
	public UsecasePoint(int version, DateEmbedded date, double wasPoint,
			double wusPoint, double tcfPoint, double efcPoint,
			double totalPoint, double totalCost, double totalHour, int payment) {
		super();
		this.version = version;
		this.date = date;
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
	public UsecasePoint() {
		super();
	}

	/**
	 * @return the project
	 */
	public Project getProject() {
		return project;
	}

	/**
	 * @param project the project to set
	 */
	public void setProject(Project project) {
		this.project = project;
	}

	/**
	 * @return the wusWeight
	 */
	public WusWeight getWusWeight() {
		return wusWeight;
	}

	/**
	 * @param wusWeight the wusWeight to set
	 */
	public void setWusWeight(WusWeight wusWeight) {
		this.wusWeight = wusWeight;
	}

	/**
	 * @return the waWeight
	 */
	public WasWeight getWaWeight() {
		return waWeight;
	}

	/**
	 * @param waWeight the waWeight to set
	 */
	public void setWaWeight(WasWeight waWeight) {
		this.waWeight = waWeight;
	}

	/**
	 * @return the tcfWeight
	 */
	public TcfWeight getTcfWeight() {
		return tcfWeight;
	}

	/**
	 * @param tcfWeight the tcfWeight to set
	 */
	public void setTcfWeight(TcfWeight tcfWeight) {
		this.tcfWeight = tcfWeight;
	}

	/**
	 * @return the efcWeight
	 */
	public EfcWeight getEfcWeight() {
		return efcWeight;
	}

	/**
	 * @param efcWeight the efcWeight to set
	 */
	public void setEfcWeight(EfcWeight efcWeight) {
		this.efcWeight = efcWeight;
	}

	/**
	 * @return the usecaseProperties
	 */
	public List<UsecasePointProperties> getUsecaseProperties() {
		return usecaseProperties;
	}

	/**
	 * @param usecaseProperties the usecaseProperties to set
	 */
	public void setUsecaseProperties(List<UsecasePointProperties> usecaseProperties) {
		this.usecaseProperties = usecaseProperties;
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
	 * @return the date
	 */
	public DateEmbedded getDate() {
		return date;
	}

	/**
	 * @param date the date to set
	 */
	public void setDate(DateEmbedded date) {
		this.date = date;
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
