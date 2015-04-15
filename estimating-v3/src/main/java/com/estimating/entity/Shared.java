package com.estimating.entity;


import javax.persistence.AttributeOverride;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "shared")
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
@AttributeOverride(name = "id", column = @Column(name = "share_id"))
public class Shared extends BaseEntity {
	
	private static final long serialVersionUID = 1L;

	@ManyToOne
	@JoinColumn(name = "projectId")
	private Project project;
	
	@ManyToOne
	@JoinColumn(name = "owner_user")
	private Users owner_user;
	
	@ManyToOne
	@JoinColumn(name = "share_user")
	private Users share_user;

	/**
	 * @param project
	 * @param owner_user
	 * @param share_user
	 */
	public Shared(Project project, Users owner_user, Users share_user) {
		super();
		this.project = project;
		this.owner_user = owner_user;
		this.share_user = share_user;
	}

	/**
	 * @return the project
	 */
	public Project getProject() {
		return project;
	}

	/**
	 * @param project the project to set
	 */
	public void setProject(Project project) {
		this.project = project;
	}

	/**
	 * @return the owner_user
	 */
	public Users getOwner_user() {
		return owner_user;
	}

	/**
	 * @param owner_user the owner_user to set
	 */
	public void setOwner_user(Users owner_user) {
		this.owner_user = owner_user;
	}

	/**
	 * @return the share_user
	 */
	public Users getShare_user() {
		return share_user;
	}

	/**
	 * @param share_user the share_user to set
	 */
	public void setShare_user(Users share_user) {
		this.share_user = share_user;
	}
}
