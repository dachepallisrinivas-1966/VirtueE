package com.vev.dao;

import java.util.List;

import com.vev.model.Product;

public interface ProductDAO {

	List<Product> getAllProducts();
	Product getProductById(int id);
}
