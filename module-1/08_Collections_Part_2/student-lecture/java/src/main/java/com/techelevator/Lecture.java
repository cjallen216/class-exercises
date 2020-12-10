package com.techelevator;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.swing.KeyStroke;

public class Lecture {

	public static void main(String[] args) {

		System.out.println("####################");
		System.out.println("        MAPS");
		System.out.println("####################");
		System.out.println();
		
		
		Map<Integer, String> students = new HashMap<Integer, String>();
		students.put(1, "Robbie");
		
		// creates a Map with <K,V> <String, String)
		Map<String, String> dailySpecials = new LinkedHashMap<String, String>();
		
		// adding items to the Map
		dailySpecials.put("Monday", "Waffles");
		dailySpecials.put("Tuesday", "Pancakes");
		dailySpecials.put("Wednesday", "French Toast");
		dailySpecials.put("Thursday", "Waffles");
		dailySpecials.put("Friday", "Pancakes");
		dailySpecials.put("Saturday", "French Toast");
		dailySpecials.put("Sunday", "French Toast");
		
		
		String tuesdaySpecialString = dailySpecials.get("Tuesday");		
		System.out.println("Tuesday Special: " + tuesdaySpecialString);
		
		dailySpecials.put("Monday", "Liver");
		
		String mondaySpecialString = dailySpecials.get("Monday");
		System.out.println("Monday: " + mondaySpecialString);
		
		System.out.println();
		System.out.println();
		System.out.println("####################");
		System.out.println("        KEYS");
		System.out.println("####################");
		System.out.println();
		
		// Option 1 to get loop through all the values
		// - get the keys
		// - loop through the keys
		// -- get the values of each key
		
		// the keys of a Map are a Set
		// we can use the keySet function to get all keys
		Set<String> keys = dailySpecials.keySet();
		
		for(String key: keys)
		{
			String special = dailySpecials.get(key);
			System.out.println(key + " : " + special);
		}
		
		System.out.println();
		System.out.println();
		
		// option 2
		// -- loop through each row (key, value pair)
		// -- get the key and value from the row
		
		List<String> names = new ArrayList<String>();
		names.add("Joe");
		
		for (int i = 0; i < names.size(); i++)
		{
			String currentName = names.get(i);
		}
		
		for (String currentName: names)
		{
			
		}
		
		
		// to loop through a map - I have to use a for-each loop
		// because we don't have 
		for(Map.Entry<String, String> row : dailySpecials.entrySet())
		{
			System.out.println(row.getKey() + " --> " + row.getValue());
		}
		
		// remove some objects
		
		System.out.println();
		System.out.println();
		
		
		dailySpecials.remove("Monday");
		
		// to append:
		// get current value
		// and append new value
		// and then put it back in the Map
		
		String sundaySpecial = dailySpecials.get("Sunday");
		dailySpecials.put("Sunday", sundaySpecial + " and Waffles");
		
		
		for(Map.Entry<String, String> row : dailySpecials.entrySet())
		{
			System.out.println(row.getKey() + " --> " + row.getValue());
		}
		

	}

}
