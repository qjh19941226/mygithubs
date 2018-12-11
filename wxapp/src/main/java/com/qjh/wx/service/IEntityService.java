package com.qjh.wx.service;

import java.util.List;

public interface IEntityService<T> {
		public T query(Integer id);

		public List<T> pageQuery();
	
		public void add(T t);
	
		public void delete(Integer id);
		
		public void update(T t);
}
