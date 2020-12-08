package com.techelevator;

import java.util.Scanner;

public class LinearConvert {

	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Please enter the length: ");
		String initialLength = scanner.nextLine();
		int convertLength = Integer.parseInt(initialLength);
		
		System.out.print("Is the measurement in (m)eter, or (f)eet? ");
		String measureType = scanner.nextLine();
		
		String finalConvertion = determineMeasureType (convertLength, measureType);
		System.out.println(convertLength + finalConvertion);
		
	}
	public static String determineMeasureType (int convertLength, String measureType)
	{
		double finalLength = 0;
		String conversionNumber = "error";
		
		if (measureType.equalsIgnoreCase("f"))
		{
			finalLength = convertLength * 0.3048;
			conversionNumber = ("f is " + (int)finalLength + "m.");
		}
		else if (measureType.equalsIgnoreCase("m"))
		{
			finalLength = convertLength * 3.2808399;
			conversionNumber = ("m is " + (int)finalLength + "f");
		}
		
		return conversionNumber;
	}
}
