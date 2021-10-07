package com.vev.jdbcd.ui;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class App3 {

	public static void main(String[] args) {
		
		try (	Scanner scanner = new Scanner(System.in);
				Connection connection =  DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "hr", "hr");){
			// 3. insert data into a table
			
			System.out.print("Enter roll number : ");
			int rollNumber = scanner.nextInt();
			System.out.print("Enter name : ");
			String name = scanner.next();
			System.out.print("Enter age : ");
			int age = scanner.nextInt();
			
			String sql = "INSERT INTO students (rollno, name, age) VALUES ("
					+ rollNumber
					+ ","
					+ "'"
					+ name
					+ "'"
					+ ","
					+ age
					+ ")";
			
			Statement statement = connection.createStatement();
			statement.executeUpdate(sql);
			System.out.println("row inserted.");			
		} catch(SQLException  excep) {
			excep.printStackTrace();
		} 

	}

}
