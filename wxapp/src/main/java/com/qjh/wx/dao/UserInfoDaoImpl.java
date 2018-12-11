package com.qjh.wx.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.qjh.wx.util.SSHUtil;
import com.qjh.wx.po.UserInfo;

@Repository("userInfoDaoImpl")
public class UserInfoDaoImpl implements IEntityDao<UserInfo>{

	@Autowired
	private SSHUtil<UserInfo> util;
	
	public UserInfo query(Integer id) {
		
		return util.query(UserInfo.class, id);
	}

	public List<UserInfo> pageQuery() {
		
		return null;
	}

	public void save(UserInfo t) {
		
	}

	public void delete(Integer id) {
		
	}

	public void update(UserInfo t) {
		
	}

}
