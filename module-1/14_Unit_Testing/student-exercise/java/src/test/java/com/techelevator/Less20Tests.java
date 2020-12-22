package com.techelevator;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class Less20Tests
{
	private Less20 isLessThanMultipleOf20;
	private static final int EIGHTTEEN = 18;
	private static final int NINETEEN = 19;
	private static final int TWENTY = 20;
	private static final int TWENTY_ONE = 21;
	private static final int SEVENTY_NINE = 79;
	
	@Before
	public void setup()
	{
		isLessThanMultipleOf20 = new Less20();
	}
	
	@Test
	public void oneOr2LessMultipleOf20_isTrue_when18IsInput()
	{
		// arrange
		boolean expected = true;
		
		// act
		boolean actual = isLessThanMultipleOf20.isLessThanMultipleOf20(EIGHTTEEN);
		
		// assert
		Assert.assertEquals("Becuase 18 is 2 less than a multiple of 20", expected, actual);
	}
	
	@Test
	public void oneOr2LessMultipleOf20_isTrue_when19IsInput()
	{
		// arrange		
		boolean expected = true;
		
		// act
		boolean actual = isLessThanMultipleOf20.isLessThanMultipleOf20(NINETEEN);
		
		// assert
		Assert.assertEquals("Becuase 19 is 1 less than a multiple of 20", expected, actual);
	}
	
	@Test
	public void oneOr2LessMultipleOf20_isFalse_when20IsInput()
	{
		// arrange
		boolean expected = false;
		
		// act
		boolean actual = isLessThanMultipleOf20.isLessThanMultipleOf20(TWENTY);
		
		// assert
		Assert.assertEquals("Becuase 20 is a multiple of 20", expected, actual);
	}
	
	@Test
	public void oneOr2LessMultipleOf20_isFalse_when21IsInput()
	{
		// arrange
		boolean expected = false;
		
		// act
		boolean actual = isLessThanMultipleOf20.isLessThanMultipleOf20(TWENTY_ONE);
		
		// assert
		Assert.assertEquals("Becuase 21 is a NOT a multiple of 20 and it's over", expected, actual);
	}
	
	@Test
	public void oneOr2LessMultipleOf20_isTrue_when79IsInput()
	{
		// arrange
		boolean expected = true;
		
		// act
		boolean actual = isLessThanMultipleOf20.isLessThanMultipleOf20(SEVENTY_NINE);
		
		// assert
		Assert.assertEquals("Becuase 79 is a NOT a multiple of 20 but it is 1 less than a multiple of 20!", expected, actual);
	}
}
