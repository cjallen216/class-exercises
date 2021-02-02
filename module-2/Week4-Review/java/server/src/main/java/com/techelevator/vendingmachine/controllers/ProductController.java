package com.techelevator.vendingmachine.controllers;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.techelevator.vendingmachine.dao.ProductDAO;
import com.techelevator.vendingmachine.models.Product;

@RestController
public class ProductController
{
	@Autowired
	ProductDAO dao;
	
	@GetMapping("/products")
	//@RequestMapping(path = "/products", method = RequestMethod.GET)
	public List<Product> getAll()
	{
		List<Product> products = dao.getProducts();
		
		// TODO: get the products from the database
		products.add(get(1));
		products.add(get(2));
		products.add(get(3));
		products.add(get(4));
		products.add(get(5));
		
		return products;
	}
	
	@GetMapping("/products/{id}")
    public Product get(@PathVariable int id)
    {
    	Product product = dao.get(id);    	
    	return product;
    }
}
