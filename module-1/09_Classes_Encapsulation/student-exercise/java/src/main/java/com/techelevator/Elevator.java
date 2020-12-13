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
		if (!doorOpen && desiredFloor > currentFloor && numberOfFloors >= desiredFloor)
		{
			desiredFloor = desiredFloor - currentFloor;
		}
		else if (doorOpen)
		{
			currentFloor = desiredFloor;
		}
	}
	public void goDown(int desiredFloor)
	{
		if (!doorOpen && currentFloor < desiredFloor && desiredFloor > 0)
		{
			currentFloor -= desiredFloor;
		}
		else
		{
			currentFloor = desiredFloor;
		}
	}
	
	public Elevator (int numberOfLevels)
	{
		numberOfFloors = numberOfLevels;
		currentFloor = 1;
	}
}
