package com.cargo.dao;

import java.io.IOException;
import java.io.InputStream;

import org.springframework.stereotype.Component;

import com.cargo.model.PhotoTest;

@Component
public class PhotoTestDao extends BaseDao {
	public void save(InputStream inputStream){
		//log.debug("saving Rebate instance");
		try {
			PhotoTest transientInstance = new PhotoTest();
			transientInstance.setPhoto(getSession().getLobHelper().createBlob(inputStream, inputStream.available()));
			transientInstance.setName("1");
			getSession().save(transientInstance);
		} catch (RuntimeException re) {
			throw re;
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void delete(PhotoTest persistentInstance) {
		//log.debug("deleting Rebate instance");
		try {
			getSession().delete(persistentInstance);
		} catch (RuntimeException re) {
			throw re;
		}
	}
	public void deleteByIds(String ids) {
		//log.debug("deleting Rebate instance");
		try {
			String hql ="delete from PhotoTest where id in ("+ ids +")";
			getSession().createQuery(hql).executeUpdate();
		} catch (RuntimeException re) {
			throw re;
		}
	}
	public void update(PhotoTest line){
		try {
			getSession().update(line);
		} catch (RuntimeException re) {
			throw re;
		}
	}

	public PhotoTest findById(java.lang.Integer id) {
		//log.debug("getting Rebate instance with id: " + id);
		try {
			PhotoTest instance = (PhotoTest) getSession().get("com.cargo.model.PhotoTest", id);
			return instance;
		} catch (RuntimeException re) {
			throw re;
		}
	}
	
	

}
