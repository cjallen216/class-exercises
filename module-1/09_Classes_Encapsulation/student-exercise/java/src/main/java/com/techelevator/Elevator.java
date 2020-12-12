package com.techelevator;

public class Elevator
{
	private int currentFloor;
	private int numberOfFloors;
	private boolean doorOpen;
	
	public int getCurrentFloor()
	{
		return currentFloor;
	}
	public int getNumberOfFloors()
	{
		return numberOfFloors;
	}
	public boolean isDoorOpen()
	{
		return doorOpen;
	}
	
	public void openDoor()
	{
		doorOpen = !doorOpen;
	}
	
	public void closeDoor()
	{
		doorOpen = !doorOpen;
	}
	public void goUp(int desiredFloor)
	{
		if (!doorOpen && currentFloor > numberOfFloors)
		{
			desiredFloor = currentFloor + numberOfFloors;
		}
	}
	public void goDown(int desiredFloor)
	{
		if (!doorOpen && currentFloor > 1)
		{
			desiredFloor = currentFloor - numberOfFloors;
		}
	}
	
	public Elevator (int numberOfLevels)
	{
		numberOfFloors = numberOfLevels;
		currentFloor = 1;
	}
}
