package com.internousdev.SampleSite.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.internousdev.SampleSite.dto.LoginDTO;
import com.internousdev.SampleSite.util.DBConnector;



public class LoginDAO {

	private DBConnector db = new DBConnector();
	private Connection con = db.getConnection();
	private LoginDTO loginDTO = new LoginDTO();

	String sql="SELECT * FROM login_user WHERE login_id=? AND login_pass=?";


	public LoginDTO getLoginUserInfo(String userId, String password) {
	try{
		PreparedStatement ps= con.prepareStatement(sql);
		ps.setString(1, userId);
		ps.setString(2,password);
		ResultSet rs =ps.executeQuery();

		if(rs.next()){
			loginDTO.setUserId(rs.getString("login_id"));
			loginDTO.setPassword(rs.getString("login_pass"));
			loginDTO.setUserName(rs.getString("user_name"));
		}
		if(!(rs.getString("login_id").equals(null))) {
			loginDTO.setLoginFlg(true);
		}




	}catch(SQLException e){
		e.printStackTrace();
	}

	try{
		con.close();
	}catch(SQLException e){
		e.printStackTrace();
	}

	 return loginDTO;
}
}

