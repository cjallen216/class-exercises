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
	public void howManyWords()
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
}
