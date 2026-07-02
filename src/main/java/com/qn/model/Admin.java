package com.qn.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Admin {
	private  String username;
	private  String password;
	Connection con=null;
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Admin(String username, String password) {
		super();
		this.username = username;
		this.password = password;
	}
	public Admin() {
		super();
	}
	@Override
	public String toString() {
		return "Admin [username=" + username + ", password=" + password + "]";
	}


{
	try {
		DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
		con = DriverManager.getConnection("jdbc:mysql://localhost:3306/june_2024", "root", "root");
	} catch (Exception e) {
		e.printStackTrace();
	}
}
public int adminLogin() {
	
	try {
		String s = "select*from admin where username=?";
		PreparedStatement pstmt = con.prepareStatement(s);
		pstmt.setString(1, username);
		ResultSet res = pstmt.executeQuery();
		if (res.next()) {
			if (password.equals(res.getString(2))) {
				return 1;// vaild username and password
			} else {
				return 0;// invaild password
			}

		}else {
			return-1;
		}
	} catch (SQLException e) {

		e.printStackTrace();
	}
     return 0;
}
}

