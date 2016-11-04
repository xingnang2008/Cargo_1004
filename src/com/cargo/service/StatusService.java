package com.cargo.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;

import com.cargo.dao.StatusDao;
import com.cargo.model.Status;

@Component
public class StatusService {
	private StatusDao statusDao;
	public StatusDao getStatusDao() {
		return statusDao;
	}
	@Resource
	public void setStatusDao(StatusDao statusDao) {
		this.statusDao = statusDao;
	}

	public void save(Status status){
		this.statusDao.save(status);
	}
	
	public void delete(Status status){
		this.statusDao.delete(status);
	}
	public void update(Status status){
		this.statusDao.update(status);
	}
	public List<Status> findAll(){
		return this.statusDao.findAll();
		
	}
	public void deleteByIds(String ids){
		this.statusDao.deleteByIds(ids);
	}
	public List listByStatusId(String status,Integer page,Integer rows){
		return this.statusDao.listByStatusId(status, page, rows);
	}
	
	public Long getCountByStatusId(String status){
		return this.statusDao.getCountByStatusId(status);
	}
}
