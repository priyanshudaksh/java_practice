package com.hexaware.model.dao;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.DriverManager;

public class DBUtility {
	public static Connection establishConnection() 
		throws SQLException, ClassNotFoundException {
		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/domaindb", 
				"root", "Password123");
		return con;
	}


	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Connection con = establishConnection();
		System.out.println(con);
	}
}
