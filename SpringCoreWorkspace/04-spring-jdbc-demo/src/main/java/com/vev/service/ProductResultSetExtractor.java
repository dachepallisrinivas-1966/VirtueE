package com.vev.service;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.ResultSetExtractor;

import com.vev.model.Product;

public class ProductResultSetExtractor implements ResultSetExtractor<List<Product>> {

	@Override
	public List<Product> extractData(ResultSet rs) throws SQLException, DataAccessException {
		System.out.println("extractData method ...");
		List<Product> products = new ArrayList<>();
		
		while(rs.next()) {
			Product product = new Product();
			product.setId(rs.getInt("id"));
			product.setName(rs.getString("name"));
			product.setDescr(rs.getString("descr"));
		
			products.add(product);
		}
		return products;
	}

	

}
