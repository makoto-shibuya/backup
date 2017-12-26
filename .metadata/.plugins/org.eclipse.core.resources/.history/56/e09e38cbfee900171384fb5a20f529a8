package com.internousdev.SampleSite.action;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.SampleSite.dao.LoginDAO;
import com.internousdev.SampleSite.dto.LoginDTO;
import com.opensymphony.xwork2.ActionSupport;

public class LoginAction extends ActionSupport implements SessionAware {

	private String password;



	private String userId;

	public Map<String, Object> session;

	public LoginDAO loginDAO = new LoginDAO();

	public LoginDTO loginDTO = new LoginDTO();

	public String execute(){
		String result= ERROR;

		loginDTO=loginDAO.getLoginUserInfo(userId, password);
		session.put("loginUser", loginDTO);
		if(((LoginDTO)session.get("loginUser")).getLoginFlg()){
			result=SUCCESS;
		}
		return result;


	}

	public String getUserId(){
		return userId;
	}

	public void setUserId(String userId){
		this.userId= userId;
	}

	public String getPassword(){
		return password;
	}

	public void setPassword(String password){
		this.password = password;
	}

	public void setSession(Map<String, Object>session){
		this.session=session;
	}

}
