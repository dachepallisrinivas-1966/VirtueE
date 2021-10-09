package com.vev.bsmj.util;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class ConnectionFactory {
	
	public static Connection getConnection() throws SQLException {
		Properties databaseProperties = new Properties();
		
		try (FileInputStream fis = new FileInputStream("src/main/resources/database.properties");){
			databaseProperties.load(fis);
		} catch(IOException excep) {
			excep.printStackTrace();
		}
		
		String url = databaseProperties.getProperty("connection.url");
		String userName = databaseProperties.getProperty("user.name");
		String password = databaseProperties.getProperty("password");
		
		return DriverManager.getConnection(url, userName, password);
	}
}
