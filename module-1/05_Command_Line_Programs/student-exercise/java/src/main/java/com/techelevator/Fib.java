package com.techelevator;

import java.util.Scanner;

public class Fib
{
	public static void main(String[] arg)
	{
		// helper objects
		Scanner scanner = new Scanner(System.in);
		
		// variables
		String input;
		int maxValue;
		String fibonacciSeqString = "";
		
		// get user input
		System.out.print("What is the max Fib number you want?: ");
		input = scanner.nextLine();
		maxValue = Integer.parseInt(input);
				
		// perform the calculations
		fibonacciSeqString = calculateFibSeq(maxValue);
		
		// display output
		System.out.println();
		System.out.println("the Fib seq for " + maxValue + " is: " );
		System.out.println(fibonacciSeqString);
		
	}
	
	public static String calculateFibSeq(int maxValue)
	{
		String sequence = "0 ";
		int first = 0;
		int second = 1;
		
		while (second <= maxValue)
		{
			sequence += second + ", ";
			
			int temp = first + second;
			first = second;
			second = temp;
		}
		
		return sequence;
	}
}
