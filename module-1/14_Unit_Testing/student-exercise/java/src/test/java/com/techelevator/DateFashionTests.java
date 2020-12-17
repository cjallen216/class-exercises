package com.techelevator;

import org.junit.Assert;
import org.junit.Test;

public class DateFashionTests
{
	@Test
	public void yourDateHasAStyleOf10_youWillGetATableForSure()
	{
		//arrange
		DateFashion dateFashion = new DateFashion();
		int you = 5;
		int date = 10;
		
		int expected = 2;
		
		// act
		int actual = dateFashion.getATable(you, date);
		
		// assert
		Assert.assertEquals("Because your date is super fashionable!", expected, actual);
	}
	
	@Test
	public void yourDateIsA2_andYouHaveAStyleOf5_youWontGetATable()
	{
		//arrange
		DateFashion dateFashion = new DateFashion();
		int you = 5;
		int date = 2;
		
		int expected = 0;
		
		// act
		int actual = dateFashion.getATable(you, date);
		
		// assert
		Assert.assertEquals("Because you do not fit the style required for this restaurant!", expected, actual);
	}
	
	@Test
	public void youBothAreDressedFairlyWell_youMightGetATable()
	{
		//arrange
		DateFashion dateFashion = new DateFashion();
		int you = 5;
		int date = 5;
		
		int expected = 1;
		
		// act
		int actual = dateFashion.getATable(you, date);
		
		// assert
		Assert.assertEquals("Because you are faily stylish, but there are others that have more style", expected, actual);
	}
}
