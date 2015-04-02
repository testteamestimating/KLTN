package com.estimating.entity;

import java.util.List;

import javax.persistence.AttributeOverride;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.codehaus.jackson.annotate.JsonIgnore;
import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.springframework.util.Assert;

@Entity
@Table(name = "departments")
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
@AttributeOverride(name = "id", column = @Column(name = "customer_id"))
@JsonIgnoreProperties("customers")
public class Departments extends BaseEntity {
	private static final long serialVersionUID = 1L;

	@Column(name = "department_name", nullable = false)
	private String departmentName;

	@Embedded
	private DateEmbedded date;

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "department")
	@JsonIgnore
	private List<Customers> customers;

	public Departments() {
	}

	public Departments(String departmentName, DateEmbedded date) {
		super();
		Assert.hasText(departmentName,
				"Department's name must not be empty or null");
		this.departmentName = departmentName;
		this.date = date;
	}

	/**
	 * @return the departmentName
	 */
	public String getDepartmentName() {
		return departmentName;
	}

	/**
	 * @param departmentName
	 *            the departmentName to set
	 */
	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}

	/**
	 * @return the date
	 */
	public DateEmbedded getDate() {
		return date;
	}

	/**
	 * @param date
	 *            the date to set
	 */
	public void setDate(DateEmbedded date) {
		this.date = date;
	}

	/**
	 * @return the customers
	 */
	public List<Customers> getCustomers() {
		return customers;
	}

	/**
	 * @param customers
	 *            the customers to set
	 */
	public void setCustomers(List<Customers> customers) {
		this.customers = customers;
	}

	@Override
	public String toString() {
		return "Departments [departmentName=" + departmentName + ", date="
				+ date + ", customers=" + customers + "]";
	}
	
	
}
