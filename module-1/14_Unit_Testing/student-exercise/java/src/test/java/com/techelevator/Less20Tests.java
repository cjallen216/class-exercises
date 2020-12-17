package com.techelevator;

import org.junit.Assert;
import org.junit.Test;

public class Less20Tests
{
	@Test
	public void number18Is2LessThanAMultipleOf20()
	{
		// arrange
		Less20 isLessThanMultipleOf20 = new Less20();
		int n = 18;
		
		boolean expected = true;
		
		// act
		boolean actual = isLessThanMultipleOf20.isLessThanMultipleOf20(n);
		
		// assert
		Assert.assertTrue("Becuase 18 is 2 less than a multiple of 20", expected);
	}
	
	@Test
	public void number19Is1LessThanAMultipleOf20()
	{
		// arrange
		Less20 isLessThanMultipleOf20 = new Less20();
		int n = 19;
		
		boolean expected = true;
		
		// act
		boolean actual = isLessThanMultipleOf20.isLessThanMultipleOf20(n);
		
		// assert
		Assert.assertTrue("Becuase 19 is 1 less than a multiple of 20", expected);
	}
	
	@Test
	public void number20IsAMultipleOf20_not1Or2Less()
	{
		// arrange
		Less20 isLessThanMultipleOf20 = new Less20();
		int n = 20;
		
		boolean expected = false;
		
		// act
		boolean actual = isLessThanMultipleOf20.isLessThanMultipleOf20(n);
		
		// assert
		Assert.assertFalse("Becuase 20 is a multiple of 20", expected);
	}
}
