package com.techelevator;

public class Airplane
{
	private String planeNumber;
	private int totalFirstClassSeats;
	private int bookedFirstClassSeats;
	private int totalCoachSeats;
	private int bookedCoachSeats;
	
	public String getPlaneNumber()
	{
		return planeNumber;
	}
	public int getTotalFirstClassSeats()
	{
		return totalFirstClassSeats;
	}
	public int getBookedFirstClassSeats()
	{
		return bookedFirstClassSeats;
	}
	public int getTotalCoachSeats()
	{
		return totalCoachSeats;
	}
	public int getBookedCoachSeats()
	{
		return bookedCoachSeats;
	}
	public int availableFirstClassSeats()
	{
		return totalFirstClassSeats - bookedFirstClassSeats; 
	}
	public int availableCoachSeats()
	{
		return totalCoachSeats - bookedCoachSeats;
	}
	public int getAvailableFirstClassSeats()
	{
		return availableFirstClassSeats();
	}
	public int getAvailableCoachSeats()
	{
		return availableCoachSeats();
	}
	
	public boolean reserveSeats(boolean forFirstClass, int totalNumberOfSeats)
	{
		if (forFirstClass && totalNumberOfSeats > availableFirstClassSeats())
		{
			bookedFirstClassSeats += totalNumberOfSeats;
			return true;
		}
		else if (!forFirstClass && totalNumberOfSeats > availableCoachSeats())
		{
			bookedCoachSeats += totalNumberOfSeats;
			return true;
		}
		return false;
	}
	
	public Airplane (String inputPlaneNumber, int inputTotalFirstClassSeats, int inputTotalCoachSeats)
	{
		planeNumber = inputPlaneNumber;
		totalFirstClassSeats = inputTotalFirstClassSeats;
		totalCoachSeats = inputTotalCoachSeats;
	}
}
