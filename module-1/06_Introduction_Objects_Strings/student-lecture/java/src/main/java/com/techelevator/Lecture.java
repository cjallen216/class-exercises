package com.techelevator;

import java.util.Scanner;

public class Lecture {

	public static void main(String[] args) {

		System.out.println("************************************");
		System.out.println("****** MAKING A STRING OBJECT ******");
		System.out.println("************************************");

		/* The String class gets special treatment in the Java language.  One
		 * example of this is that there is a literal representation of a
		 * String (i.e. characters appearing between two double quotes.  This
		 * is not the case for most classes */

		/* create an new instance of String using a literal */
		
		String name = "Chris Allen";

		
		System.out.println();
		System.out.println("******************************");
		System.out.println("****** MEMBER METHODS ******");
		System.out.println("******************************");
		System.out.println();
		
		String firstNameString = name.substring(0,5);
		System.out.println(firstNameString);
		
		String lastNameString = name.substring(6);
		System.out.println(lastNameString);
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter your first and last name: ");
		
		name = scanner.nextLine();
		System.out.println("Full Name: " + name);
		
		int index = name.indexOf(" ");
		System.out.println("Space found at " + index);
		
		firstNameString = name.substring(0, index);
		System.out.println("First Name: " + firstNameString);
		
		lastNameString = name.substring(index + 1);
		System.out.println("Last Name: " + lastNameString);
		
		
		


		/* Other commonly used methods:
		 *
		 * endsWith
		 * startsWith
		 * indexOf
		 * lastIndexOf
		 * length
		 * substring
		 * toLowerCase
		 * toUpperCase
		 * trim
		 */

//		System.out.println();
//		System.out.println("**********************");
//		System.out.println("****** EQUALITY ******");
//		System.out.println("**********************");
//		System.out.println();
//
//
//
//		/* Double equals will compare to see if the two variables, hello1 and
//		 * hello2 point to the same object in memory. Are they the same object? */
//		if (hello1 == hello2) {
//			System.out.println("They are equal!");
//		} else {
//			System.out.println(hello1 + " is not equal to " + hello2);
//		}
//
//		String hello3 = hello1;
//		if (hello1 == hello3) {
//			System.out.println("hello1 is the same reference as hello3");
//		}
//
//		/* So, to compare the values of two objects, we need to use the equals method.
//		 * Every object type has an equals method */
//		if (hello1.equals(hello2)) {
//			System.out.println("They are equal!");
//		} else {
//			System.out.println(hello1 + " is not equal to " + hello2);
//		}

	}
}
