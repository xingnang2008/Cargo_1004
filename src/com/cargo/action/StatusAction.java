package com.cargo.action;

import java.io.ByteArrayInputStream;
import java.util.HashMap;
import java.util.List;

import org.springframework.stereotype.Component;

import com.cargo.model.Status;
import com.cargo.model.Waybill;
@Component
public class StatusAction extends BaseAction<Status> {
	
	public void save(){
		this.statusService.save(model);
	}
	public void update(){
		this.statusService.update(model);
	}
	public void delete(){
		this.statusService.delete(model);
	}
	public List<Status> findAll(){
		return this.statusService.findAll();
	}
	public String listAll(){
		jsonList = this.statusService.findAll();
		return "jsonList";
	}
	public List<Waybill> queryWaybillByStatusId(){		
		return this.waybillService.queryByStatus(model.getId());
	}
	public String listByStatusId(){
		
		pageMap = new HashMap<String,Object>();	
		List<Status> list =this.statusService.listByStatusId(model.getStatus(),page,rows);							
		pageMap.put("total",statusService.getCountByStatusId(model.getStatus()));	 //			
		pageMap.put("rows",list);		
		return "jsonMap"; 
	}
	public String deleteByIds(){
		this.statusService.deleteByIds(ids);
		inputStream = new ByteArrayInputStream("true".getBytes());	
		return "stream";
	}

}
