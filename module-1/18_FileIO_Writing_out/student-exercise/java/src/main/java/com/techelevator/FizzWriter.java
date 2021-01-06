package com.techelevator;

import java.io.File;
import java.io.FileOutputStream;
import java.io.PrintStream;

public class FizzWriter
{
	public static void main(String[] args)
	{
		File file = new File("FizzBuzz.txt");
		String output;
		
		try (
			FileOutputStream fileStream = new FileOutputStream(file);
			PrintStream fileWriter = new PrintStream(fileStream);
			)
		{
			for (int i = 1; i < 301; i++)
			{
				if (i % 3 == 0 && i % 5 == 0)
				{
					output = "FizzBuzz";
				}
				else if (i % 3 == 0 || Integer.toString(i).contains("3"))
				{
					output = "Fizz";
				}
				else if (i % 5 == 0 || Integer.toString(i).contains("5"))
				{
					output = "Buzz";
				}
				else
				{
					output = Integer.toString(i);
				}
				fileWriter.println(output);
			}
		}
		catch (Exception e)
		{
			// TODO: handle exception
		}
		System.out.println(file + " has been created.");
	}

}
