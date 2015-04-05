package com.estimating.entity;

import java.util.List;

import javax.persistence.AttributeOverride;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name= "userType")
@Inheritance(strategy  = InheritanceType.TABLE_PER_CLASS)
@AttributeOverride(name = "id", column = @Column(name = "utId"))
public class UserType extends BaseEntity {

	private static final long serialVersionUID = 1L;
	
	@OneToMany(mappedBy = "userType")
	private List<Users> user;
	
	@Column(name = "description", nullable = false, length = 50)
	private String description;
	
	/**
	 * @param description
	 */
	public UserType(String description) {
		super();
		this.description = description;
	}

	/**
	 * 
	 */
	public UserType() {
		super();
	}



	/**
	 * @return the user
	 */
	public List<Users> getUser() {
		return user;
	}

	/**
	 * @param user the user to set
	 */
	public void setUser(List<Users> user) {
		this.user = user;
	}

	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	/**
	 * @return the serialversionuid
	 */
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
}
