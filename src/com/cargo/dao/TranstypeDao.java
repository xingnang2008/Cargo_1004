package com.cargo.dao;

import java.util.List;

import org.hibernate.Query;
import org.springframework.stereotype.Component;

import com.cargo.model.Transtype;

@Component
public class TranstypeDao extends BaseDao{

	public void save(Transtype transientInstance) {
		try {
			getSession().save(transientInstance);
		} catch (RuntimeException re) {
			throw re;
		}
	}

	public void delete(Transtype persistentInstance) {
		try {
			getSession().delete(persistentInstance);
		} catch (RuntimeException re) {
			throw re;
		}
	}
	public void deleteByIds(String ids) {
		try {
			String hql ="delete from Transtype where id in ("+ ids +")";
			getSession().createQuery(hql).executeUpdate();
		} catch (RuntimeException re) {
			throw re;
		}
	}
	public void update(Transtype transType){
		try {
			getSession().update(transType);
		} catch (RuntimeException re) {
			throw re;
		}
	}

	public Transtype findById(java.lang.Integer id) {
		try {
			Transtype instance = (Transtype) getSession().get("com.cargo.model.Transtype", id);
			return instance;
		} catch (RuntimeException re) {
			throw re;
		}
	}
	public List findAll() {
		try {
			String queryString = "from Transtype";
			Query queryObject = getSession().createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			throw re;
		}
	}
	//用于分页显示的查询
	public List listByTransTypeId(String transType,Integer page,Integer rows){
		String queryString = "from Transtype  where transType like:transType";
		return getSession().createQuery(queryString)  
		.setString("transType","%"+transType+"%")
		.setFirstResult((page-1)*rows)
		.setMaxResults(rows)
		.list();
		
	}
	
	public Long getCountByStatusId(String transType){
		String queryString = "Select COUNT(id) from Transtype  where transType like:transType";
		return (Long)getSession().createQuery(queryString)
					.setString("transType","%"+transType+"%")
					.uniqueResult();
		
	}
}
