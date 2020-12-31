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
}
