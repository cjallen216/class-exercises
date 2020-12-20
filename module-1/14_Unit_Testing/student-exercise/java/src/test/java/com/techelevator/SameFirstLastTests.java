package com.techelevator;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class SameFirstLastTests
{
	private SameFirstLast sameFirstLast;
	private static final boolean SAME_FIRST_AND_LAST_NUMBER = true;
	private static final boolean NOT_THE_SAME_FIRST_AND_LAST_NUMBER = false;
	
	@Before
	public void setup()
	{
		sameFirstLast = new SameFirstLast();
	}
	
	@Test
	public void areTheFirstAndLastNumbersTheSame()
	{
		// arrange
		int[] nums = {1, 2, 3};
		boolean expected = NOT_THE_SAME_FIRST_AND_LAST_NUMBER;
		// act
		boolean actual = sameFirstLast.isItTheSame(nums); 
		
		// assert
		Assert.assertEquals("Because 1 and 3 are not the same number", expected, actual);
	}
	
	@Test
	public void areTheFirstAndLastNumbersTheSame_fourNumbers()
	{
		// arrange
		int[] nums = {1, 2, 3, 1};
		boolean expected = SAME_FIRST_AND_LAST_NUMBER;
		// act
		boolean actual = sameFirstLast.isItTheSame(nums); 
		
		// assert
		Assert.assertEquals("Because 1 and 1 are the same number", expected, actual);
	}
	
	@Test
	public void areTheFirstAndLastNumbersTheSame_threeNumbers()
	{
		// arrange
		int[] nums = {1, 2, 1};
		boolean expected = SAME_FIRST_AND_LAST_NUMBER;
		// act
		boolean actual = sameFirstLast.isItTheSame(nums); 
		
		// assert
		Assert.assertEquals("Because 1 and 1 are the same number", expected, actual);
	}
	
	@Test
	public void areTheFirstAndLastNumbersTheSame_twoNumbers()
	{
		// arrange
		int[] nums = {1, 1};
		boolean expected = SAME_FIRST_AND_LAST_NUMBER;
		// act
		boolean actual = sameFirstLast.isItTheSame(nums); 
		
		// assert
		Assert.assertEquals("Because 1 and 1 are the same number", expected, actual);
	}
	
	@Test
	public void areTheFirstAndLastNumbersTheSame_twoNumbersNotEqual()
	{
		// arrange
		int[] nums = {1, 11};
		boolean expected = NOT_THE_SAME_FIRST_AND_LAST_NUMBER;
		// act
		boolean actual = sameFirstLast.isItTheSame(nums); 
		
		// assert
		Assert.assertEquals("Because 1 and 11 are the same number", expected, actual);
	}
	
	@Test
	public void areTheFirstAndLastNumbersTheSame_sevenNumbersNotEqual()
	{
		// arrange
		int[] nums = {1, 77, 38, 55, 63, 27, 11};
		boolean expected = NOT_THE_SAME_FIRST_AND_LAST_NUMBER;
		// act
		boolean actual = sameFirstLast.isItTheSame(nums); 
		
		// assert
		Assert.assertEquals("Because 1 and 11 are the same number", expected, actual);
	}
	
	@Test
	public void areTheFirstAndLastNumbersTheSame_sevenNumbersEqual()
	{
		// arrange
		int[] nums = {1, 77, 38, 55, 63, 27, 1};
		boolean expected = SAME_FIRST_AND_LAST_NUMBER;
		// act
		boolean actual = sameFirstLast.isItTheSame(nums); 
		
		// assert
		Assert.assertEquals("Because 1 and 1 are the same number", expected, actual);
	}
}
