package com.techelevator;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class StringBitsTests
{
	private StringBits stringBits;
	
	@Before
	public void setup()
	{
		stringBits = new StringBits();
	}
	
	@Test
	public void isEveryOtherLetterBeingRemoved()
	{
		// arrange
		String str = "Hello";
		
		String expected = "Hlo";
		
		// act
		String actual = stringBits.getBits(str);
		
		// assert
		Assert.assertEquals("Because the 'e' and second 'l' should be removed" , expected, actual);
	}
	
	@Test
	public void twoLetterWord_secondLetterShouldBeRemoved()
	{
		// arrange
		String str = "Hi";
		
		String expected = "H";
		
		// act
		String actual = stringBits.getBits(str);
		
		// assert
		Assert.assertEquals("Because 'i' should be removed" , expected, actual);
	}
	
	@Test
	public void randomlLetters_shouldMakeANewWord_whenEveryOtherLetterIsRemoved()
	{
		// arrange
		String str = "Heeololeo";
		
		String expected = "Hello";
		
		// act
		String actual = stringBits.getBits(str);
		
		// assert
		Assert.assertEquals("Because 'i' should be removed" , expected, actual);
	}
}
