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
}
