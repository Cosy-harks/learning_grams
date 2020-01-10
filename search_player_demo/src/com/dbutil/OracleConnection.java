package com.dbutil;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class OracleConnection {
	private static Connection connection;
	
	public static Connection getConnection() throws SQLException, ClassNotFoundException {
		Class.forName("oracle.jdbc.OracleDriver");
		System.out.println("Driver Loaded");
			
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String username = "java";
		String password = "java";
			
		//step 2 - open connection
		connection = DriverManager.getConnection(url, username, password);
		System.out.println("Connection Successful");
		return connection;
	}
}
//singleton java class