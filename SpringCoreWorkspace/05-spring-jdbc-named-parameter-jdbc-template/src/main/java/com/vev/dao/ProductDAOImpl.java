package com.vev.dao;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.simple.SimpleJdbcCall;
import org.springframework.stereotype.Repository;

import com.vev.model.Product;

@Repository
public class ProductDAOImpl implements ProductDAO {

	@Autowired
	private SimpleJdbcCall simpleJdbcCall;
	
	@Override
	public Product getProductNameAndDescr(int id) {
		simpleJdbcCall.withProcedureName("getProductNameAndDescr");
		
		MapSqlParameterSource paramMap = new MapSqlParameterSource();
		paramMap.addValue("p_id", id);
		Map<String, Object> outMap = simpleJdbcCall.execute(paramMap);
		
		Product product = new Product();
		product.setName((String)outMap.get("p_name"));
		product.setDescr((String)outMap.get("p_descr"));
		
		return product;
		
	}
	
	
}
