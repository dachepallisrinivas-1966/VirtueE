package com.vev.config;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
@ComponentScan(basePackages = "com.vev")
public class AppConfig {
	
	@Bean
	public NamedParameterJdbcTemplate getNamedParameterJdbcTemplate() {
		return new NamedParameterJdbcTemplate(getDataSource());
	}
	
	@Bean
	public DataSource getDataSource() {
		String url = "jdbc:oracle:thin:@localhost:1521:XE";
		String userName = "hr";
		String password = "hr";
		String driver = "oracle.jdbc.driver.OracleDriver";
		
		DriverManagerDataSource dataSource = new DriverManagerDataSource(url, userName, password);
		dataSource.setDriverClassName(driver);
		
		return dataSource;
	}
	
	
}
