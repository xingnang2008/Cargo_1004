package com.cargo.action;

import java.io.ByteArrayInputStream;
import java.util.HashMap;
import java.util.List;

import com.cargo.model.Trstatus;

public class TrstatusAction extends BaseAction<Trstatus> {

	public void save(){
		this.trstatusService.save(model);
	}
	public void update(){
		this.trstatusService.update(model);
	}
	public void delete(){
		this.trstatusService.delete(model);
	}
	public List<Trstatus> findAll(){
		return this.trstatusService.findAll();
	}
	public String listAll(){
		jsonList = this.trstatusService.findAll();
		return "jsonList";
	}
	
	public String listByStatusId(){
		
				
		return "jsonMap"; 
	}
	public String deleteByIds(){
		this.trstatusService.deleteByIds(ids);
		inputStream = new ByteArrayInputStream("true".getBytes());	
		return "stream";
	}
}
