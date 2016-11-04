package com.cargo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Group entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "userGroup")
public class Group implements java.io.Serializable {

	// Fields

	private Integer id;
	private String userGroup;

	// Constructors

	/** default constructor */
	public Group() {
	}

	

	// Property accessors
	@Id
	@GeneratedValue
	@Column(name = "id", unique = true, nullable = false)
	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}



	public String getUserGroup() {
		return userGroup;
	}



	public void setUserGroup(String userGroup) {
		this.userGroup = userGroup;
	}

	

}