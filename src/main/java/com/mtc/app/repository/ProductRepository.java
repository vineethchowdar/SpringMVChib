package com.mtc.app.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;

import com.mtc.app.vo.Product;

@Primary
@Repository("productRepositoryDB")
public class ProductRepository implements IProductRepository{
	
	private List<Product> products;
	
	public ProductRepository() {
		//System.out.println("***ProductRepository()****");
		products = new ArrayList<Product>();		
		products.add(new Product(101,"Product1",300,20));
		products.add(new Product(102,"Product2",50,250));
		products.add(new Product(103,"Product3",170,30));
		products.add(new Product(104,"Product4",10,200));
	}
	
	public Product fetchProductById(int id) {
		System.out.println("ProductRepository : fetchProductById()");
		for (Product product : products) {
			if(product.getId() == id) {
				return product;
			}
		}
		
		return null;
	}

}
