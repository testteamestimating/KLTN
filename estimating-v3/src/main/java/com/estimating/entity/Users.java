package com.estimating.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Id;
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

}
