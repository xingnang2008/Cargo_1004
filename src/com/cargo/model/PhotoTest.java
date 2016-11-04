package com.cargo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import java.sql.Blob;

/**
 * PhotoTest entity. 
 * used for Test save Photo.
 * @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "phototest")
public class PhotoTest {
	private int id;
	private String name;
	private Blob photo;
	
	@Id
	@GeneratedValue
	@Column(name = "id", unique = true, nullable = false)
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Blob getPhoto() {
		return photo;
	}
	public void setPhoto(java.sql.Blob blob) {
		this.photo = blob;
	}  

	
	
}
