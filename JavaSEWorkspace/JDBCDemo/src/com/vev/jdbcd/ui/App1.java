package com.vev.jdbcd.ui;

import java.sql.DriverManager;
import java.sql.SQLException;

public class App1 {

	public static void main(String[] args) {
		try {
			// 1. load the jdbc driver
			Class.forName("oracle.jdbc.driver.OracleDriver");
			// 2. establish connection - connection-string-url, userName, password
			DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "hr", "hr");
			System.out.println("connected.");
		} catch(ClassNotFoundException excep) {
			excep.printStackTrace();
		} catch(SQLException excep) {
			excep.printStackTrace();
		}

	}

}
