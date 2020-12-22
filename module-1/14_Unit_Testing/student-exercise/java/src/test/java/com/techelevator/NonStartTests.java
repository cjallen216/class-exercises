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
	public void removeFirstLetters_fromHelloAndThere()
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
	public void removeFirstLetters_fromJavaAndCode()
	{
		// arrange
		String a = "java";
		String b = "code";
		
		String expected = "avaode";
		
		// act
		String actual = nonStart.getPartialString(a, b);
		
		// assert
		Assert.assertEquals("Because 'java' and 'code' should be 'avaode'", expected, actual);
	}
	
	@Test
	public void removeFirstLetter_fromRandomLetters_toMakeANewPhrase()
	{
		// arrange
		String a = "shotl";
		String b = "java";
		
		String expected = "hotlava";
		
		// act
		String actual = nonStart.getPartialString(a, b);
		
		// assert
		Assert.assertEquals("Because 'shotl' and 'java' should be combined to make 'hotlava'", expected, actual);
	}
}
