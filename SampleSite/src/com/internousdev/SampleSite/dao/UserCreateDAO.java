package com.internousdev.SampleSite.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.internousdev.SampleSite.util.DBConnector;

public class UserCreateDAO {
	private DBConnector db = new DBConnector();
	private Connection con = db.getConnection();

	private String sql="INSERT INTO login_user(login_id, login_pass, user_name VALUES(?,?,?)";


	public void newLoginUser(String userId, String password, String username)throws SQLException{
	try{
		PreparedStatement ps=con.prepareStatement(sql);
		ps.setString(1, userId);
		ps.setString(2, password);
		ps.setString(3, username);
		ps.execute();

	}catch(Exception e){
		e.printStackTrace();
	}finally{
		con.close();
	}
	}

}
