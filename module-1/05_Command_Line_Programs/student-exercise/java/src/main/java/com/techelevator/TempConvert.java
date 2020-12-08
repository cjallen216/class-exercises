package com.techelevator;

import java.util.Scanner;

public class TempConvert {

	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Please enter the temperature: ");
		String temp = scanner.nextLine();
		int newTemp = Integer.parseInt(temp);
		
		System.out.print("Is the temperature in (C)elsius, or (F)ahrenheit?: ");
		String tempType = scanner.nextLine();
		
		String outputTemp = determineTempType(newTemp, tempType);
		System.out.println(newTemp + outputTemp);
		
	}

	public static String determineTempType (int newTemp, String tempType)
	{
		double finalTemp = 0;
		String finalFinalTemp = "error";
				
		if (tempType.equalsIgnoreCase("C"))
		{
			finalTemp = newTemp * 1.8 + 32;
			finalFinalTemp = ("C is " + (int)finalTemp + "F.");
		}
		else if (tempType.equalsIgnoreCase("F"))
		{
			finalTemp = (newTemp - 32) / 1.8;
			finalFinalTemp = ("F is " + (int)finalTemp + "C.");
		}
				
		return finalFinalTemp;
	}
}
