package com.techelevator;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class Lucky13Tests
{
	private Lucky13 lucky13;
	private static final boolean NO_ONES_OR_THREES_IS_LUCKY = true;
	private static final boolean ONES_OR_THREES_ARE_NOT_LUCKY = false;
	
	@Before
	public void setup()
	{
		lucky13 = new Lucky13();
	}
	
	
	@Test
	public void thereAreNo1sOr3s_youAreLucky()
	{
		// arrange
		int[] nums = {0, 2, 4};
		
		boolean expected = NO_ONES_OR_THREES_IS_LUCKY;
		
		// act
		boolean actual = lucky13.getLucky(nums);
		
		// assert
		Assert.assertEquals("Because there are no 1's or 3's in your array", expected, actual);
	}
	
	@Test
	public void thereIsA1AndA3_youAreNotSoLucky()
	{
		// arrange
		int[] nums = {1, 2, 3};
		
		boolean expected = ONES_OR_THREES_ARE_NOT_LUCKY;
		
		// act
		boolean actual = lucky13.getLucky(nums);
		
		// assert
		Assert.assertEquals("Because there is a 1 AND a 3 in your array", expected ,actual);
	}
	
	@Test
	public void thereIsA1ButNo3_youAreStillNotLucky()
	{
		// arrange
		int[] nums = {1, 2, 4};
		
		boolean expected = ONES_OR_THREES_ARE_NOT_LUCKY;
		
		// act
		boolean actual = lucky13.getLucky(nums);
		
		// assert
		Assert.assertEquals("Because there is a 1 in your array", expected, actual);
	}
	
	@Test
	public void thereIsA3ButNo1_youAreStillNotLucky()
	{
		// arrange
		int[] nums = {3, 7, 2, 5, 8};
		
		boolean expected = ONES_OR_THREES_ARE_NOT_LUCKY;
		
		// act
		boolean actual = lucky13.getLucky(nums);
		
		// assert
		Assert.assertEquals("Because there is a 3 in your array", expected, actual);
	}
}
