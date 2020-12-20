package com.techelevator;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class NonStartTests
{
	private NonStart nonStart;
	
	@Before
	public void setup()
	{
		nonStart = new NonStart();
	}
	
	@Test
	public void removeFirstLetterFromHelloAndThere()
	{
		// arrange
		String a = "Hello";
		String b = "There";
		
		String expected = "ellohere";
		
		// act
		String actual = nonStart.getPartialString(a, b);
		
		// assert
		Assert.assertEquals("Because Hello There should be ellohere", expected, actual);
	}
	
	@Test
	public void removeFirstLetterFromJavaAndCode()
	{
		// arrange
		String a = "java";
		String b = "code";
		
		String expected = "avaode";
		
		// act
		String actual = nonStart.getPartialString(a, b);
		
		// assert
		Assert.assertEquals("Because java code should be avaode", expected, actual);
	}
	
	@Test
	public void removeFirstLetterFromRandomLettersToMakeANewPhrase()
	{
		// arrange
		String a = "shotl";
		String b = "java";
		
		String expected = "hotlava";
		
		// act
		String actual = nonStart.getPartialString(a, b);
		
		// assert
		Assert.assertEquals("Because shotl java code should be hotlava", expected, actual);
	}
}
