package com.techelevator;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class AnimalGroupNameTests
{
	private AnimalGroupName groupName;
	
	@Before
	public void setup()
	{
		groupName = new AnimalGroupName();
	}
	
	@Test
	public void animalGroupName_shouldBeTower_whenGiraffeInput()
	{
		// arrange
		String animalName = "giraffe";
		String expected = "Tower";
		
		// act
		String actual = groupName.getHerd(animalName);
		
		// assert
		Assert.assertEquals("Because a group of Girafee's are called a Tower", expected, actual);
	}
	
	@Test
	public void animalGroupName_shouldBeUnknown_withNoAnimalInput()
	{
		// arrange
		String animalName = "";
		String expected = "unknown";
		
		// act
		String actual = groupName.getHerd(animalName);
		
		// assert
		Assert.assertEquals("Because if you don't provide an animal, we can't give you a group name", expected, actual);
	}
	
	@Test
	public void animalGroupName_isUnknown_whenAnimalInputIsNotOnTheList()
	{
		// arrange
		String animalName = "walrus";
		String expected = "unknown";
		
		// act
		String actual = groupName.getHerd(animalName);
		
		// assert
		Assert.assertEquals("Because Walrus isn't a group in our list", expected, actual);
	}
	
	@Test
	public void animalGroupName_shouldBeCrash_whenRhinoIsEntered()
	{
		// arrange
		String animalName = "Rhino";
		String expected = "Crash";
		
		// act
		String actual = groupName.getHerd(animalName);
		
		// assert
		Assert.assertEquals("Because a group of Rhino's is called a Crash", expected, actual);
	}
	
	@Test
	public void animalGroupName_shouldBeCrash_evenWhenAllLettersAreLowercase()
	{
		// arrange
		String animalName = "rhino";
		String expected = "Crash";
		
		// act
		String actual = groupName.getHerd(animalName);
		
		// assert
		Assert.assertEquals("Because a group of Rhino's is called a Crash", expected, actual);
	}
	
	@Test
	public void animalGroupName_isUnknown_whenAPluralNameIsGiven()
	{
		// arrange
		String animalName = "elephants";
		String expected = "unknown";
		
		// act
		String actual = groupName.getHerd(animalName);
		
		// assert
		Assert.assertEquals("Because a singlular animal was requested", expected, actual);
	}
}
