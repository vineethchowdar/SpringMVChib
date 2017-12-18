package com.mtc.app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.mtc.app.repository.IProductRepository;
import com.mtc.app.repository.ProductRepository;

import com.mtc.app.vo.Order;
import com.mtc.app.vo.Product;

@Service("productService")
public class ProductService implements IProductService{
	
	@Autowired
	private IProductRepository productRepository;
	
	public ProductService() {
		// TODO Auto-generated constructor stub
	}
	
	public ProductService(IProductRepository productRepository) {		
		this.productRepository = productRepository;
	}

	public boolean processOrder(Order order) {
		
		System.out.println("ProductService : processOrder()");
		
		Product product = productRepository.fetchProductById(order.getProductId());
		
		if(order.getOrderQuantiy() <= product.getQuantity()) {
			System.out.println("Order processed successfully");
			return true;
		}
		
		System.out.println("Order cannot be processed ");
		return false;
	}
	
	public void setProductRepository(IProductRepository productRepository) {
		this.productRepository = productRepository;
	}

}
