package com.cargo.dao;

import java.util.List;

import org.hibernate.Query;
import org.springframework.stereotype.Component;

import com.cargo.model.Role;
@Component
public class RoleDao extends BaseDao {
	
	public void save(Role transientInstance) {
		//log.debug("saving Rebate instance");
		try {
			getSession().save(transientInstance);
		} catch (RuntimeException re) {
			throw re;
		}
	}

	public void delete(Role persistentInstance) {
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
			String hql ="delete from Role where id in ("+ ids +")";
			getSession().createQuery(hql).executeUpdate();
		} catch (RuntimeException re) {
			throw re;
		}
	}
	public void update(Role line){
		try {
			getSession().update(line);
		} catch (RuntimeException re) {
			throw re;
		}
	}

	public Role findById(java.lang.Integer id) {
		//log.debug("getting Rebate instance with id: " + id);
		try {
			Role instance = (Role) getSession().get("com.cargo.model.Role", id);
			return instance;
		} catch (RuntimeException re) {
			throw re;
		}
	}

	public List findAll() {
		//log.debug("finding all Rebate instances");
		try {
			String queryString = "from Role";
			Query queryObject = getSession().createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			throw re;
		}
	}
}
