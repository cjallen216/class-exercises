package com.techelevator;

import org.junit.Assert;
import org.junit.Test;

public class CigarPartyTests
{
	private CigarParty party;
	
	@Test
	public void functionUnderTest_expectation_withGivenInput()
	{
		// arrange
		party = new CigarParty();
		int cigars = 30;
		boolean isWeekend = false;
		
		boolean expected = false;
		// act
		boolean actual = party.haveParty(cigars, isWeekend);
		
		// assert
		Assert.assertEquals(expected, actual);
	}
}
