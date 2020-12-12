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
		return totalFirstClassSeats;
	}
	public int getAvailableCoachSeats()
	{
		return totalCoachSeats;
	}
	
	public boolean reserveSeats(boolean forFirstClass, int totalCoachSeats)
	{
		return true;
	}
	
	public Airplane (String inputPlaneNumber, int inputTotalFirstClassSeats, int inputTotalCoachSeats)
	{
		planeNumber = inputPlaneNumber;
		totalFirstClassSeats = inputTotalFirstClassSeats;
		totalCoachSeats = inputTotalCoachSeats;
	}
}
