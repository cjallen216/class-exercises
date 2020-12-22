package com.techelevator;

import java.util.HashMap;
import java.util.Map;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class WordCountTests
{
	private WordCount wordCount;
	
	@Before
	public void setup()
	{
		wordCount = new WordCount();
	}
	
	@Test
	public void howManyWordsRepeat_inBaBaBlackSheep()
	{
		// arrange
		String[] words = {"ba", "ba", "black", "sheep"};
		
		Map<String, Integer> expected = new HashMap<>();
		expected.put("ba", 2);
		expected.put("black", 1);
		expected.put("sheep", 1);
		
		// act
		Map<String, Integer> actual = wordCount.getCount(words);
		
		// assert
		Assert.assertEquals(expected, actual);
		
	}
	
	@Test
	public void howManyLettersRepeat()
	{
		// arrange
		String[] words = {"a", "b", "a", "b", "c"};
		
		Map<String, Integer> expected = new HashMap<>();
		expected.put("a", 2);
		expected.put("b", 2);
		expected.put("c", 1);
		
		// act
		Map<String, Integer> actual = wordCount.getCount(words);
		
		// assert
		Assert.assertEquals(expected, actual);
		
	}
	
	@Test
	public void howManyLettersRepeat_withNoDataProvided()
	{
		// arrange
		String[] words = {};
		
		Map<String, Integer> expected = new HashMap<>();
		
		
		// act
		Map<String, Integer> actual = wordCount.getCount(words);
		
		// assert
		Assert.assertEquals(expected, actual);
		
	}
	
	@Test
	public void howManyLettersRepeat_withNoRepeatingLetters()
	{
		// arrange
		String[] words = {"c", "b", "a"};
		
		Map<String, Integer> expected = new HashMap<>();
		expected.put("a", 1);
		expected.put("b", 1);
		expected.put("c", 1);
		
		
		// act
		Map<String, Integer> actual = wordCount.getCount(words);
		
		// assert
		Assert.assertEquals(expected, actual);
		
	}
	
	@Test
	public void howManyLettersRepeat_MaryHadALittleLamb()
	{
		// arrange
		String[] words = {"Mary", "had", "a", "little", "lamb", "little", "lamb"};
		
		Map<String, Integer> expected = new HashMap<>();
		expected.put("Mary", 1);
		expected.put("had", 1);
		expected.put("a", 1);
		expected.put("little", 2);
		expected.put("lamb", 2);
		
		
		// act
		Map<String, Integer> actual = wordCount.getCount(words);
		
		// assert
		Assert.assertEquals(expected, actual);
		
	}
	
	@Test
	public void howManyLettersRepeat_WeWishYouAMerryChristmas()
	{
		// arrange
		String[] words = {"We", "wish", "you", "a", "Merry", "Christmas"};
		
		Map<String, Integer> expected = new HashMap<>();
		expected.put("We", 1);
		expected.put("wish", 1);
		expected.put("you", 1);
		expected.put("a", 1);
		expected.put("Merry", 1);
		expected.put("Christmas", 1);
		
		
		// act
		Map<String, Integer> actual = wordCount.getCount(words);
		
		// assert
		Assert.assertEquals(expected, actual);
		
	}
}
