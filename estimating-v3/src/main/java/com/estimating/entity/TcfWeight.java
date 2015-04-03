package com.estimating.entity;

import javax.persistence.AttributeOverride;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;

@Entity
@Table(name = "tcfWeight")
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
@AttributeOverride(name = "id", column = @Column(name = "customer_id"))
@JsonIgnoreProperties("customers")
public class TcfWeight  extends BaseEntity	 {
	
	private static final long serialVersionUID = 1L;
	
	@Column(name="access_for_3_parties", nullable=false)
	private int accessFor3Parties;

	@Column(name="complex_processing", nullable=false)
	private int complexProcessing;

	@Column(name="concurrent_use", nullable=false)
	private int concurrentUse;

	@Column(name="distributed_system", nullable=false)
	private int distributedSystem;

	@Column(name="easy_to_change")
	private int easyToChange;

	@Column(name="easy_to_installation", nullable=false)
	private int easyToInstallation;

	@Column(name="easy_to_use")
	private int easyToUse;

	@Column(name="end_uses_efficiency", nullable=false)
	private int endUsesEfficiency;

	@Column(name="performance_objectives", nullable=false)
	private int performanceObjectives;

	@Column(name="portable", nullable=false )
	private int portable;

	@Column(name="reusable_code", nullable=false)
	private int reusableCode;

	@Column(name="special_security", nullable=false)
	private int specialSecurity;

	@Column(name="training_needs", nullable=false)
	private int trainingNeeds;

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
