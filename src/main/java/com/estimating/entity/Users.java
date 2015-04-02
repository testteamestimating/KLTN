package com.estimating.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.util.Assert;

import com.estimating.enums.RoleEnum;

@Entity
@Table(name="users")
public class Users implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="username", length=30)
	private String username;
	
	@Column(name="password", length=30, nullable = false)
	private String password;
	
	@Column(name="role_id")
	private int roleId;
	
	@Embedded
	private DateEmbedded date;

	public Users() {
	}
	
	public Users(String username, String password, RoleEnum role,
			DateEmbedded date) {
		super();
		this.username = username;
		this.password = password;
		this.roleId = role.getKey();
		this.date = date;
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
	 * @return the roleId
	 */
	public RoleEnum getRoleId() {
		return RoleEnum.getRoleValue(this.roleId);
	}

	/**
	 * @param roleId the roleId to set
	 */
	public void setRoleId(RoleEnum role) {
		Assert.notNull(role, "Role must not be null");
		this.roleId = role.getKey();
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

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Users [username=" + username + ", password=" + password	+ ", role=" 
				+ RoleEnum.getRoleValue(roleId) + ", createDate=" + date.getCreatedDate() + ", updatedDate=" + date.getUpdatedDate() + "]";
	}
	
	
}
