package com.vev.dao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import com.vev.model.Product;

@Repository
public class ProductDAOImpl implements ProductDAO {
	
	@Autowired
	private NamedParameterJdbcTemplate namedParameterJdbcTemplate;

	@Override
	public List<Product> getAllProducts() {
		String sql = "SELECT * FROM products";
		
		List<Product> products = namedParameterJdbcTemplate.query(sql, new BeanPropertyRowMapper<Product>(Product.class));
		return products;
	}

	@Override
	public Product getProductById(int id) {
		String sql = "SELECT * FROM products WHERE id = :productId";
		
		Map<String, Integer> paramMap = new HashMap<>();
		paramMap.put("productId", id);
		
		return namedParameterJdbcTemplate.queryForObject(sql, paramMap, new BeanPropertyRowMapper<Product>(Product.class));
	}

}
