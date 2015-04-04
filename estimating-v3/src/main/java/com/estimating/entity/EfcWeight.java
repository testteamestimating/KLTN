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
@Table(name="efcWeight")
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
@AttributeOverride(name="id", column = @Column(name = "efcId"))
public class EfcWeight extends BaseEntity {
	private static final long serialVersionUID = 1L;
	
	@OneToOne
	@PrimaryKeyJoinColumn
	private UsecasePoint usecasePoint;
	
	@Column(name = "familiarwithDevelopmentProcess", nullable = false, length = 10, columnDefinition = "int default 0")
	private int familiarwithDevelopmentProcess;
	
	@Column(name="applicationExperience", nullable = false, length = 10, columnDefinition = "int default 0")
	private int applicationExperience;
	
	@Column(name = "objectOrientedExperience", nullable = false, length = 10, columnDefinition = "int default 0")
	private int objectOrientedExperience;
	
	@Column(name = "leadAnalystCapability", nullable = false, length = 10, columnDefinition = "int default 0")
	private int leadAnalystCapability;
	
	@Column(name = "motivation", nullable = false, length = 10, columnDefinition = "int default 0")
	private int motivation;
	
	@Column(name = "stableRequirements", nullable = false, length = 10, columnDefinition = "int default 0")
	private int stableRequirements;
	
	@Column(name = "parttimeStaff", nullable = false, length =10, columnDefinition = "int default 0")
	private int parttimeStaff;
	
	@Column(name = "difficulProgrammingLanguage", nullable = false, length = 10, columnDefinition = "int default 0")
	private int difficulProgrammingLanguage;

	/**
	 * @param familiarwithDevelopmentProcess
	 * @param applicationExperience
	 * @param objectOrientedExperience
	 * @param leadAnalystCapability
	 * @param motivation
	 * @param stableRequirements
	 * @param parttimeStaff
	 * @param difficulProgrammingLanguage
	 */
	public EfcWeight(int familiarwithDevelopmentProcess,
			int applicationExperience, int objectOrientedExperience,
			int leadAnalystCapability, int motivation, int stableRequirements,
			int parttimeStaff, int difficulProgrammingLanguage) {
		super();
		this.familiarwithDevelopmentProcess = familiarwithDevelopmentProcess;
		this.applicationExperience = applicationExperience;
		this.objectOrientedExperience = objectOrientedExperience;
		this.leadAnalystCapability = leadAnalystCapability;
		this.motivation = motivation;
		this.stableRequirements = stableRequirements;
		this.parttimeStaff = parttimeStaff;
		this.difficulProgrammingLanguage = difficulProgrammingLanguage;
	}

	/**
	 * 
	 */
	public EfcWeight() {
		super();
		this.applicationExperience = 0;
		this.difficulProgrammingLanguage = 0;
		this.familiarwithDevelopmentProcess = 0;
		this.leadAnalystCapability = 0;
		this.motivation = 0;
		this.objectOrientedExperience = 0;
		this.parttimeStaff = 0;
		this.stableRequirements = 0;
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
	 * @return the familiarwithDevelopmentProcess
	 */
	public int getFamiliarwithDevelopmentProcess() {
		return familiarwithDevelopmentProcess;
	}

	/**
	 * @param familiarwithDevelopmentProcess the familiarwithDevelopmentProcess to set
	 */
	public void setFamiliarwithDevelopmentProcess(int familiarwithDevelopmentProcess) {
		this.familiarwithDevelopmentProcess = familiarwithDevelopmentProcess;
	}

	/**
	 * @return the applicationExperience
	 */
	public int getApplicationExperience() {
		return applicationExperience;
	}

	/**
	 * @param applicationExperience the applicationExperience to set
	 */
	public void setApplicationExperience(int applicationExperience) {
		this.applicationExperience = applicationExperience;
	}

	/**
	 * @return the objectOrientedExperience
	 */
	public int getObjectOrientedExperience() {
		return objectOrientedExperience;
	}

	/**
	 * @param objectOrientedExperience the objectOrientedExperience to set
	 */
	public void setObjectOrientedExperience(int objectOrientedExperience) {
		this.objectOrientedExperience = objectOrientedExperience;
	}

	/**
	 * @return the leadAnalystCapability
	 */
	public int getLeadAnalystCapability() {
		return leadAnalystCapability;
	}

	/**
	 * @param leadAnalystCapability the leadAnalystCapability to set
	 */
	public void setLeadAnalystCapability(int leadAnalystCapability) {
		this.leadAnalystCapability = leadAnalystCapability;
	}

	/**
	 * @return the motivation
	 */
	public int getMotivation() {
		return motivation;
	}

	/**
	 * @param motivation the motivation to set
	 */
	public void setMotivation(int motivation) {
		this.motivation = motivation;
	}

	/**
	 * @return the stableRequirements
	 */
	public int getStableRequirements() {
		return stableRequirements;
	}

	/**
	 * @param stableRequirements the stableRequirements to set
	 */
	public void setStableRequirements(int stableRequirements) {
		this.stableRequirements = stableRequirements;
	}

	/**
	 * @return the parttimeStaff
	 */
	public int getParttimeStaff() {
		return parttimeStaff;
	}

	/**
	 * @param parttimeStaff the parttimeStaff to set
	 */
	public void setParttimeStaff(int parttimeStaff) {
		this.parttimeStaff = parttimeStaff;
	}

	/**
	 * @return the difficulProgrammingLanguage
	 */
	public int getDifficulProgrammingLanguage() {
		return difficulProgrammingLanguage;
	}

	/**
	 * @param difficulProgrammingLanguage the difficulProgrammingLanguage to set
	 */
	public void setDifficulProgrammingLanguage(int difficulProgrammingLanguage) {
		this.difficulProgrammingLanguage = difficulProgrammingLanguage;
	}
}
