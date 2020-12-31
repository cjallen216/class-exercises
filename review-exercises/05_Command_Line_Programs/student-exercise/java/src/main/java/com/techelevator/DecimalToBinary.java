package com.techelevator;

import java.util.Scanner;

public class DecimalToBinary
{

	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		
		String decimalInput;
		int decimalValue = 0;
		
		System.out.print("Please enter in a series of decimal values (separated by spaces): ");
		decimalInput = scanner.nextLine();
		decimalValue = Integer.parseInt(decimalInput);
		
		String multipleDecimalString[] = decimalInput.split(" ");
			
		for (int i = 0; i < multipleDecimalString.length; i++)
		{
			int numberInput = Integer.parseInt(multipleDecimalString[i]);
			System.out.println(" ");
			System.out.println(multipleDecimalString[i] + " in binary is " + Integer.toBinaryString(numberInput) + ".");
		}
	}

}
