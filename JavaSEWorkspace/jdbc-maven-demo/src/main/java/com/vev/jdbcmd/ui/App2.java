package com.vev.jdbcmd.ui;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class App2 {

	public static void main(String[] args) {
		try (Connection connection =  DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "hr", "hr");
			 Statement statement = connection.createStatement();){
			// insert data into a table
			String sql = "INSERT INTO students (rollno, name, age) VALUES (7, 'maha', 21)";
			
			statement.executeUpdate(sql);
			System.out.println("row inserted.");			
		} catch(SQLException  excep) {
			excep.printStackTrace();
		} 

	}

}
