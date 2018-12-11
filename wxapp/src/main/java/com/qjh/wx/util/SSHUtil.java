package com.qjh.wx.util;

import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class SSHUtil<T> extends BaseDao{

	public T query(Class<T> cls,final Integer id) {
		return this.getHibernateTemplate().get(cls, id);
	}

	@SuppressWarnings({ "unchecked", "deprecation" })
	public List<T> pageQuery(final String hql) {
		 return (List<T>)this.getHibernateTemplate().find(hql);
	}
	public void add(T t) {
		this.getHibernateTemplate().save(t);
	}

	public void delete(T t) {
		this.getHibernateTemplate().delete(t);
	}

	public void update(T t) {
		this.getHibernateTemplate().update(t);
	}
	
	@SuppressWarnings("deprecation")
	public int findCount(final String hql) {
		return ((Number)this.getHibernateTemplate().find(hql).listIterator().next()).intValue();
	}
	
}
