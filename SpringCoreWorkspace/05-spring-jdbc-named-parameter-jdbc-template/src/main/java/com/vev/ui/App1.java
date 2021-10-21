package com.vev.ui;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import com.vev.config.AppConfig;
import com.vev.dao.ProductDAO;
import com.vev.dao.ProductDAOImpl;
import com.vev.model.Product;

public class App1 {

	public static void main(String[] args) {
		AbstractApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		
		ProductDAO productDAO = context.getBean(ProductDAOImpl.class);
		Product product = productDAO.getProductNameAndDescr(104);
		System.out.println(product.getName() + "\t" + product.getDescr());
		
		context.registerShutdownHook();
	}

}
