package com.techelevator;

import java.awt.font.NumericShaper;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Lecture {

	public static void main(String[] args) {
		System.out.println("####################");
		System.out.println("       LISTS");
		System.out.println("####################");
		
		// List is comparable to an array
		int[] numbersArray = new int[5];
		List<Integer> numbers = new ArrayList<>();
		
		// int is managed on Stack
		// Java has Wrapper classes for ALL primitives
		// Integer is a wrapper for int and is managed on the Heap
				
		numbers.add(25);
		numbers.add(13);
		//numbers.add("Chris"); - this is not legal
		
		List<String> names = new ArrayList<>();
		
		names.add("Wolverine");
		names.add("Iron Man");
		names.add("Captain America");
		names.add("Deadpool");
		
		System.out.println();
		System.out.println();
		
		
		System.out.println("####################");
		System.out.println("Lists are ordered");
		System.out.println("####################");
		
		String firstNameString = names.get(0);
		System.out.println("The first hero is: " + firstNameString);
		
		//can loop through list 
		for (int i = 0; i < names.size(); i++)
		{
			System.out.println(names.get(i));
		}
		
		System.out.println();
		System.out.println();
		


		System.out.println("####################");
		System.out.println("Lists allow duplicates");
		System.out.println("####################");
		
		names.add("Wolverine");
		
		for (int i = 0; i < names.size(); i++)
		{
			System.out.println(names.get(i));
		}
		
		System.out.println();
		System.out.println();

		System.out.println("####################");
		System.out.println("Lists allow elements to be inserted in the middle");
		System.out.println("####################");
		
		names.add(3, "Hulk");
		for (int i = 0; i < names.size(); i++)
		{
			System.out.println(names.get(i));
		}
		
		System.out.println();
		System.out.println();
		
		


		System.out.println("####################");
		System.out.println("Lists allow elements to be removed by index");
		System.out.println("####################");
		
		// removes by index
		names.remove("Wolverine");
		
		//names.remove(2);
		for (int i = 0; i < names.size(); i++)
		{
			System.out.println(names.get(i));
		}
		
		System.out.println();
		System.out.println();


		System.out.println("####################");
		System.out.println("Find out if something is already in the List");
		System.out.println("####################");
		
		boolean hasWolverine = names.contains("Wolverine");
		
		System.out.println("Wolverine is in list: " + hasWolverine);
		System.out.println();
		System.out.println();
		


		System.out.println("####################");
		System.out.println("Find index of item in List");
		System.out.println("####################");
		
		// where is Wolverine?
		int wolverineIndex = names.indexOf("Wolverine");
		System.out.println("Wolverine was found at index: " + wolverineIndex);
		System.out.println();
		System.out.println();
		


		System.out.println("####################");
		System.out.println("Lists can be turned into an array");
		System.out.println("####################");
		
		// HINT: exercise will be easier
		String[] namesArray = names.toArray(new String[names.size()]);
		
		System.out.println("Looping through the array, NOT the list:");
		for (int i = 0; i < namesArray.length; i++)
		{
			System.out.println(namesArray[i]);
		}
		
		System.out.println();
		System.out.println();
		


		System.out.println("####################");
		System.out.println("Lists can be sorted");
		System.out.println("####################");
		
		names.sort(null); // ABC order is default
		for (int i = 0; i < names.size(); i++)
		{
			System.out.println(names.get(i));
		}
		
		System.out.println();
		System.out.println();


		System.out.println("####################");
		System.out.println("Lists can be reversed too");
		System.out.println("####################");
		
		// Collections is a class that has a library of common functions
		// that work with lists 
		Collections.reverse(names); //additional help functions
		for (int i = 0; i < names.size(); i++)
		{
			System.out.println(names.get(i));
		}
		
		System.out.println();
		System.out.println();


		System.out.println("####################");
		System.out.println("       FOREACH");
		System.out.println("####################");
		System.out.println();
		
		for (int i = 0; i < names.size(); i++)
		{
			String name = names.get(i);
			System.out.println(name);
		}
		// foreach loop -> for each String in the "names" list
		for (String name: names)
		{
			System.out.println(name);
		}


	}
}
