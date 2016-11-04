package com.cargo.action;

import java.util.List;

public class BaseActionImpl<T> extends BaseAction<T> {
	
	public void Save(T t){};
	public void update(T t){};
	public void delete(T t){};
	public List<T> findAll(){
		return null;};

}
