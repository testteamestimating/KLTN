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
@Table(name = "vafWeight")
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
@AttributeOverride(name = "id", column = @Column(name = "vafId")) 
public class VafWeight extends BaseEntity {
	private static final long serialVersionUID = 1L;
	
	@OneToOne
	@PrimaryKeyJoinColumn
	private FunctionPoint functionPoint;
	
	@Column(name = "dataCommunications", nullable = false, columnDefinition = "int default 0")
	private int dataCommunications;
	
	@Column(name = "distributedDataProcessing", nullable = false, columnDefinition = "int default 0")
	private int distributedDataProcessing;
	
	@Column(name = "performance", nullable = false, columnDefinition = "int default 0")
	private int performance;
	
	@Column(name = "heavilyUsedConfiguration", nullable = false, columnDefinition = "int default 0")
	private int heavilyUsedConfiguration;
	
	@Column(name = "transactionRate", nullable = false, columnDefinition = "int default 0")
	private int transactionRate;
	
	@Column(name = "onLineDataEntry", nullable = false, columnDefinition = "int default 0")
	private int onLineDataEntry;
	
	@Column(name = "endUserEfficiency", nullable = false, columnDefinition = "int default 0")
	private int endUserEfficiency;
	
	@Column(name = "onLineUpdate", nullable = false, columnDefinition = "int default 0")
	private int onLineUpdate;
	
	@Column(name = "complexProcessing", nullable = false, columnDefinition = "int default 0")
	private int complexProcessing;
	
	@Column(name = "reusability", nullable = false, columnDefinition = "int default 0")
	private int reusability;
	
	@Column(name = "installationEase", nullable = false, columnDefinition = "int default 0")
	private int installationEase;
	
	@Column(name = "operationalEase", nullable = false, columnDefinition = "int default 0")
	private int operationalEase;
	
	@Column(name = "multipleSites", nullable = false, columnDefinition = "int default 0")
	private int multipleSites;
	
	@Column(name = "facilitateChange", nullable = false, columnDefinition = "int default 0")
	private int facilitateChange;

	/**
	 * @param dataCommunications
	 * @param distributedDataProcessing
	 * @param performance
	 * @param heavilyUsedConfiguration
	 * @param transactionRate
	 * @param onLineDataEntry
	 * @param endUserEfficiency
	 * @param onLineUpdate
	 * @param complexProcessing
	 * @param reusability
	 * @param installationEase
	 * @param operationalEase
	 * @param multipleSites
	 * @param facilitateChange
	 */
	public VafWeight(int dataCommunications, int distributedDataProcessing,
			int performance, int heavilyUsedConfiguration, int transactionRate,
			int onLineDataEntry, int endUserEfficiency, int onLineUpdate,
			int complexProcessing, int reusability, int installationEase,
			int operationalEase, int multipleSites, int facilitateChange) {
		super();
		this.dataCommunications = dataCommunications;
		this.distributedDataProcessing = distributedDataProcessing;
		this.performance = performance;
		this.heavilyUsedConfiguration = heavilyUsedConfiguration;
		this.transactionRate = transactionRate;
		this.onLineDataEntry = onLineDataEntry;
		this.endUserEfficiency = endUserEfficiency;
		this.onLineUpdate = onLineUpdate;
		this.complexProcessing = complexProcessing;
		this.reusability = reusability;
		this.installationEase = installationEase;
		this.operationalEase = operationalEase;
		this.multipleSites = multipleSites;
		this.facilitateChange = facilitateChange;
	}

	/**
	 * 
	 */
	public VafWeight() {
		super();
	}

	/**
	 * @return the functionPoint
	 */
	public FunctionPoint getFunctionPoint() {
		return functionPoint;
	}

	/**
	 * @param functionPoint the functionPoint to set
	 */
	public void setFunctionPoint(FunctionPoint functionPoint) {
		this.functionPoint = functionPoint;
	}

	/**
	 * @return the dataCommunications
	 */
	public int getDataCommunications() {
		return dataCommunications;
	}

	/**
	 * @param dataCommunications the dataCommunications to set
	 */
	public void setDataCommunications(int dataCommunications) {
		this.dataCommunications = dataCommunications;
	}

	/**
	 * @return the distributedDataProcessing
	 */
	public int getDistributedDataProcessing() {
		return distributedDataProcessing;
	}

	/**
	 * @param distributedDataProcessing the distributedDataProcessing to set
	 */
	public void setDistributedDataProcessing(int distributedDataProcessing) {
		this.distributedDataProcessing = distributedDataProcessing;
	}

	/**
	 * @return the performance
	 */
	public int getPerformance() {
		return performance;
	}

	/**
	 * @param performance the performance to set
	 */
	public void setPerformance(int performance) {
		this.performance = performance;
	}

	/**
	 * @return the heavilyUsedConfiguration
	 */
	public int getHeavilyUsedConfiguration() {
		return heavilyUsedConfiguration;
	}

	/**
	 * @param heavilyUsedConfiguration the heavilyUsedConfiguration to set
	 */
	public void setHeavilyUsedConfiguration(int heavilyUsedConfiguration) {
		this.heavilyUsedConfiguration = heavilyUsedConfiguration;
	}

	/**
	 * @return the transactionRate
	 */
	public int getTransactionRate() {
		return transactionRate;
	}

	/**
	 * @param transactionRate the transactionRate to set
	 */
	public void setTransactionRate(int transactionRate) {
		this.transactionRate = transactionRate;
	}

	/**
	 * @return the onLineDataEntry
	 */
	public int getOnLineDataEntry() {
		return onLineDataEntry;
	}

	/**
	 * @param onLineDataEntry the onLineDataEntry to set
	 */
	public void setOnLineDataEntry(int onLineDataEntry) {
		this.onLineDataEntry = onLineDataEntry;
	}

	/**
	 * @return the endUserEfficiency
	 */
	public int getEndUserEfficiency() {
		return endUserEfficiency;
	}

	/**
	 * @param endUserEfficiency the endUserEfficiency to set
	 */
	public void setEndUserEfficiency(int endUserEfficiency) {
		this.endUserEfficiency = endUserEfficiency;
	}

	/**
	 * @return the onLineUpdate
	 */
	public int getOnLineUpdate() {
		return onLineUpdate;
	}

	/**
	 * @param onLineUpdate the onLineUpdate to set
	 */
	public void setOnLineUpdate(int onLineUpdate) {
		this.onLineUpdate = onLineUpdate;
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
	 * @return the reusability
	 */
	public int getReusability() {
		return reusability;
	}

	/**
	 * @param reusability the reusability to set
	 */
	public void setReusability(int reusability) {
		this.reusability = reusability;
	}

	/**
	 * @return the installationEase
	 */
	public int getInstallationEase() {
		return installationEase;
	}

	/**
	 * @param installationEase the installationEase to set
	 */
	public void setInstallationEase(int installationEase) {
		this.installationEase = installationEase;
	}

	/**
	 * @return the operationalEase
	 */
	public int getOperationalEase() {
		return operationalEase;
	}

	/**
	 * @param operationalEase the operationalEase to set
	 */
	public void setOperationalEase(int operationalEase) {
		this.operationalEase = operationalEase;
	}

	/**
	 * @return the multipleSites
	 */
	public int getMultipleSites() {
		return multipleSites;
	}

	/**
	 * @param multipleSites the multipleSites to set
	 */
	public void setMultipleSites(int multipleSites) {
		this.multipleSites = multipleSites;
	}

	/**
	 * @return the facilitateChange
	 */
	public int getFacilitateChange() {
		return facilitateChange;
	}

	/**
	 * @param facilitateChange the facilitateChange to set
	 */
	public void setFacilitateChange(int facilitateChange) {
		this.facilitateChange = facilitateChange;
	}

	/**
	 * @return the serialversionuid
	 */
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
}
