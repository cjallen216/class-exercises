package com.techelevator;

import java.util.jar.Attributes.Name;

public class RectangleWall extends Wall
{
	private int length;
	private int height;
	
	public RectangleWall (String name, String color, int length, int height)
	{
		super(name, color);
		this.length = length;
		this.height = height;
	}

	public RectangleWall (String name, String color, int length)
	{
		super(name, color);
		this.length = length;
	}
	
	public RectangleWall (String name, String color)
	{
		super(name, color);
	}
	
	public int getArea()
	{
		return length * height;
	}
	
	public Integer getLength()
	{
		return length;
	}
	public Integer getHeight()
	{
		return height;
	}
	
	public String toString()
	{
		return super.getName() +" (" + length +  "x" +  height + ") rectangle";
	}
}