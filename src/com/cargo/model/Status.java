package com.cargo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Status entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "status")
public class Status implements java.io.Serializable {

	// Fields

	private Integer id;
	private String status;

	// Constructors

	/** default constructor */
	public Status() {
	}

	/** full constructor */
	public Status(String status) {
		this.status = status;
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

	@Column(name = "status", length = 60)
	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

}