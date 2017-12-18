package com.mtc.app.repository;

import com.mtc.app.vo.Product;

public interface IProductRepository {
	
	Product fetchProductById(int id);

}
