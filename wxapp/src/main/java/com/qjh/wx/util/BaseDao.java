package com.qjh.wx.util;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.support.HibernateDaoSupport;
import org.springframework.stereotype.Component;


@Component
public class BaseDao extends HibernateDaoSupport{
	
	private SessionFactory factory;
	
	public SessionFactory getFactory() {
		return factory;
	}
	
	@Autowired
	public void setFactory(SessionFactory factory) {
		this.factory = factory;
		this.setSessionFactory(factory);
	}
	
}
