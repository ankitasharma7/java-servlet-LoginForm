package com.login.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;


public class RegisterDao {
	String url="jdbc:sqlite:register.db";
	
	
	public int check(String username,String password)
	{
		int status=0; 
		try {
			Class.forName("org.sqlite.JDBC");
			Connection con = DriverManager.getConnection(url);
			PreparedStatement ps = con.prepareStatement("insert into user values(?,?)");
			
			ps.setString(1,username);
			ps.setString(2, password);
			status=ps.executeUpdate();
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return status;
	}
}
