package com.techelevator;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class DateFashionTests
{
	private DateFashion dateFashion;
	private static final int FASHION_LEVEL_ONE = 1;
	private static final int FASHION_LEVEL_TWO = 2;
	private static final int FASHION_LEVEL_THREE = 3;
	private static final int FASHION_LEVEL_FOUR = 4;
	private static final int FASHION_LEVEL_FIVE = 5;
	private static final int FASHION_LEVEL_SIX = 6;
	private static final int FASHION_LEVEL_SEVEN = 7;
	private static final int FASHION_LEVEL_EIGHT = 8;
	private static final int FASHION_LEVEL_NINE = 9;
	private static final int FASHION_LEVEL_TEN = 10;
	private static final int WILL_NOT_GET_A_TABLE = 0;
	private static final int MIGHT_GET_A_TABLE = 1;
	private static final int WILL_GET_A_TABLE = 2;
	
	@Before
	public void setup()
	{
		dateFashion = new DateFashion();
	}
	
	@Test
	public void yourDateHasAStyleOf10YouAreA5_youWillGetATable()
	{
		//arrange
		int you = FASHION_LEVEL_FIVE;
		int date = FASHION_LEVEL_TEN;
		
		int expected = WILL_GET_A_TABLE;
		
		// act
		int actual = dateFashion.getATable(you, date);
		
		// assert
		Assert.assertEquals("Because your date is super fashionable!", expected, actual);
	}
	
	@Test
	public void yourDateIsA2_andYouHaveAStyleOf5_youWontGetATable()
	{
		//arrange
		int you = FASHION_LEVEL_FIVE;
		int date = FASHION_LEVEL_TWO;
		
		int expected = WILL_NOT_GET_A_TABLE;
		
		// act
		int actual = dateFashion.getATable(you, date);
		
		// assert
		Assert.assertEquals("Because you do not fit the style required for this restaurant!", expected, actual);
	}
	
	@Test
	public void youBothAre5_youMightGetATable()
	{
		//arrange
		int you = FASHION_LEVEL_FIVE;
		int date = FASHION_LEVEL_FIVE;
		
		int expected = MIGHT_GET_A_TABLE;
		
		// act
		int actual = dateFashion.getATable(you, date);
		
		// assert
		Assert.assertEquals("Because you are fairly stylish, but there are others that have more style", expected, actual);
	}
	
	@Test
	public void yourDateHasAStyleOf9ButYouAreAt1_youWillGetNotGetATable()
	{
		//arrange
		int you = FASHION_LEVEL_ONE;
		int date = FASHION_LEVEL_NINE;
		
		int expected = WILL_NOT_GET_A_TABLE;
		
		// act
		int actual = dateFashion.getATable(you, date);
		
		// assert
		Assert.assertEquals("Because even if your date is fashionable, you are not!", expected, actual);
	}
	
	@Test
	public void yourDateHasAStyleOf3ButYouAreAt7_youMightGetATable()
	{
		//arrange
		int you = FASHION_LEVEL_SEVEN;
		int date = FASHION_LEVEL_THREE;
		
		int expected = MIGHT_GET_A_TABLE;
		
		// act
		int actual = dateFashion.getATable(you, date);
		
		// assert
		Assert.assertEquals("Because your date is not that fashionable and you are above average, you might get a table", expected, actual);
	}
	
	@Test
	public void yourDateHasAStyleOf8ButYouAreAt4_youWillGetATable()
	{
		//arrange
		int you = FASHION_LEVEL_FOUR;
		int date = FASHION_LEVEL_EIGHT;
		
		int expected = WILL_GET_A_TABLE;
		
		// act
		int actual = dateFashion.getATable(you, date);
		
		// assert
		Assert.assertEquals("Because your date is just fashionable enough to get you a table since you are above average!", expected, actual);
	}
}
