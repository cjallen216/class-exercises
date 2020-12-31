package com.techelevator;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		
		String input;
		int maxValue;
		String fibString = "";
		
		System.out.println("Please enter the Fibonacci number: ");
		input = scanner.nextLine();
		maxValue = Integer.parseInt(input);
		
		fibString = calculateFibSeq(maxValue);
		System.out.println();
		System.out.println(fibString);
		
		
	}

	
	public static String calculateFibSeq(int maxValue)
	{
		String sequenceString = "0, ";
		int first = 0;
		int second = 1;
		
		while (second <= maxValue)
		{
			sequenceString += second + ", ";
			
			int newNumber = first + second;
			first = second;
			second = newNumber;
		}
		return sequenceString;
			
	}
}
