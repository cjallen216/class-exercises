package com.techelevator;

import org.junit.Assert;
import org.junit.Test;

public class AnimalGroupNameTests
{
	@Test
	public void giraffeeGroup_shouldBeATower()
	{
		// arrange
		AnimalGroupName groupName = new AnimalGroupName();
		String animalName = "giraffe";
		String animalGroupName = "Tower";
		
		String expected = "Tower";
		
		// act
		String actual = groupName.getHerd(animalName);
		
		// assert
		Assert.assertEquals("Because a group of Girafee's are called a Tower", expected, actual);
	}
	
	@Test
	public void noAnimal_thenGroupName_shouldBeUnknown()
	{
		// arrange
		AnimalGroupName groupName = new AnimalGroupName();
		String animalName = "";
		String animalGroupName = "unknown";
		
		String expected = "unknown";
		
		// act
		String actual = groupName.getHerd(animalName);
		
		// assert
		Assert.assertEquals("Because if you don't provide an animal, we can't give you a group name", expected, actual);
	}
	
	@Test
	public void animalNotInOurList_thenGroupName_isUnknown()
	{
		// arrange
		AnimalGroupName groupName = new AnimalGroupName();
		String animalName = "walrus";
		String animalGroupName = "unknown";
		
		String expected = "unknown";
		
		// act
		String actual = groupName.getHerd(animalName);
		
		// assert
		Assert.assertEquals("Because Walrus isn't a group in our list", expected, actual);
	}
	
	@Test
	public void rhinoGroup_shouldBeCrash()
	{
		// arrange
		AnimalGroupName groupName = new AnimalGroupName();
		String animalName = "Rhino";
		String animalGroupName = "Crash";
		
		String expected = "Crash";
		
		// act
		String actual = groupName.getHerd(animalName);
		
		// assert
		Assert.assertEquals("Because a group of Rhino's is called a Crash", expected, actual);
	}
	
	@Test
	public void rhinoGroup_shouldBeCrash_evenWhenAllLettersAreLowercase()
	{
		// arrange
		AnimalGroupName groupName = new AnimalGroupName();
		String animalName = "rhino";
		String animalGroupName = "Crash";
		
		String expected = "Crash";
		
		// act
		String actual = groupName.getHerd(animalName);
		
		// assert
		Assert.assertEquals("Because a group of Rhino's is called a Crash", expected, actual);
	}
	
	@Test
	public void elephantGroup_isASingularName_inOurList()
	{
		// arrange
		AnimalGroupName groupName = new AnimalGroupName();
		String animalName = "elephants";
		String animalGroupName = "unknown";
		
		String expected = "unknown";
		
		// act
		String actual = groupName.getHerd(animalName);
		
		// assert
		Assert.assertEquals("Because a singlular animal was requested", expected, actual);
	}
}
