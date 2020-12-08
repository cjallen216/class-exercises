package com.techelevator;

public class Playground
{
	public static void main(String[] args)
	{
		String name1 = new String("Chris");
		String name2 = new String("Chris");
		
		boolean areEqual = name1 == name2;
		
		System.out.println("name1 == name2: " + areEqual);
		
		boolean haveSameValue = name1.equals(name2);
		System.out.println("name1.equals(name2): " + haveSameValue);
		
		int [] numbers = new int[] {1,2,3,4,5};
		
		int first = numbers[0];
		char firstLetter = name1.charAt(0);
		
		for (int i = 0; i < name1.length(); i++)
		{
			System.out.println(name1.charAt(i));
		}
		
		// String are immutable - they cannot change
		
		name1 += " ";
		System.out.println(name1);
		
		
	}
}
