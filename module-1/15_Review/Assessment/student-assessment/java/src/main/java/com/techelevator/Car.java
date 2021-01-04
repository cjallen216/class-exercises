package com.techelevator;

import java.util.Scanner;

public class Car
{
	private int year;
	private String make;
	private boolean isClassicCar;
	private int age;
	Scanner scanner = new Scanner(System.in);
	
	public Car (int year, String make, boolean isClassicCar)
	{
		this.year = year;
		this.make = make;
		this.isClassicCar = isClassicCar;
	}
	
	public int getYear()
	{
		return year;
	}
	public String getMake()
	{
		return make;
	}
	public boolean getIsClassicCar()
	{
		return isClassicCar;
	}
	public int getAge()
	{
		return age;
	}
	public void setYear(int year)
	{
		year = scanner.nextInt();
	}
	public void setMake (String make)
	{
		this.make = make;
	}
	public void setAge(int age)
	{
		this.age = age;
	}
	public boolean eCheckStatus (int yearToCheck)
	{
		if (age < 4 ^ age < 25)
		{
			return false;
		}
		if (yearToCheck == 0)
		{
			return true;
		}
		return false;
	}
	
}
