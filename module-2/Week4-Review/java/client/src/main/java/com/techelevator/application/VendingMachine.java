package com.techelevator.application;

import java.util.ArrayList;
import java.util.List;

import com.techelevator.models.Product;
import com.techelevator.services.AuthenticationService;
import com.techelevator.services.ProductService;
import com.techelevator.views.UserInput;
import com.techelevator.views.UserOutput;

public class VendingMachine
{
    AuthenticationService authenticationService;
    ProductService productService;
    
    public VendingMachine(String baseUrl)
    {
    	authenticationService = new AuthenticationService(baseUrl);
    	productService = new ProductService(baseUrl);
    }

    public void run()
    {
    	 UserOutput.displayWelcome();

         while (true) 
         {             
        	int menuSelection = UserInput.getHomeMenuOptions();
        	
        	if (menuSelection == 1)
			{
				// display all products
        		//System.out.println("printing products");
        		displayProducts();
			}
        	else if (menuSelection == 2)
			{
				// display all products
        		//System.out.println("printing one product");
        		selectProduct();
			}
        	else if (menuSelection == 0)
        	{
        		break;
        	}
        	else
        	{
				// invalid selection
        		 System.out.println("Please select a valid options");
        		 System.out.println();
			}
         }
         
         System.out.println("Goodbye");
    }
    
    
    private void displayProducts()
    {
    	// First round of test:
    	 /* List<Product> products = new ArrayList<Product>();
    	 * 
    	 * UserOutput.displayProducts(products);
    	*/
    	
    	// TODO: get a list of products from the API
    	List<Product> products = productService.getAllProducts();
    	
    	UserOutput.displayProducts(products);
    }
    
    private void selectProduct()
    {
    	List<Product> products = productService.getAllProducts();
    	
    	UserOutput.displayProducts(products);
    	
    	// get selection from user
    	int productId = UserInput.getSelectedProducts(products);
    	
    	// call the API to the get the product
    	Product selectedProduct = productService.getProductById(productId);
    	
    	// display the product details of the selected product
    	UserOutput.displayProductDetails(selectedProduct);
    }
}
