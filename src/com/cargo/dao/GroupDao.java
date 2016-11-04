package com.cargo.dao;

import java.util.List;

import org.hibernate.Query;
import org.springframework.stereotype.Component;

import com.cargo.model.Group;
@Component
public class GroupDao extends BaseDao{
	public void save(Group transientInstance) {
		try {
			getSession().save(transientInstance);
		} catch (RuntimeException re) {
			throw re;
		}
	}

	public void delete(Group persistentInstance) {
		try {
			getSession().delete(persistentInstance);
		} catch (RuntimeException re) {
			throw re;
		}
	}
	public void deleteByIds(String ids) {
		try {
			String hql ="delete from Group where id in ("+ ids +")";
			getSession().createQuery(hql).executeUpdate();
		} catch (RuntimeException re) {
			throw re;
		}
	}
	public void update(Group transType){
		try {
			getSession().update(transType);
		} catch (RuntimeException re) {
			throw re;
		}
	}

	public Group findById(java.lang.Integer id) {
		try {
			Group instance = (Group) getSession().get("com.cargo.model.Group", id);
			return instance;
		} catch (RuntimeException re) {
			throw re;
		}
	}
	public List findAll() {
		try {
			String queryString = "from Group";
			Query queryObject = getSession().createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			throw re;
		}
	}
}
