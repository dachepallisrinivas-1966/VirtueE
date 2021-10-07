package com.vev.jdbcd.ui;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Types;


public class App8 {

	public static void main(String[] args) {
		
		String sql = "{ ? = call getname(?) }";
		
		try (	Connection connection =  DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "hr", "hr");
				CallableStatement callableStatement = connection.prepareCall(sql);){
			
			callableStatement.setInt(2, 100);
			callableStatement.registerOutParameter(1, Types.CHAR);
			callableStatement.execute();
			
			System.out.println("employee name : " + callableStatement.getString(1));
			
		} catch(SQLException  excep) {
			excep.printStackTrace();
		} 

	}

}
