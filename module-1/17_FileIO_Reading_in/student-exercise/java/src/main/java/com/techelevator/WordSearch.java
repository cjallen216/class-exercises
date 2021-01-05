package com.techelevator;

import java.io.File;
import java.util.Scanner;

public class WordSearch
{
	public static void main(String[] args)
	{
		wordSearch();
		wordsSearched();
	}

	public static void wordSearch()
	{
		String filePath = "alices_adventures_in_wonderland.txt";
		File theFile = new File(filePath);
		
//		System.out.println(theFile.toString());
//		System.out.println(theFile.getAbsolutePath());
//		System.out.println(theFile.exists());
//		System.out.println("Directory: " + theFile.isDirectory());
//		System.out.println("File: " + theFile.isFile());
		
		Scanner scanner;
		
		try
		{
			scanner = new Scanner(theFile);
			
			while (scanner.hasNextLine())
			{
				String eachLine = scanner.nextLine();
				
			}
			
		} catch (Exception e)
		{
			// TODO: handle exception
		}
	}
	
	public static String wordsSearched()
	{
		Scanner wordInput = new Scanner(System.in);
		System.out.println("What is the search word you are looking for? ");
		String wordSearch = wordInput.nextLine();
		
		return wordSearch;
	}
	
	public static String search()
	{		
		return "";
	}
}
