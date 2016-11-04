package com.cargo.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;

import com.cargo.dao.TrstatusDao;
import com.cargo.model.Trstatus;
@Component
public class TrstatusService {

	private TrstatusDao trstatusDao;
	public TrstatusDao getTrstatusDao() {
		return trstatusDao;
	}
	@Resource
	public void setTrstatusDao(TrstatusDao trstatusDao) {
		this.trstatusDao = trstatusDao;
	}

	public void save(Trstatus trstatus){
		this.trstatusDao.save(trstatus);
	}
	
	public void delete(Trstatus trstatus){
		this.trstatusDao.delete(trstatus);
	}
	public void update(Trstatus trstatus){
		this.trstatusDao.update(trstatus);
	}
	public List<Trstatus> findAll(){
		return this.trstatusDao.findAll();
	}
	public List listByTrstatus(String status,Integer page,Integer rows){
		return this.trstatusDao.listByTrstatus(status, page, rows);		
	}
	
	public Long getCountByTrstatus(String status){
		return this.trstatusDao.getCountByTrstatus(status);
		
	}
	public void deleteByIds(String ids){
		this.trstatusDao.deleteByIds(ids);
	}
}
