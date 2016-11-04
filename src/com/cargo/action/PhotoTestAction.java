package com.cargo.action;

import java.io.ByteArrayInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

import org.springframework.stereotype.Component;

import com.cargo.model.PhotoTest;

@Component
public class PhotoTestAction extends BaseAction<PhotoTest> {
	 
	private String name;
	public void save() throws IOException{
				InputStream ips= new FileInputStream(excelFile);
				this.photoTestService.save(ips);
	}
	public void update(){
		this.photoTestService.update(model);
	}
	public void delete(){
		this.photoTestService.delete(model);
	}
	
	public String deleteByIds(){
		this.photoTestService.deleteByIds(ids);
		inputStream = new ByteArrayInputStream("true".getBytes());	
		return "stream";
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	

}
