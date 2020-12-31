package com.techelevator;

import java.util.Scanner;

public class LinearConvert {

	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Please enter the length: ");
		String startLength = scanner.nextLine();
		int convertLength = Integer.parseInt(startLength);
		
		System.out.print("Is the measurement in (m)eter, or (f)eet? ");
		String startMeasureType = scanner.nextLine();
		
		String finalConversion = determineMeasureType(convertLength, startMeasureType);
		System.out.println(convertLength + finalConversion);
		
	}

	
	public static String determineMeasureType (int convertLength, String startMeasureType)
	{
		double finalLength = 0;
		String conversionNumberString = "error";
		
		if (startMeasureType.equalsIgnoreCase("f"))
		{
			finalLength = convertLength * 0.3048;
			conversionNumberString = ("f is " + (int)finalLength + "m");
		}
		else if (startMeasureType.equalsIgnoreCase("m"))
		{
			finalLength = convertLength * 3.2808399;
			conversionNumberString = ("m is " + (int)finalLength + "f");
		}
		return conversionNumberString;
	}
}
