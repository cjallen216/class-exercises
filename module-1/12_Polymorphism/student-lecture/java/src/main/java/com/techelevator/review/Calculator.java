package com.techelevator.review;

public class Calculator
{
	private Calculator()
	{
		
	}
	// overloading is creating multiple functions
	// with the same name, but different signatures
	
	public static int add(int a, int b)
	{
		return a + b;
	}
	
	public static double add(double a, double b)
	{
		return a + b;
	}
	
	public String add(String a, String b)
	{
		return a + " " + b;
	}
}
