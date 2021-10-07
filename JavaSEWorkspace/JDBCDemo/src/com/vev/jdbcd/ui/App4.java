package com.vev.jdbcd.ui;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class App4 {

	public static void main(String[] args) {
		
		String sql = "INSERT INTO students (rollno, name, age) VALUES (?,?,?)";
		
		try (	Scanner scanner = new Scanner(System.in);
				Connection connection =  DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "hr", "hr");
				PreparedStatement preparedStatement = connection.prepareStatement(sql);){
			// 3. insert data into a table
			
			System.out.print("Enter roll number : ");
			int rollNumber = scanner.nextInt();
			System.out.print("Enter name : ");
			String name = scanner.next();
			System.out.print("Enter age : ");
			int age = scanner.nextInt();
		
			preparedStatement.setInt(1, rollNumber);
			preparedStatement.setString(2, name);
			preparedStatement.setInt(3, age);
			
			preparedStatement.executeUpdate();
			
			System.out.println("row inserted.");			
		} catch(SQLException  excep) {
			excep.printStackTrace();
		} 

	}

}
