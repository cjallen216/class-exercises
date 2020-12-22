package com.techelevator;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class MaxEnd3Tests
{
	private MaxEnd3 maxEnd3;
	
	@Before
	public void setup()
	{
		maxEnd3 = new MaxEnd3();
	}
	
	
	@Test
	public void firstOrLastHighest_threeIsRepeated3Times_becauseItIsTheLastAndTheHigestNumber()
	{
		// arrange
		int[] nums = {1, 2, 3};
		int[] expected = {3, 3, 3};
		
		// act
		int[] actual = maxEnd3.makeArray(nums);
		
		// assert
		Assert.assertArrayEquals("Because 3 is the highest number, and it is the last number, so it should repeat 3 times", expected, actual);
	}
	
	@Test
	public void firstOrLastHighest_elevenIsRepeated3Times_becauseItIsTheHigestNumber_andItIsFirst()
	{
		// arrange
		int[] nums = {11, 5, 9};		
		int[] expected = {11, 11, 11};
		
		// act
		int[] actual = maxEnd3.makeArray(nums);
		
		// assert
		Assert.assertArrayEquals("Because 11 is the highest number, and it is the first number, so it should repeat 3 times", expected, actual);
	}
	
	@Test
	public void firstOrLastHighest_threeIsRepeated3Times_evenIf11IsHigher_butItIsNotTheFirstOrLastInteger()
	{
		// arrange
		int[] nums = {2, 11, 3};		
		int[] expected = {3, 3, 3};
		
		// act
		int[] actual = maxEnd3.makeArray(nums);
		
		// assert
		Assert.assertArrayEquals("Because even if 11 is the highest number, but it is not the first or last number", expected, actual);
	}
}
