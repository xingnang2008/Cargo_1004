package com.cargo.model;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Trstatus entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "trstatus")
public class Trstatus implements java.io.Serializable {

	// Fields

	private Integer id;
	private String waybill;
	private Integer status;
	private Date sdate;
	private String remarks;

	// Constructors

	/** default constructor */
	public Trstatus() {
	}

	/** full constructor */
	public Trstatus(String waybill, Integer status, Date sdate, String remarks) {
		this.waybill = waybill;
		this.status = status;
		this.sdate = sdate;
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

	@Column(name = "waybill")
	public String getWaybill() {
		return this.waybill;
	}

	public void setWaybill(String waybill) {
		this.waybill = waybill;
	}

	@Column(name = "status")
	public Integer getStatus() {
		return this.status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "sdate", length = 10)
	public Date getSdate() {
		return this.sdate;
	}

	public void setSdate(Date sdate) {
		this.sdate = sdate;
	}

	@Column(name = "remarks")
	public String getRemarks() {
		return this.remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

}