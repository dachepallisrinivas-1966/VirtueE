package com.vev.dao;

import java.util.List;

import com.vev.model.Product;

public interface ProductDAO {
	void insertProduct();
	int insertProduct(Product product);
	int deleteProduct(int id);
	boolean deleteProduct(String name, String descr);
	boolean modifyProductDescr(int id, String descr);
	List<Product> getAllProducts();
	Product getProductById(int id);
	public List<Product> findByProductName(String name);
	
}
