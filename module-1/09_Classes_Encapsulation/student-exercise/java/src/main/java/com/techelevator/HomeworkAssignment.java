package com.techelevator;

import java.util.HashMap;
import java.util.Map;

public class HomeworkAssignment
{
	private int earnedMarks;
	private int possibleMarks;
	private String submitterName;
	
	public String letterGrade()
	{
		if((earnedMarks * 100) / possibleMarks >= 90)
		{
			return "A";
		}
		else if ((earnedMarks * 100) / possibleMarks < 90 && (earnedMarks * 100) / possibleMarks >= 80)
		{
			return "B";
		}
		else if ((earnedMarks * 100) / possibleMarks < 80 && (earnedMarks * 100) / possibleMarks >= 70)
		{
			return "C";
		}
		else if ((earnedMarks * 100) / possibleMarks < 70 && (earnedMarks * 100) / possibleMarks >= 60)
		{
			return "D";
		}
		else
		{
			return "F";
		}
	}
	
	public int getEarnedMarks()
	{
		return earnedMarks;
	}
	
	public int getPossibleMarks()
	{
		return possibleMarks;
	}
	
	public String getSubmitterName()
	{
		return submitterName;
	}
	
	public String getLetterGrade()
	{
		return letterGrade();
	}
	
	public void setEarnedMarks(int newEarnMarks)
	{
		earnedMarks = newEarnMarks;
	}
	
	public HomeworkAssignment(int inputPossibleMarks, String inputSubmitterName)
	{
		possibleMarks = inputPossibleMarks;
		submitterName = inputSubmitterName;
	}
	
}
