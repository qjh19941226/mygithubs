package com.qjh.wx.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.qjh.wx.dao.IEntityDao;
import com.qjh.wx.po.UserInfo;

import lombok.Setter;

@Setter
@Service("userInfoServiceImpl")
public class UserInfoServiceImpl implements IEntityService<UserInfo>{

	@Autowired
	@Qualifier("userInfoServiceImpl")
	private IEntityDao<UserInfo> userInfoDao;
	
	public UserInfo query(Integer id) {

		return userInfoDao.query(id);
	}

	public List<UserInfo> pageQuery() {
		// TODO Auto-generated method stub
		return null;
	}

	public void add(UserInfo t) {
		// TODO Auto-generated method stub
		
	}

	public void delete(Integer id) {
		// TODO Auto-generated method stub
		
	}

	public void update(UserInfo t) {
		// TODO Auto-generated method stub
		
	}

}
