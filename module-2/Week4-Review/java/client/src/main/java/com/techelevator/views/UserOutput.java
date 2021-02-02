package com.techelevator.views;

import java.util.List;

import com.techelevator.models.Product;

public class UserOutput
{
	public static void displayWelcome()
	{
		System.out.println("Welcome to The Vendor");
		System.out.println();
	}
	
	public static void displayProducts(List<Product> products)
	{
		System.out.println();
		System.out.println("-------------PRODUCTS-------------");
		System.out.println();
		
		for (Product product : products)
		{
			System.out.println(product.getSlot() + " " + product.getName() + " $" + product.getPrice());
		}
		System.out.println();
	}
	
	public static void displayProductDetails(Product product)
	{
		System.out.println();
		System.out.println("---------------SELECT PRODUCT---------------");
		System.out.println();
		
		System.out.println(product.getSlot());
		System.out.println(product.getName());
		System.out.println(product.getType());
		System.out.println(product.getId());
		System.out.println(product.getPrice());
		
		System.out.println();
	}

}
