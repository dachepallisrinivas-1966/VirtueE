package com.vev.jdbcd.ui;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;


public class App7 {

	public static void main(String[] args) {
		
		String sql = "call raisesal(?,?)";
		
		try (	Connection connection =  DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "hr", "hr");
				CallableStatement callableStatement = connection.prepareCall(sql);){
			
			callableStatement.setInt(1, 101);
			callableStatement.setInt(2, 10);
			
			callableStatement.executeUpdate();
			
			System.out.println("procedure executed.");
			
		} catch(SQLException  excep) {
			excep.printStackTrace();
		} 

	}

}
