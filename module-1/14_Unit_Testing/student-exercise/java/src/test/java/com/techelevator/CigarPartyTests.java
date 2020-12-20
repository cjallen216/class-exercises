package com.techelevator;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CigarPartyTests
{
	
	private CigarParty party;
	private static final int THIRTY_CIGARS = 30;
	private static final int THIRTY_NINE_CIGARS = 39;
	private static final int FORTY_CIGARS = 40;
	private static final int FORTY_ONE_CIGARS = 41;
	private static final int FIFTY_CIGARS = 50;
	private static final int FIFTY_NINE_CIGARS = 59;
	private static final int SIXTY_CIGARS = 60;
	private static final int SIXTY_ONE_CIGARS = 61;
	private static final int SEVENTY_CIGARS = 70;
	private static final boolean IS_WEEKEND = true;
	private static final boolean IS_NOT_WEEKEND = false;
	
	
	@Before
	public void setup()
	{
		party = new CigarParty();
	}
	
	@Test
	public void haveParty_shouldReturnFalse_whenFewerThan30CigarsOnWeekday()
	{
		// arrange
		boolean expected = false;
		
		// act
		boolean actual = party.haveParty(THIRTY_CIGARS, IS_NOT_WEEKEND);
		
		
		// assert
		Assert.assertEquals("Because parties with < 40 cigars suck", expected, actual);
	}
	
	@Test
	public void haveParty_shouldReturnTrue_when50CigarsOnWeekday()
	{
		// arrange
		boolean expected = true;
		
		// act
		boolean actual = party.haveParty(FIFTY_CIGARS, IS_WEEKEND);
		
		
		// assert
		Assert.assertEquals("Because parties 50 cigars is great on a Tuesday night", expected, actual);
	}
	
	@Test
	public void haveParty_shouldReturnTrue_whenYouHaveMoreThan60CigarsOnWeekend()
	{
		// arrange
		boolean expected = true;
		
		// act
		boolean actual = party.haveParty(SEVENTY_CIGARS, IS_WEEKEND);
		
		
		// assert
		Assert.assertEquals("Because parties 70 cigars on Saturday night is a blowout!", expected, actual);
	}
	
	@Test
	public void haveParty_shouldReturnTrue_whenYouHave40CigarsNotOnWeekend()
	{
		// arrange
		boolean expected = true;
		
		// act
		boolean actual = party.haveParty(FORTY_CIGARS, IS_NOT_WEEKEND);
		
		// assert
		Assert.assertEquals("Because 40 cigars on a weekday is enough to have a party", expected, actual);
	}
	
	@Test
	public void haveParty_shouldReturnFalse_whenYouHave39CigarsNotOnWeekend()
	{
		// arrange
		boolean expected = false;
		
		// act
		boolean actual = party.haveParty(THIRTY_NINE_CIGARS, IS_NOT_WEEKEND);
		
		// assert
		Assert.assertEquals("Because only 39 cigars on a weekday is NOT enough to have a party", expected, actual);
	}
	
	@Test
	public void haveParty_shouldReturnTrue_whenYouHave41CigarsOnWeekend()
	{
		// arrange
		boolean expected = true;
		
		// act
		boolean actual = party.haveParty(FORTY_ONE_CIGARS, IS_WEEKEND);
		
		// assert
		Assert.assertEquals("Because 41 cigars on a weekend is enough to have a party", expected, actual);
	}
	
	@Test
	public void haveParty_shouldReturnFalse_whenYouHave61CigarsNotOnWeekend()
	{
		// arrange
		boolean expected = false;
		
		// act
		boolean actual = party.haveParty(SIXTY_ONE_CIGARS, IS_NOT_WEEKEND);
		
		// assert
		Assert.assertEquals("Because 61 cigars on a weekday is a little too much to have a party", expected, actual);
	}
	
	@Test
	public void haveParty_shouldReturnTrue_whenYouHave59CigarsNotOnWeekend()
	{
		// arrange
		boolean expected = true;
		
		// act
		boolean actual = party.haveParty(FIFTY_NINE_CIGARS, IS_NOT_WEEKEND);
		
		// assert
		Assert.assertEquals("Because 59 cigars on a weekday is under the max limit to have a party", expected, actual);
	}
	
	@Test
	public void haveParty_shouldReturnTrue_whenYouHave60CigarsNotOnWeekend()
	{
		// arrange
		boolean expected = true;
		
		// act
		boolean actual = party.haveParty(SIXTY_CIGARS, IS_NOT_WEEKEND);
		
		// assert
		Assert.assertEquals("Because 60 cigars on a weekday is the max limit to have a party, but no more", expected, actual);
	}
}
