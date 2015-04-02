package com.estimating.entity;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class DateEmbedded {

	@Column(name = "created_date")
	private Timestamp createdDate;

	@Column(name = "updated_date")
	private Timestamp updatedDate;

	public DateEmbedded() {
	}
	
	public DateEmbedded(Timestamp createdDate, Timestamp updatedDate) {
		this.createdDate = createdDate;
		this.updatedDate = updatedDate;
	}
	
	public DateEmbedded(Timestamp updatedDate) {
		this.updatedDate = updatedDate;
	}
	
	public Timestamp getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Timestamp createdDate) {
		this.createdDate = createdDate;
	}

	public Timestamp getUpdatedDate() {
		return updatedDate;
	}

	public void setUpdatedDate(Timestamp updatedDate) {
		this.updatedDate = updatedDate;
	}
	
	public void setUpdatedDate() {
		long time = System.currentTimeMillis();
		this.updatedDate = new Timestamp(time);
	}
	
	public void setFullDate() {
		long time = System.currentTimeMillis();
		this.createdDate = new Timestamp(time);
		this.updatedDate = new Timestamp(time);
	}
	
}
