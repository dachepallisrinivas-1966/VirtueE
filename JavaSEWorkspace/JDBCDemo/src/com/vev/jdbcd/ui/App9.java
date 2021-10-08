package com.vev.jdbcd.ui;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;


public class App9 {

	public static void main(String[] args) {
		
		String sql = "INSERT INTO emp888 (empno, basic) VALUES (? , ?)";
		
		try (	Scanner scanner = new Scanner(System.in);
				Connection connection =  DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "hr", "hr");
				PreparedStatement preparedStatement = connection.prepareCall(sql);){
			
			int empNumber, basic;
			String choice;
			
			connection.setAutoCommit(false);
			
			while (true) {
				System.out.print("Enter empno : ");		// 109
				empNumber = scanner.nextInt();			// mehboob
				System.out.print("Enter basic :" );
				basic = scanner.nextInt();
				
				preparedStatement.setInt(1, empNumber);
				preparedStatement.setInt(2, basic);
				preparedStatement.executeUpdate();
				
				
				System.out.println("Continue [Y/N] : ");
				choice = scanner.next();
				
				if (choice.equalsIgnoreCase("N")) { 
					break;
				} 
			}
		} catch(SQLException  excep) {
			excep.printStackTrace();
		} 

	}

}
