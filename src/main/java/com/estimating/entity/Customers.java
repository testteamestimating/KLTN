package com.estimating.entity;

import java.math.BigDecimal;

import javax.persistence.AttributeOverride;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.codehaus.jackson.annotate.JsonIgnore;
import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.springframework.util.Assert;

@Entity
@Table(name = "customers")
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
@AttributeOverride(name = "id", column = @Column(name = "customer_id"))
@JsonIgnoreProperties("department")
public class Customers extends BaseEntity {
	private static final long serialVersionUID = 1L;

	@Column(name = "customer_name", nullable = false)
	private String customerName;

	@Column(name = "salary", scale = 2, precision = 10)
	private BigDecimal salary;

	@Embedded
	private DateEmbedded date;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="department_id")
	@JsonIgnore
	private Departments department;
	
	public Customers() {
	}
	
	public Customers(String customerName, BigDecimal salary, Departments department, DateEmbedded date) {
		Assert.hasText(customerName, "Customer's name must not be empty or null");
		Assert.notNull(salary, "Salary must not be null");
		this.customerName = customerName;
		this.salary = salary;
		this.department = department;
		this.date = date;
	}

	/**
	 * @return the customerName
	 */
	public String getCustomerName() {
		return customerName;
	}

	/**
	 * @param customerName the customerName to set
	 */
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	/**
	 * @return the salary
	 */
	public BigDecimal getSalary() {
		return salary;
	}

	/**
	 * @param salary the salary to set
	 */
	public void setSalary(BigDecimal salary) {
		this.salary = salary;
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
	 * @return the department
	 */
	public Departments getDepartment() {
		return department;
	}

	/**
	 * @param department the department to set
	 */
	public void setDepartment(Departments department) {
		this.department = department;
	}

	@Override
	public String toString() {
		return "Customers [customerName=" + customerName + ", salary=" + salary
				+ ", date=" + date + ", department=" + department + "]";
	}
	
	
}
