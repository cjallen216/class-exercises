package com.techelevator;

import java.awt.List;
import java.io.File;
import java.io.PrintStream;
import java.util.Scanner;

public class ReadAndWrite
{
	public static void main(String[] args)
    {
        Scanner userInput = new Scanner(System.in);

        String fileName = "files/names.txt";
        File file;

        file = new File(fileName);
        
        createFile(file, "files/name_length.txt");
        
        System.out.println("completed");
    }

	public static void createFile(File file, String newFileName)
	{
		File outFile = new File(newFileName);
		
		try (
				Scanner inStream = new Scanner(file);
				PrintStream outStream = new PrintStream(outFile);
				
				)
		{
			while (inStream.hasNextLine())
			{
				String name = inStream.nextLine();
				int length = name.length();
				
				outStream.println(name + " " + length);
				
			}
		} catch (Exception e)
		{
			// TODO: handle exception
		}
	}
	
	public static void sortNames(File file, String newFileName)
	{
		File outFile = new File(newFileName);
		
		try (
				Scanner inStream = new Scanner(file);
				PrintStream outStream = new PrintStream(outFile);
				
				)
		{
			
			
			while (inStream.hasNextLine())
			{
				String name = inStream.nextLine();
				int length = name.length();
				
				outStream.println(name + " " + length);
				
			}
		} catch (Exception e)
		{
			// TODO: handle exception
		}
	}

}
