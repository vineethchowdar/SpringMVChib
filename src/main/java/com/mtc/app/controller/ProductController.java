package com.mtc.app.controller;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.mtc.app.vo.Product;

@Controller
public class ProductController {
	
	@Autowired
	private SessionFactory sessionFactory;
	
	@RequestMapping("/allProducts")
	public ModelAndView allProducts() {
		
		Session session = sessionFactory.openSession();
		
		Query query = session.createQuery("from Product");
		
		List<Product> products = query.list();
		
		ModelAndView modelAndView = new ModelAndView("productsView");
		
		modelAndView.addObject("products", products);
		
		return modelAndView;
	}

}
