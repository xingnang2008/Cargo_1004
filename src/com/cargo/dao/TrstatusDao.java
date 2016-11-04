package com.cargo.dao;

import java.util.List;

import org.hibernate.Query;
import org.springframework.stereotype.Component;

import com.cargo.model.Trstatus;
@Component
public class TrstatusDao extends BaseDao {
	public void save(Trstatus transientInstance) {
		try {
			getSession().save(transientInstance);
		} catch (RuntimeException re) {
			throw re;
		}
	}

	public void delete(Trstatus persistentInstance) {
		try {
			getSession().delete(persistentInstance);
		} catch (RuntimeException re) {
			throw re;
		}
	}
	public void deleteByIds(String ids) {
		try {
			String hql ="delete from Trstatus where id in ("+ ids +")";
			getSession().createQuery(hql).executeUpdate();
		} catch (RuntimeException re) {
			throw re;
		}
	}
	public void update(Trstatus transType){
		try {
			getSession().update(transType);
		} catch (RuntimeException re) {
			throw re;
		}
	}

	public Trstatus findById(java.lang.Integer id) {
		try {
			Trstatus instance = (Trstatus) getSession().get("com.cargo.model.Trstatus", id);
			return instance;
		} catch (RuntimeException re) {
			throw re;
		}
	}
	public List findAll() {
		try {
			String queryString = "from Trstatus";
			Query queryObject = getSession().createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			throw re;
		}
	}
	//用于分页显示的查询
	public List listByTrstatus(String status,Integer page,Integer rows){
		String queryString = "from Trstatus  where status like:status";
		return getSession().createQuery(queryString)  
		.setString("status","%"+status+"%")
		.setFirstResult((page-1)*rows)
		.setMaxResults(rows)
		.list();
		
	}
	
	public Long getCountByTrstatus(String status){
		String queryString = "Select COUNT(id) from Trstatus  where status like:status";
		return (Long)getSession().createQuery(queryString)
					.setString("status","%"+status+"%")
					.uniqueResult();
		
	}

}
