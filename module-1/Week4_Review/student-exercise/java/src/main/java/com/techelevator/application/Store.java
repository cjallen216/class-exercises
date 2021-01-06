package com.techelevator.application;

import com.techelevator.models.CashRegister;
import com.techelevator.models.Inventory;
import com.techelevator.models.ShoppingCart;
import com.techelevator.models.products.Product;
import com.techelevator.ui.UserInput;
import com.techelevator.ui.UserOutput;

/**
 * The store class is the main application.
 * 
 * Responsibilities:
 *      manage the flow of the application
 * 
 * Dependencies:
 *      Inventory
 *      ShoppingCart
 *      CashRegister
 * 
 *      UI:
 *      UserInput
 *      UserOutput
 * 
 *      Utility:
 *      Logger - used to log errors and transactions
 */
public class Store 
{
	private Inventory inventory = new Inventory();
	private ShoppingCart shoppingCart = new ShoppingCart();
	
    public void run()
    {

        while(true)
        {
            // display main menu and get their selection
            String option = UserInput.getHomeScreenOption();
            

            if(option.equals("add"))
            {
                // do add item task
            	//System.out.println("User chose Add");
            	addToCart();
            }
            else if(option.equals("pay"))
            {
                // go to cash register to check out
            	//System.out.println("User chose Pay");
            	checkOut();
                break;
            }
            else if(option.equals("cart"))
            {
            	// display the cart
            	//System.out.println("User chose Cart");
            	showCart();
            }
            else if (option.equals("quit"))
            {
            	//System.out.println("User chose Quit");
            	break;
            }
            else
            {
                // invalid option try again
            	//System.out.println("User chose an invalid option");
            }

        }

    }
    
    public void addToCart()
	{
		// show the products
    	UserOutput.displayInventory(inventory);
    	// prompt for input
    	String productId = UserInput.getSelectedProduct();
    	
    	// find the product based on the ID
    	Product product = null;
    	for (Product p : inventory.getProducts())
    	{
    		if(p.getId().equals(productId))
    		{
    			product = p;
    			break;
    		}
    	}
    	// add that product to the cart
    	shoppingCart.add(product);
   
	}
    
    public void showCart()
    {
    	// use the UserOutput to display
    }
    
    public void checkOut()
    {
    	
    }
	
}
