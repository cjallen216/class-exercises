package com.techelevator;

import java.util.Scanner;

public class Module1CodingAssessment
{

	public static void main(String[] args)
	{
		int year = 0;
		String make;
		boolean isClassicCar = false;
		int age = 0;
		Scanner scanner = new Scanner(System.in);
		
		// TODO Auto-generated method stub
		
		
		System.out.println("Please enter your info: ");
		make = scanner.next();
		year = scanner.nextInt();
		
		Car car = new Car(year, make, false);
		
		scanner.nextLine();
		
		System.out.println("Here is the data provided: " + car);
		
	}

}
