package com.vev.dao;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BatchPreparedStatementSetter;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.vev.model.Product;
import com.vev.service.ProductResultSetExtractor;

@Repository
public class ProductDAOImpl implements ProductDAO {
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	

	@Override
	public void insertProduct() {
		String sql = "INSERT INTO products VALUES (102, 'sound bar', '15w')";
		jdbcTemplate.update(sql);
	}

	@Override
	public int insertProduct(Product product) {
		String sql = "INSERT INTO products VALUES (?,?,?)";		// parameterized query
		
		// Object[] args = { product.getId(), product.getName(), product.getDescr()};
		// int rowCount = jdbcTemplate.update(sql, args);
		
		int rowCount = jdbcTemplate.update(sql, product.getId(), product.getName(), product.getDescr() );
		return rowCount;
	}

	@Override
	public int deleteProduct(int id) {
		String sql = "DELETE FROM products WHERE id = ?";
		int rowCount = jdbcTemplate.update(sql, id);
		return rowCount;
	}

	@Override
	public boolean deleteProduct(String name, String descr) {
		String sql = "DELETE FROM products WHERE name = ? AND descr = ?";
		int rowCount = jdbcTemplate.update(sql ,name, descr);
		return rowCount == 1;
	}

	@Override
	public boolean modifyProductDescr(int id, String descr) {
		String sql = "UPDATE products SET descr = ? WHERE id = ?";
		int rowCount = jdbcTemplate.update(sql, descr, id);
		return rowCount == 1;
	}

	@Override
	public List<Product> getAllProducts() {
		String sql = "SELECT * FROM products";
		// List<Product> products = jdbcTemplate.query(sql, new ProductRowMapper());
		
		List<Product> products = jdbcTemplate.query(sql, new BeanPropertyRowMapper<Product>(Product.class));
		
//		List<Product> products = jdbcTemplate.query(sql, (rs, rowNum) -> {
//			return new Product(rs.getInt("id"), rs.getString("name"), rs.getString("descr") );
//		});
		
		return products;
	}

	@Override
	public Product getProductById(int id) {
//		String sql = "SELECT * FROM products WHERE id = " + id;
//		List<Product> products = jdbcTemplate.query(sql, new BeanPropertyRowMapper<Product>(Product.class));
//		return products.get(0);
	

		String sql = "SELECT * FROM products WHERE id = ?";
		return jdbcTemplate.queryForObject(sql, new BeanPropertyRowMapper<Product>(Product.class), id);
	}

//	@Override
//	public String getProductDescrById(int id) {
//		String sql = "SELECT descr FROM products WHERE id = ?";
//		Product product = jdbcTemplate.queryForObject(sql, Product.class, id);
//		return product.getDescr();
//	}
	
	
	@Override
	public List<Product> findByProductName(String name) {
		String sql = "SELECT * FROM products WHERE name = ?";
		List<Product> products = jdbcTemplate.query(sql, new ProductResultSetExtractor(), name);
		return products;
	}
	
	

}
