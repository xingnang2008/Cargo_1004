package com.cargo.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;

import com.cargo.dao.TranstypeDao;
import com.cargo.model.Transtype;
@Component
public class TranstypeService {
	private TranstypeDao transtypeDao;
	public TranstypeDao getTranstypeDao() {
		return transtypeDao;
	}
	@Resource
	public void setTranstypeDao(TranstypeDao transtypeDao) {
		this.transtypeDao = transtypeDao;
	}

	public void save(Transtype transtype){
		this.transtypeDao.save(transtype);
	}
	
	public void delete(Transtype transtype){
		this.transtypeDao.delete(transtype);
	}
	public void update(Transtype transtype){
		this.transtypeDao.update(transtype);
	}
	public List<Transtype> findAll(){
		return this.transtypeDao.findAll();
		
	}
	public void deleteByIds(String ids){
		this.transtypeDao.deleteByIds(ids);
	}
}
