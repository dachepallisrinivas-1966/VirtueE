package com.vev.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.vev.model.Product;

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
	
	

}
