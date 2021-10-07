package com.vev.jdbcd.ui;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class App5 {

	public static void main(String[] args) {
		
		String sql = "SELECT rollno, name, age FROM students WHERE age >= ? ORDER BY name";
		
		try (	Scanner scanner = new Scanner(System.in);
				Connection connection =  DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "hr", "hr");
				PreparedStatement preparedStatement = connection.prepareStatement(sql);){
			
			System.out.print("Enter min. age : ");
			int age = scanner.nextInt();
			
			preparedStatement.setInt(1, age);
			ResultSet resultSet = preparedStatement.executeQuery();
			while (resultSet.next()) {
				System.out.printf("%d\t%s\t%d\n", resultSet.getInt(1), resultSet.getString(2), resultSet.getInt(3));
			}
			
		} catch(SQLException  excep) {
			excep.printStackTrace();
		} 

	}

}
