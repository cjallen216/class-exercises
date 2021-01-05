package com.techelevator;

import java.io.File;
import java.io.FileNotFoundException;
import java.math.BigDecimal;
import java.util.Scanner;

public class Module1CodingAssessment
{
	public static void main(String[] args)
	{
		fileReadDemo();
	}
	
	public static void workingWithFiles()
	{
		String filePath = "D:/data/zipcodes.txt";
		File theFile = new File(filePath);
		
		System.out.println(theFile.exists());
	}
	
	public static void fileReadDemo()
	{
		// read all zip codes in the file
		
		// path
		//fileName - this is fully qualified (absolute)
		String filePath = "D:/data/zipcodes.txt";
		File zipCodeFile = new File(filePath);
		
		// open the file
		Scanner scanner;
		try
		{
			scanner = new Scanner(zipCodeFile);
			
			// process all lines
			while(scanner.hasNextLine()) // when should we stop looping?
			{
				String line = scanner.nextLine();
				System.out.println(line);
				
				
			}
		}
		catch (FileNotFoundException e)
		{
			// TODO Auto-generated catch block
			System.out.println("File: " + filePath + "was not found");
		}
		
		
	}
	
	public static void flowerShowDemo()
	{
		FlowerShopOrder order = new FlowerShopOrder("Apology", 48);
		
		System.out.println(order.toString());
		
		BigDecimal delivery = order.calculateDelivery(false, "29999");
		System.out.println(delivery);
		
		int numerator = 10;
		int denominator = 0;
		
		if (denominator != 0);
		{
			int answer = numerator / denominator;
			System.out.println(answer);
		}
		try
		{
			// some code that could cause an error
			
		} 
		catch (Exception e)
		{
			// here's what to do if there is a problem
			// TODO: handle exception
		}
		finally
		{
			// clean up code
		}
	}

}
