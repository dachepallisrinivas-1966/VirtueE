package com.vev.service;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.vev.model.Product;

//public class ProductRowMapper implements RowMapper<Product> {
//
//	@Override
//	public Product mapRow(ResultSet rs, int rowNum) throws SQLException {
//		Product product = new Product();
//		product.setId(rs.getInt("id"));
//		product.setName(rs.getString("name"));
//		product.setDescr(rs.getString("descr"));
//		return product;
//	}
//
//}
