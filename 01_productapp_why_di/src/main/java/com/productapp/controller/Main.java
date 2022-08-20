package com.productapp.controller;

import java.math.BigDecimal;
import java.util.*;
import com.productapp.dao.Product;
import com.productapp.service.ProductService;
import com.productapp.service.ProductServiceImpl;

public class Main {
	public static void main(String[] args) {

		ProductService productService = new ProductServiceImpl();
		for(Product p: productService.getAll()) {
			System.out.println(p.toString());
		}
//		System.out.println(productService.deleteProduct(1));

	}

}
