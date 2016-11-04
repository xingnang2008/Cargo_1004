package com.cargo.dao;

import java.util.List;

import org.hibernate.Query;
import org.springframework.stereotype.Component;

import com.cargo.model.Status;
@Component
public class StatusDao extends BaseDao {

	public void save(Status transientInstance) {
		try {
			getSession().save(transientInstance);
		} catch (RuntimeException re) {
			throw re;
		}
	}

	public void delete(Status persistentInstance) {
		try {
			getSession().delete(persistentInstance);
		} catch (RuntimeException re) {
			throw re;
		}
	}
	public void deleteByIds(String ids) {
		try {
			String hql ="delete from Status where id in ("+ ids +")";
			getSession().createQuery(hql).executeUpdate();
		} catch (RuntimeException re) {
			throw re;
		}
	}
	public void update(Status transType){
		try {
			getSession().update(transType);
		} catch (RuntimeException re) {
			throw re;
		}
	}

	public Status findById(java.lang.Integer id) {
		try {
			Status instance = (Status) getSession().get("com.cargo.model.Status", id);
			return instance;
		} catch (RuntimeException re) {
			throw re;
		}
	}
	public List findAll() {
		try {
			String queryString = "from Status";
			Query queryObject = getSession().createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			throw re;
		}
	}
	//用于分页显示的查询
	public List listByStatusId(String status,Integer page,Integer rows){
		String queryString = "from Status  where status like:status";
		return getSession().createQuery(queryString)  
		.setString("status","%"+status+"%")
		.setFirstResult((page-1)*rows)
		.setMaxResults(rows)
		.list();
		
	}
	
	public Long getCountByStatusId(String status){
		String queryString = "Select COUNT(id) from Status  where status like:status";
		return (Long)getSession().createQuery(queryString)
					.setString("status","%"+status+"%")
					.uniqueResult();
		
	}

}
