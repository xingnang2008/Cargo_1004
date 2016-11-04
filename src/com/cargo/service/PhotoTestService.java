package com.cargo.service;

import java.io.InputStream;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;

import com.cargo.dao.PhotoTestDao;
import com.cargo.model.PhotoTest;

@Component
public class PhotoTestService {

	@Resource
	private PhotoTestDao photoTestDao;
	
	public void save(InputStream inputStream){
		this.photoTestDao.save(inputStream);
	}
	public void delete(PhotoTest photoTest){
		this.photoTestDao.delete(photoTest);
	}
	public void update(PhotoTest photoTest){
		this.photoTestDao.update(photoTest);
	}
	
	
	public void deleteByIds(String ids){
		this.photoTestDao.deleteByIds(ids);
	}
	
}
