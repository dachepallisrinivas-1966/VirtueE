package com.vev.jdbcmd.ui;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;

public class App3 {

	public static void main(String[] args) {
		Properties databaseProperties = new Properties();
		
		try {
			databaseProperties.load(new FileInputStream("src/main/resources/database.properties"));
		} catch(IOException excep) {
			excep.printStackTrace();
		}
		
		String driver = databaseProperties.getProperty("driver.name");
		String url = databaseProperties.getProperty("connection.url");
		String user = databaseProperties.getProperty("user.name");
		String password = databaseProperties.getProperty("password");
		
		String sql = "SELECT employee_id, first_name, salary FROM employees";
		
		try (Connection connection = DriverManager.getConnection(url, user, password); 
			PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
			
			ResultSet resultSet = preparedStatement.executeQuery();
			while (resultSet.next()) {
				System.out.printf("%5s\t%-20s\t%5s\n", resultSet.getString(1), resultSet.getString(2), resultSet.getString(3));
			}
			
		} catch(SQLException exception) {
			exception.printStackTrace();
		}

	}

}
