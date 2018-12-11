package com.qjh.wx.dao;

import java.util.List;

public interface IEntityDao<T> {

	public T query(Integer id);
	
	public List<T> pageQuery();
	
	public void save(T t);
	
	public void delete(Integer id);
	
	public void update(T t);
	
}
