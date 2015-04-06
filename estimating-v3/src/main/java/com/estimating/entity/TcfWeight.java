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
@Table(name = "tcfWeight")
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
@AttributeOverride(name = "id", column = @Column(name = "tcfId"))
public class TcfWeight  extends BaseEntity	 {
	
	private static final long serialVersionUID = 1L;
	
	@OneToOne
	@PrimaryKeyJoinColumn
	private UsecasePoint usecasePoint;
	
	@Column(name="access_for_3_parties", nullable=false, columnDefinition = "int default 0")
	private int accessFor3Parties;

	@Column(name="complex_processing", nullable=false, columnDefinition = "int default 0")
	private int complexProcessing;

	@Column(name="concurrent_use", nullable=false, columnDefinition = "int default 0")
	private int concurrentUse;

	@Column(name="distributed_system", nullable=false, columnDefinition = "int default 0")
	private int distributedSystem;

	@Column(name="easy_to_change", nullable = false, columnDefinition = "int default 0")
	private int easyToChange;

	@Column(name="easy_to_installation", nullable=false, columnDefinition = "int default 0")
	private int easyToInstallation;

	@Column(name="easy_to_use", nullable = false, columnDefinition = "int default 0")
	private int easyToUse;

	@Column(name="end_uses_efficiency", nullable=false, columnDefinition = "int default 0")
	private int endUsesEfficiency;

	@Column(name="performance_objectives", nullable=false, columnDefinition = "int default 0")
	private int performanceObjectives;

	@Column(name="portable", nullable=false, columnDefinition = "int default 0")
	private int portable;

	@Column(name="reusable_code", nullable=false, columnDefinition = "int default 0")
	private int reusableCode;

	@Column(name="special_security", nullable=false, columnDefinition = "int default 0")
	private int specialSecurity;

	@Column(name="training_needs", nullable=false, columnDefinition = "int default 0")
	private int trainingNeeds;

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
	 * @param accessFor3Parties
	 * @param complexProcessing
	 * @param concurrentUse
	 * @param distributedSystem
	 * @param easyToChange
	 * @param easyToInstallation
	 * @param easyToUse
	 * @param endUsesEfficiency
	 * @param performanceObjectives
	 * @param portable
	 * @param reusableCode
	 * @param specialSecurity
	 * @param trainingNeeds
	 */
	public TcfWeight(int accessFor3Parties, int complexProcessing,
			int concurrentUse, int distributedSystem, int easyToChange,
			int easyToInstallation, int easyToUse, int endUsesEfficiency,
			int performanceObjectives, int portable, int reusableCode,
			int specialSecurity, int trainingNeeds) {
		super();
		this.accessFor3Parties = accessFor3Parties;
		this.complexProcessing = complexProcessing;
		this.concurrentUse = concurrentUse;
		this.distributedSystem = distributedSystem;
		this.easyToChange = easyToChange;
		this.easyToInstallation = easyToInstallation;
		this.easyToUse = easyToUse;
		this.endUsesEfficiency = endUsesEfficiency;
		this.performanceObjectives = performanceObjectives;
		this.portable = portable;
		this.reusableCode = reusableCode;
		this.specialSecurity = specialSecurity;
		this.trainingNeeds = trainingNeeds;
	}

	/**
	 * 
	 */
	public TcfWeight() {
		super();
	}

	/**
	 * @return the accessFor3Parties
	 */
	public int getAccessFor3Parties() {
		return accessFor3Parties;
	}

	/**
	 * @param accessFor3Parties the accessFor3Parties to set
	 */
	public void setAccessFor3Parties(int accessFor3Parties) {
		this.accessFor3Parties = accessFor3Parties;
	}

	/**
	 * @return the complexProcessing
	 */
	public int getComplexProcessing() {
		return complexProcessing;
	}

	/**
	 * @param complexProcessing the complexProcessing to set
	 */
	public void setComplexProcessing(int complexProcessing) {
		this.complexProcessing = complexProcessing;
	}

	/**
	 * @return the concurrentUse
	 */
	public int getConcurrentUse() {
		return concurrentUse;
	}

	/**
	 * @param concurrentUse the concurrentUse to set
	 */
	public void setConcurrentUse(int concurrentUse) {
		this.concurrentUse = concurrentUse;
	}

	/**
	 * @return the distributedSystem
	 */
	public int getDistributedSystem() {
		return distributedSystem;
	}

	/**
	 * @param distributedSystem the distributedSystem to set
	 */
	public void setDistributedSystem(int distributedSystem) {
		this.distributedSystem = distributedSystem;
	}

	/**
	 * @return the easyToChange
	 */
	public int getEasyToChange() {
		return easyToChange;
	}

	/**
	 * @param easyToChange the easyToChange to set
	 */
	public void setEasyToChange(int easyToChange) {
		this.easyToChange = easyToChange;
	}

	/**
	 * @return the easyToInstallation
	 */
	public int getEasyToInstallation() {
		return easyToInstallation;
	}

	/**
	 * @param easyToInstallation the easyToInstallation to set
	 */
	public void setEasyToInstallation(int easyToInstallation) {
		this.easyToInstallation = easyToInstallation;
	}

	/**
	 * @return the easyToUse
	 */
	public int getEasyToUse() {
		return easyToUse;
	}

	/**
	 * @param easyToUse the easyToUse to set
	 */
	public void setEasyToUse(int easyToUse) {
		this.easyToUse = easyToUse;
	}

	/**
	 * @return the endUsesEfficiency
	 */
	public int getEndUsesEfficiency() {
		return endUsesEfficiency;
	}

	/**
	 * @param endUsesEfficiency the endUsesEfficiency to set
	 */
	public void setEndUsesEfficiency(int endUsesEfficiency) {
		this.endUsesEfficiency = endUsesEfficiency;
	}

	/**
	 * @return the performanceObjectives
	 */
	public int getPerformanceObjectives() {
		return performanceObjectives;
	}

	/**
	 * @param performanceObjectives the performanceObjectives to set
	 */
	public void setPerformanceObjectives(int performanceObjectives) {
		this.performanceObjectives = performanceObjectives;
	}

	/**
	 * @return the portable
	 */
	public int getPortable() {
		return portable;
	}

	/**
	 * @param portable the portable to set
	 */
	public void setPortable(int portable) {
		this.portable = portable;
	}

	/**
	 * @return the reusableCode
	 */
	public int getReusableCode() {
		return reusableCode;
	}

	/**
	 * @param reusableCode the reusableCode to set
	 */
	public void setReusableCode(int reusableCode) {
		this.reusableCode = reusableCode;
	}

	/**
	 * @return the specialSecurity
	 */
	public int getSpecialSecurity() {
		return specialSecurity;
	}

	/**
	 * @param specialSecurity the specialSecurity to set
	 */
	public void setSpecialSecurity(int specialSecurity) {
		this.specialSecurity = specialSecurity;
	}

	/**
	 * @return the trainingNeeds
	 */
	public int getTrainingNeeds() {
		return trainingNeeds;
	}

	/**
	 * @param trainingNeeds the trainingNeeds to set
	 */
	public void setTrainingNeeds(int trainingNeeds) {
		this.trainingNeeds = trainingNeeds;
	}
}
