package com.cargo.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;

import com.cargo.dao.GroupDao;
import com.cargo.model.Group;

@Component
public class GroupService {
	private GroupDao groupDao;
	public GroupDao getGroupDao() {
		return groupDao;
	}
	@Resource
	public void setGroupDao(GroupDao groupDao) {
		this.groupDao = groupDao;
	}

	public void save(Group group){
		this.groupDao.save(group);
	}
	
	public void delete(Group group){
		this.groupDao.delete(group);
	}
	public void update(Group group){
		this.groupDao.update(group);
	}
	public List<Group> findAll(){
		return this.groupDao.findAll();
		
	}
}
