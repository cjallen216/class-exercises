package com.techelevator;

public class Airplane
{
	private String planeNumber;
	private int totalFirstClassSeats;
	private int bookedFirstClassSeats;
	private int totalCoachSeats;
	private int bookedCoachSeats;
	

	public int getAvailableFirstClassSeats()
	{
		return totalFirstClassSeats - bookedFirstClassSeats;
	}
	public int getAvailableCoachSeats()
	{
		return totalCoachSeats - bookedCoachSeats;
	}
	
	public boolean reserveSeats(boolean forFirstClass, int totalNumberOfSeats)
	{
		if (forFirstClass == true)
		{
			if (totalFirstClassSeats - bookedFirstClassSeats >= totalNumberOfSeats)
			{
				bookedFirstClassSeats += totalNumberOfSeats;
				return true;
			}
			else
			{
				return false;
			}
		}
		else
		{
			if (totalCoachSeats - bookedCoachSeats >= totalNumberOfSeats)
			{
				bookedCoachSeats += totalNumberOfSeats;
				return true;
			}
			else
			{
				return false;
			}
		}
	}
	
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
	
	
	public Airplane (String inputPlaneNumber, int inputTotalFirstClassSeats, int inputTotalCoachSeats)
	{
		planeNumber = inputPlaneNumber;
		totalFirstClassSeats = inputTotalFirstClassSeats;
		totalCoachSeats = inputTotalCoachSeats;
	}
}
