package com.techelevator;

import org.junit.Assert;
import org.junit.Test;

public class MaxEnd3Tests
{
	@Test
	public void threeIsTheHigestNumber_andItIsTheLastNumber_soWeRepeatIt3Times()
	{
		// arrange
		MaxEnd3 maxEnd3 = new MaxEnd3();
		int[] nums = {1, 2, 3};
		
		int[] expected = {3, 3, 3};
		
		// act
		int[] actual = maxEnd3.makeArray(nums);
		
		// assert
		Assert.assertArrayEquals("Because 3 is the highest number, it should repeat 3 times", expected, actual);
	}
	
	@Test
	public void elevenIsTheHigestNumber_andItIsFirst_soWeRepeatIt3Times()
	{
		// arrange
		MaxEnd3 maxEnd3 = new MaxEnd3();
		int[] nums = {11, 5, 9};
		
		int[] expected = {11, 11, 11};
		
		// act
		int[] actual = maxEnd3.makeArray(nums);
		
		// assert
		Assert.assertArrayEquals("Because 11 is the highest number, it should repeat 3 times", expected, actual);
	}
	
	@Test
	public void elevenIsTheHigestNumber_butItIsNotTheFirstOrLast_soWeRepeatThree3Times()
	{
		// arrange
		MaxEnd3 maxEnd3 = new MaxEnd3();
		int[] nums = {2, 11, 3};
		
		int[] expected = {3, 3, 3};
		
		// act
		int[] actual = maxEnd3.makeArray(nums);
		
		// assert
		Assert.assertArrayEquals("Because 11 is the highest number, but it is not the first or last number", expected, actual);
	}
}
