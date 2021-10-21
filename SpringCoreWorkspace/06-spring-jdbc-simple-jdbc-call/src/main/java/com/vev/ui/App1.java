package com.vev.ui;

import java.util.List;

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
		// productDAO.insertProduct();
		
//		Product product = new Product();
//		product.setId(104);
//		product.setName("Wahsing machine");
//		product.setDescr("Top load");
//		int count = productDAO.insertProduct(product);
//		if (count == 1)
//			System.out.println("product inserted");
//		else
//			System.out.println("unable to insert product");
		
//		int count = productDAO.deleteProduct(102);
//		if (count == 1)
//			System.out.println("product deleted");
//		else
//			System.out.println("product not found");
		
//		boolean result = productDAO.deleteProduct("Smart Phone", "5G Compatable");
//		if (result)
//			System.out.println("product deleted");
//		else
//			System.out.println("product not found");
		
//		boolean result = productDAO.modifyProductDescr(104, "Front Load");
//		if (result)
//			System.out.println("product description modified");
//		else
//			System.out.println("product not found");

		List<Product> products = productDAO.getAllProducts();
		products.forEach(System.out::println);
		
		System.out.println("-----------------------------------------------------");
		Product product = productDAO.getProductById(101);
		System.out.println(product);
		
		// System.out.println(productDAO.getProductDescrById(101));
		
//		List<Product> products = productDAO.findByProductName("tv");
//		products.forEach(System.out::println);
		
		context.registerShutdownHook();
	}

}
