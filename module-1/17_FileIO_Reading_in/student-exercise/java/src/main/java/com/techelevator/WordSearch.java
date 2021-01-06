package com.techelevator;

import java.io.File;
import java.util.Scanner;

public class WordSearch
{
	public static void main(String[] args)
	{
		File inputFile = inputFromUser();
		String searchWord = wordToSearch();
		searchCaseSensitive (inputFile, searchWord);	
	}
	
	public static File inputFromUser()
	{
		System.out.println("What is the file that should be searched? ");
		Scanner fileInput = new Scanner(System.in);
		String fileName = fileInput.nextLine();

		File inputFile = new File(fileName);
		
		if (inputFile.exists())
		{
			return inputFile;
		}
		else
		{
			System.out.println("Your file, " + fileName + ", does not exist");
		}
		
		return inputFile;
	}
	
	public static String wordToSearch()
	{
		System.out.println("What is the search word you are looking for? ");			
		Scanner userInput = new Scanner(System.in);			
		String searchWord = userInput.nextLine();

		return searchWord;
	}
	
	public static void searchCaseSensitive(File inputFile, String searchWord)
	{
		System.out.println("Should the search be case sensitive? (Y\\N)");
		Scanner caseSensitive = new Scanner(System.in);
		String caseAnswer = caseSensitive.nextLine().toLowerCase();

		try (Scanner input = new Scanner(inputFile))
		{
			int x = 0;
			
			while (input.hasNextLine())
			{
				if (caseAnswer.equals("n"))
				{
					x++;
					String line = input.nextLine();
					
					if (line.toLowerCase().contains(searchWord.toLowerCase()))
					{
						System.out.println(x + ") " + line);
					}
				}
				else if (caseAnswer.equals("y"))
				{
					x++;
					String line = input.nextLine();
					
					if (line.contains(searchWord))
					{
						System.out.println(x + ") " + line);
					}
				}
				else
				{
					System.out.println("Not a valid option.");
					input.close();
				}
			}
		}
		catch (Exception e)
		{
			System.out.println(e.getMessage());
		}
	}
}
