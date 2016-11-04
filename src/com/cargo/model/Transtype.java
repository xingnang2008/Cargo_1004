package com.cargo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Transtype entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "transtype")
public class Transtype implements java.io.Serializable {

	// Fields

	private Integer id;
	private String transType;
	private String remarks;

	// Constructors

	/** default constructor */
	public Transtype() {
	}

	/** full constructor */
	public Transtype(String transType, String remarks) {
		this.transType = transType;
		this.remarks = remarks;
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

	@Column(name = "transType", length = 20)
	public String getTransType() {
		return this.transType;
	}

	public void setTransType(String transType) {
		this.transType = transType;
	}

	@Column(name = "remarks", length = 100)
	public String getRemarks() {
		return this.remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

}