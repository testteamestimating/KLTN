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
@Table(name = "functionPoint")
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
@AttributeOverride(name = "id", column = @Column(name = "fpId"))
public class FunctionPoint extends BaseEntity {
	private static final long serialVersionUID = 1L;
	
	@ManyToOne
	@PrimaryKeyJoinColumn
	private Project project;
	
	@OneToOne
	@JoinColumn(name = "eiId")
	private EiWeight eiWeight;
	
	@OneToOne
	@JoinColumn(name = "eoId")
	private EoWeight eoWeight;
	
	@OneToOne
	@JoinColumn(name = "lifId")
	private IlfWeight ilfWeight;
	
	@OneToOne
	@JoinColumn(name = "upId")
	private EqWeight eqWeight;
	
	@OneToOne
	@JoinColumn(name = "eifId")
	private EifWeight eifWeight;
	
	@OneToOne
	@JoinColumn(name = "vafId")
	private VafWeight vafWeight;
	
	@OneToMany(mappedBy = "functionPoint")
	private List<FunctionPointProperties> funtionPointProperties;
	
	@Column(name = "version", nullable = false, columnDefinition = "int default 0")
	private int version;
	
	@Embedded
	private DateEmbedded date;
	
	@Column(name = "eiPoint", nullable = false, columnDefinition = "double default 0.0")
	private double eiPoint;
	
	@Column(name = "lifPoint", nullable = false, columnDefinition = "double default 0.0")
	private double lifPoint;
	
	@Column(name = "eoPoint", nullable = false, columnDefinition = "double default 0.0")
	private double eoPoint;
	
	@Column(name = "upPoint", nullable = false, columnDefinition = "double default 0.0")
	private double upPoint;
	
	@Column(name = "eifPoint", nullable = false, columnDefinition = "double default 0.0")
	private double eifPoint;
	
	@Column(name = "vafPoint", nullable = false, columnDefinition = "double default 0.0")
	private double vafPoint;
	
	@Column(name = "totalPoint", nullable = false, columnDefinition = "double default 0.0")
	private double totalPoint;
	
	@Column(name = "totalCost", nullable = false, columnDefinition = "double default 0.0")
	private double totalCost;
	
	@Column(name = "totalHour", nullable = false, columnDefinition = "double default 0.0")
	private double totalHour;
	
	@Column(name = "payment", nullable = false, columnDefinition = "double default 0.0")
	private int payment;

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
	 * @return the funtionPointProperties
	 */
	public List<FunctionPointProperties> getFuntionPointProperties() {
		return funtionPointProperties;
	}

	/**
	 * @param funtionPointProperties the funtionPointProperties to set
	 */
	public void setFuntionPointProperties(
			List<FunctionPointProperties> funtionPointProperties) {
		this.funtionPointProperties = funtionPointProperties;
	}

	



	/**
	 * @param project
	 * @param eiWeight
	 * @param eoWeight
	 * @param ilfWeight
	 * @param eqWeight
	 * @param eifWeight
	 * @param vafWeight
	 * @param version
	 * @param date
	 * @param eiPoint
	 * @param lifPoint
	 * @param eoPoint
	 * @param upPoint
	 * @param eifPoint
	 * @param vafPoint
	 * @param totalPoint
	 * @param totalCost
	 * @param totalHour
	 * @param payment
	 */
	public FunctionPoint(Project project, EiWeight eiWeight, EoWeight eoWeight,
			IlfWeight ilfWeight, EqWeight eqWeight, EifWeight eifWeight,
			VafWeight vafWeight, int version, DateEmbedded date,
			double eiPoint, double lifPoint, double eoPoint, double upPoint,
			double eifPoint, double vafPoint, double totalPoint,
			double totalCost, double totalHour, int payment) {
		super();
		this.project = project;
		this.eiWeight = eiWeight;
		this.eoWeight = eoWeight;
		this.ilfWeight = ilfWeight;
		this.eqWeight = eqWeight;
		this.eifWeight = eifWeight;
		this.vafWeight = vafWeight;
		this.version = version;
		this.date = date;
		this.eiPoint = eiPoint;
		this.lifPoint = lifPoint;
		this.eoPoint = eoPoint;
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
	public FunctionPoint() {
		super();
	}

	/**
	 * @return the eiWeight
	 */
	public EiWeight getEiWeight() {
		return eiWeight;
	}

	/**
	 * @param eiWeight the eiWeight to set
	 */
	public void setEiWeight(EiWeight eiWeight) {
		this.eiWeight = eiWeight;
	}

	/**
	 * @return the ilfWeight
	 */
	public IlfWeight getIlfWeight() {
		return ilfWeight;
	}

	/**
	 * @param ilfWeight the ilfWeight to set
	 */
	public void setIlfWeight(IlfWeight ilfWeight) {
		this.ilfWeight = ilfWeight;
	}

	
	/**
	 * @return the eqWeight
	 */
	public EqWeight getEqWeight() {
		return eqWeight;
	}

	/**
	 * @param eqWeight the eqWeight to set
	 */
	public void setEqWeight(EqWeight eqWeight) {
		this.eqWeight = eqWeight;
	}

	/**
	 * @return the eifWeight
	 */

	public EoWeight getEoWeight() {
		return eoWeight;
	}

	public void setEoWeight(EoWeight eoWeight) {
		this.eoWeight = eoWeight;
	}

	public EifWeight getEifWeight() {
		return eifWeight;
	}

	/**
	 * @param eifWeight the eifWeight to set
	 */
	public void setEifWeight(EifWeight eifWeight) {
		this.eifWeight = eifWeight;
	}

	/**
	 * @return the vafWeight
	 */
	public VafWeight getVafWeight() {
		return vafWeight;
	}

	/**
	 * @param vafWeight the vafWeight to set
	 */
	public void setVafWeight(VafWeight vafWeight) {
		this.vafWeight = vafWeight;
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
