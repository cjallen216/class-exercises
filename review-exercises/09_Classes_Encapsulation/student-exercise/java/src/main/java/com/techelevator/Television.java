package com.techelevator;

public class Television
{
	private boolean isOn;
	private int currentChannel;
	private int currentVolume;
	
	public boolean isOn()
	{
		return isOn;
	}
	public int getCurrentChannel()
	{
		if (isOn)
		{
			return currentChannel;
		}
		return 3;
	}
	public int getCurrentVolume()
	{
		if(isOn)
		{
			return currentVolume;
		}
		return 2;
	}
	public void turnOff()
	{
		isOn = !isOn;
	}
	public void turnOn()
	{
		isOn = !isOn;
		currentChannel = 3;
		currentVolume = 2;
	}
	public void changeChannel(int newChannel)
	{
		if (newChannel > 3 && newChannel < 18)
		{
			currentChannel = newChannel;
		}
	}
	public void channelUp()
	{
		if (isOn && currentChannel < 18)
		{
			currentChannel++;
		}
		else
		{
			currentChannel = 3;
		}
		
	}
	public void channelDown()
	{
		if (isOn && currentChannel > 3)
		{
			currentChannel--;
		}
		else
		{
			currentChannel = 18;
		}
	}
	public void raiseVolume()
	{
		if (isOn && currentVolume <= 10)
		{
			currentVolume++;
		}
	}
	public void lowerVolume()
	{
		if (isOn && currentVolume > 0)
		{
			currentVolume--;
		}
	}
}
