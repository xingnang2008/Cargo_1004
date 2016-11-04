package com.cargo.action;

import java.io.ByteArrayInputStream;
import com.cargo.model.Transtype;

public class TranstypeAction extends BaseAction<Transtype> {
	
	public void save(){
		this.transtypeService.save(model);
	}
	public void update(){
		this.transtypeService.update(model);
	}
	
	public String deleteByIds(){
		this.transtypeService.deleteByIds(ids);
		inputStream = new ByteArrayInputStream("true".getBytes());	
		return "stream";
	}
	public String listAll(){
		jsonList = this.transtypeService.findAll();
		return "jsonList";
	}
}
