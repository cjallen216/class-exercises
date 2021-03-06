package com.techelevator.vendingmachine.dao;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;
import org.springframework.stereotype.Component;

import com.techelevator.vendingmachine.exceptions.ProductNotFoundException;
import com.techelevator.vendingmachine.models.Product;

@Component
public class ProductSqlDAO implements ProductDAO
{
	@Autowired
	private JdbcTemplate jdbcTemplate;

	
	public List<Product> getProducts()
	{
		List<Product> products = new ArrayList<Product>();
		
		String sql = "SELECT p.product_id AS id\r\n" + 
				"        , p.name\r\n" + 
				"        , p.price\r\n" + 
				"        , pt.name AS type\r\n" + 
				"        , i.slot_id as slot \r\n" + 
				"        , i.quantity\r\n" + 
				"FROM product AS p\r\n" + 
				"INNER JOIN product_type AS pt\r\n" + 
				"        ON p.product_type_id = pt.product_type_id\r\n" + 
				"INNER JOIN inventory AS i\r\n" + 
				"        ON p.product_id = i.product_id; ";
		
		SqlRowSet rows = jdbcTemplate.queryForRowSet(sql);
		
		while (rows.next())
		{
			Product product = mapRowToProduct(rows);
			
			products.add(product);
		}
		
		return products;
	}
	
	public Product get(int id)
	{
		Product product = null;
		
		String sql = "SELECT p.product_id AS id\r\n" + 
				"        , p.name\r\n" + 
				"        , p.price\r\n" + 
				"        , pt.name AS type\r\n" + 
				"        , i.slot_id as slot \r\n" + 
				"        , i.quantity\r\n" + 
				"FROM product AS p\r\n" + 
				"INNER JOIN product_type AS pt\r\n" + 
				"        ON p.product_type_id = pt.product_type_id\r\n" + 
				"INNER JOIN inventory AS i\r\n" + 
				"        ON p.product_id = i.product_id\r\n" + 
				"WHERE p.product_id = ?; ";
		
		SqlRowSet row = jdbcTemplate.queryForRowSet(sql);
		
		if (row.next())
		{
			product = mapRowToProduct(row);
		}

		return product;
	}
	
	private Product mapRowToProduct(SqlRowSet row)
	{
		Product product = new Product();

    	product.setId(row.getInt("id"));
    	product.setName(row.getString("name"));
    	product.setPrice(row.getBigDecimal("price"));
    	product.setQuantity(row.getInt("quantity"));
    	product.setSlot(row.getString("slot"));
    	product.setType(row.getString("type"));
		return product;
	}
}
