package com.estimating.bean;

import java.io.Serializable;

public class ProjectTypeBean implements Serializable {
	private static final long serialVersionUID = 1L;

	private int id;
	private String typeName;
	private String descripton;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTypeName() {
		return typeName;
	}

	public void setTypeName(String typeName) {
		this.typeName = typeName;
	}

	public String getDescripton() {
		return descripton;
	}

	public void setDescripton(String descripton) {
		this.descripton = descripton;
	}

}
