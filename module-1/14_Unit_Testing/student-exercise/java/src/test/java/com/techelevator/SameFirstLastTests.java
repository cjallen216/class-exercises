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
	public void areTheFirstAndLastNumbersTheSame_shouldBeFalse_when3DifferentNumbersAreEntered()
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
	public void areTheFirstAndLastNumbersTheSame_shouldBeTrue_with4Numbers()
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
	public void areTheFirstAndLastNumbersTheSame_shouldBeTrue_with3Numbers()
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
	public void areTheFirstAndLastNumbersTheSame_shouldBeTrue_with2OfTheSameNumber()
	{
		// arrange
		int[] nums = {4, 4};
		boolean expected = SAME_FIRST_AND_LAST_NUMBER;
		// act
		boolean actual = sameFirstLast.isItTheSame(nums); 
		
		// assert
		Assert.assertEquals("Because 4 and 4 are the same number", expected, actual);
	}
	
	@Test
	public void areTheFirstAndLastNumbersTheSame_shouldBeFalse_when2NumbersAreNotEqual()
	{
		// arrange
		int[] nums = {3, 13};
		boolean expected = NOT_THE_SAME_FIRST_AND_LAST_NUMBER;
		// act
		boolean actual = sameFirstLast.isItTheSame(nums); 
		
		// assert
		Assert.assertEquals("Because 3 and 13 are the same number, even though 13 ends in a 3, we need the full integer, not just the digit", expected, actual);
	}
	
	@Test
	public void areTheFirstAndLastNumbersTheSame_shouldBeFalse_when7NumbersAreNotEqual()
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
	public void areTheFirstAndLastNumbersTheSame_shouldBeTrue_with7NumbersAndTheFirstAndLastAreEqual()
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
