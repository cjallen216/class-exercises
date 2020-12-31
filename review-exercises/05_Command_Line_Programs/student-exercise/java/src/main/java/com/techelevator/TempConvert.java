package com.techelevator;

import java.util.Scanner;

public class TempConvert {

	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Please enter the temperature: ");
		String temp = scanner.nextLine();
		int tempConvert = Integer.parseInt(temp);
		
		System.out.print("Is the temperature in (C)elsius or (F)ahrenheit? ");
		String tempType = scanner.nextLine();
		
		String outPutTemp = determineTempType(tempConvert, tempType);
		System.out.println();
		System.out.println(temp + outPutTemp);
		
		
	}

	public static String determineTempType (int tempConvert, String tempType)
	{
		double finalTemp = 0;
		String finalTempString = "error";
		
		if (tempType.equalsIgnoreCase("C"))
		{
			finalTemp = tempConvert * 1.8 + 32;
			finalTempString = ("C is " + (int)finalTemp + "F.");
		}
		else if (tempType.equalsIgnoreCase("F"))
		{
			finalTemp = (tempConvert - 32) / 1.8;
			finalTempString = ("F is " + (int)finalTemp + "C.");
		}
		return finalTempString;
	}
}
