package com.internousdev.SampleSite.dto;

public class LoginDTO {

	private String username;
	private String password;
	private String userId;
	private boolean loginFlg=false;

	public String getUsername(){
		return username;
	}

	public void setUserName(String username){
		this.username=username;
	}

	public String getPassword(){
		return password;
	}

	public void setPassword(String password){
		this.password=password;
	}

	public String getUserId(){
		return userId;
	}

	public void setUserId(String userId){
		this.userId= userId;
	}

	public boolean getLoginFlg(){
		return loginFlg;
	}

	public void setLoginFlg(boolean loginFlg){
		this.loginFlg=loginFlg;
	}

}
