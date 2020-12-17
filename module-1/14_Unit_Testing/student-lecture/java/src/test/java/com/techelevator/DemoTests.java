package com.techelevator;

import org.junit.Assert;
import org.junit.Test;

public class DemoTests
{
	@Test
	public void integerDivision_shouldTruncate_whenThereIsARemainder()
	{
		// arrange setup the variables for THIS test
		int numerator = 5;
		int denominator = 2;
		
		int expected = 2;
		
		// act - the ONE action that I am testing
		int answer = numerator / denominator;
		
		// assert - did it work?
		//Assert.assertEquals(expected, answer);
		Assert.assertEquals("Because integer division truncates the remainder", expected, answer);
		
	}
}
