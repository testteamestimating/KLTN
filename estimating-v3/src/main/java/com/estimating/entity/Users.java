package com.estimating.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="users")
public class Users  implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="username", length=30)
	private String username;
	
	@Column(name="password", length=30, nullable = false)
	private String password;
	
	@Embedded
	private DateEmbedded date;

	@ManyToOne
	@JoinColumn(name = "utId")
	private UserType userType;
	
	@OneToMany(mappedBy = "owner_user")
	private List<Shared> owner_shares;
	
	@OneToMany(mappedBy = "share_user")
	private List<Shared> share_user;
	
	@OneToMany(mappedBy = "user")
	private List<Project> project;
	
	/**
	 * @param username
	 * @param password
	 * @param date
	 * @param userType
	 * @param project
	 */
	public Users(String username, String password, DateEmbedded date,
			UserType userType) {
		super();
		this.username = username;
		this.password = password;
		this.date = date;
		this.userType = userType;
	}

	




	/**
	 * @return the project
	 */
	public List<Project> getProject() {
		return project;
	}



	/**
	 * @param project the project to set
	 */
	public void setProject(List<Project> project) {
		this.project = project;
	}



	public Users() {
	}
	
	
	
	/**
	 * @return the username
	 */
	public String getUsername() {
		return username;
	}

	/**
	 * @param username the username to set
	 */
	public void setUsername(String username) {
		this.username = username;
	}

	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
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

	public Users(String username, String password, DateEmbedded date) {
		super();
		this.username = username;
		this.password = password;
		this.date = date;
	}



	/**
	 * @return the userType
	 */
	public UserType getUserType() {
		return userType;
	}



	/**
	 * @param userType the userType to set
	 */
	public void setUserType(UserType userType) {
		this.userType = userType;
	}



	/**
	 * @return the serialversionuid
	 */
	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}




