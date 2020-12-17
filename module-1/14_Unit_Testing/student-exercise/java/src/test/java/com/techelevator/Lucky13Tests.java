package com.techelevator;

import org.junit.Assert;
import org.junit.Test;

public class Lucky13Tests
{
	
	@Test
	public void thereAreNo1sOr3s_youAreLucky()
	{
		// arrange
		Lucky13 lucky13 = new Lucky13();
		int[] nums = {0, 2, 4};
		
		boolean expected = true;
		
		// act
		boolean actual = lucky13.getLucky(nums);
		
		// assert
		Assert.assertTrue("Because there are no 1's or 3's in your array", actual);
	}
	
	@Test
	public void thereIsA1AndA3_youAreNotSoLucky()
	{
		// arrange
		Lucky13 lucky13 = new Lucky13();
		int[] nums = {1, 2, 3};
		
		boolean expected = false;
		
		// act
		boolean actual = lucky13.getLucky(nums);
		
		// assert
		Assert.assertFalse("Because there is a 1 AND a 3 in your array", actual);
	}
	
	@Test
	public void thereIsA1ButNo3_youAreStillNotLucky()
	{
		// arrange
		Lucky13 lucky13 = new Lucky13();
		int[] nums = {1, 2, 4};
		
		boolean expected = false;
		
		// act
		boolean actual = lucky13.getLucky(nums);
		
		// assert
		Assert.assertFalse("Because there is a 1 in your array", actual);
	}
}
