package com.techelevator;

import org.junit.Assert;
import org.junit.Test;

public class CigarPartyTests
{
	@Test
	public void haveParty_shouldReturnFalse_whenFewerThan30CigarsOnWeekday()
	{
		// arrange
		CigarParty party = new CigarParty(); // object under test
		int numberOfCigars = 30;
		boolean isWeekend = false;
		
		boolean expected = false;
		
		// act
		boolean actual = party.haveParty(numberOfCigars, isWeekend);
		
		
		// assert
		Assert.assertFalse("Because parties with < 40 cigars suck", actual);
	}
	
	@Test
	public void haveParty_shouldReturnTrue_when50CigarsOnWeekday()
	{
		// arrange
		CigarParty party = new CigarParty(); // object under test
		int numberOfCigars = 50;
		boolean isWeekend = true;
		
		boolean expected = true;
		
		// act
		boolean actual = party.haveParty(numberOfCigars, isWeekend);
		
		
		// assert
		Assert.assertTrue("Because parties 50 cigars is great on a Tuesday night", actual);
	}
	
	@Test
	public void haveParty_shouldReturnTrue_whenYouHaveMoreThan60CigarsOnWeekend()
	{
		// arrange
		CigarParty party = new CigarParty(); // object under test
		int numberOfCigars = 70;
		boolean isWeekend = true;
		
		boolean expected = true;
		
		// act
		boolean actual = party.haveParty(numberOfCigars, isWeekend);
		
		
		// assert
		Assert.assertTrue("Because parties 70 cigars on Saturday night is a blowout!", actual);
	}
}
