package com.techelevator;

import org.junit.Assert;
import org.junit.Test;

public class FrontTimesTests
{
	@Test
	public void theBeginningOfChocolateIsSoNice_weSayItTwice()
	{
		// arrange
		FrontTimes frontOfWord = new FrontTimes();
		String characters = "Chocolate";
		int frontTimes = 2;
		
		String expected = "ChoCho";
		
		// act
		String actual = frontOfWord.generateString(characters, frontTimes);
		
		// assert
		Assert.assertEquals("Because Chocolate is so nice, we need to say it twice!", expected, actual);
	}
	
	@Test
	public void theBeginningOfChocolateIsSoNice_whyJustSayItTwice_whenYouCanSayIt3Times()
	{
		// arrange
		FrontTimes frontOfWord = new FrontTimes();
		String characters = "Chocolate";
		int frontTimes = 3;
		
		String expected = "ChoChoCho";
		
		// act
		String actual = frontOfWord.generateString(characters, frontTimes);
		
		// assert
		Assert.assertEquals("Because Chocolate is so nice, why just say it twice, when you can say it 3 times!", expected, actual);
	}
	
	@Test
	public void theBeginningOfTheAlphabet_repeated3Times()
	{
		// arrange
		FrontTimes frontOfWord = new FrontTimes();
		String characters = "Abc";
		int frontTimes = 3;
		
		String expected = "AbcAbcAbc";
		
		// act
		String actual = frontOfWord.generateString(characters, frontTimes);
		
		// assert
		Assert.assertEquals("Because even 3 letters can be repeated", expected, actual);
	}
}
