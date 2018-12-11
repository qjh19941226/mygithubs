package com.qjh.wx.action;

import java.io.PrintWriter;

import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.ServletActionContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionSupport;
import com.qjh.wx.po.UserInfo;
import com.qjh.wx.service.IEntityService;
import com.qjh.wx.util.JsonUtil;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Controller
@Scope(value="prototype")
public class UserInfoAction extends ActionSupport{

	private static final long serialVersionUID = 1L;
	
	@Autowired
	@Qualifier("userInfoServiceImpl")
	private IEntityService<UserInfo> userInfoService;
	private UserInfo user;
	private Integer id;
	
	public String query() {
		user = userInfoService.query(id);
		String jsonstr = JsonUtil.beanToJson(user);
		getOut(jsonstr);
		return "query";
	}
	
	public String login() {
		System.out.println("login");
		
		return "login";
	}

	public String list(){
        System.out.println("这里是action");
        return Action.SUCCESS;
    }
	
	public void getOut(String str){
		HttpServletResponse response = ServletActionContext.getResponse();
		PrintWriter out = null;
		try {
			out=response.getWriter();
			System.out.println("数据："+str);
			out.write(str);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}finally{
			out.flush();
			out.close();
		}
	}
}
