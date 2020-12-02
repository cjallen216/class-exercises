package com.techelevator;

public class Lecture {

	public static void main(String[] args) {
		
		/*
		1. Create a variable to hold an int and call it numberOfExercises.
			Then set it to 26.
		*/
		// how to declare a variable;
		// datatype variableName;
		// use camelCase for variable names;
		int numberOfExercises;
		numberOfExercises = 26;
		System.out.println("1. numberOfExercises = " + numberOfExercises);

		/*
		2. Create a variable to hold a double and call it half.
			Set it to 0.5.
		*/
		
		double half = 0.5;
		System.out.println("2. half = " + half);

		/*
		3. Create a variable to hold a String and call it name.
			Set it to "TechElevator".
		*/
		
		String name = "TechElevator";
		System.out.println("3. name = " + name);

		/*
		4. Create a variable called seasonsOfFirefly and set it to 1.
		*/
		
		byte seasonsOfFirefly = 1;
		System.out.println("4. seasonsOfFirefly = " + seasonsOfFirefly);

		/*
		5. Create a variable called myFavoriteLanguage and set it to "Java".
		*/
		
		String myFavoriteLanguage = "Java"; 
		System.out.println("5. myFavoriteLanguage = " + myFavoriteLanguage);

		/*
		6. Create a variable called pi and set it to 3.1416.
		*/
		
		double pi = 3.1416;
		System.out.println("6. pi = " + pi);

		/*
		7. Create and set a variable that holds your name.
		*/
		
		String myName = "Chris";
		System.out.println("7. myName = " + myName);

		/*
		8. Create and set a variable that holds the number of buttons on your mouse.
		*/
		
		int numberOfButtonsOnMouse = 2;
		System.out.println("8. numberOfButtonsOnMouse = " + numberOfButtonsOnMouse);

		/*
		9. Create and set a variable that holds the percentage of battery left on
		your phone.
		*/
		
		double percentBattery;
		percentBattery = .85;
		System.out.println("9. percentBattery = " + percentBattery);

		/*
		10. Create an int variable that holds the difference between 121 and 27.
		*/

		/*
		11. Create a double that holds the addition of 12.3 and 32.1.
		*/
		
		double one11 = 12.3;
		double two11 = 32.1;
		double answer11 = one11 + two11;
		System.out.println("11. 12.3 + 32.1 = " + answer11);

		/*
		12. Create a String that holds your full name.
		*/
		
		String fullName = "Chris Allen";
		System.out.println("12. Full Name = " + fullName);

		/*
		13. Create a String that holds the word "Hello, " concatenated onto your
		name from above.
		*/
		
		String helloFullName = "Hello " + fullName;
		System.out.println("13. " + helloFullName);

		/*
		14. Add a " Esquire" onto the end of your full name and save it back to
		the same variable.
		*/
		
		//fullName Chris Allen Esquire
		fullName = fullName + " Esquire";
		System.out.println("14. " + fullName);

		/*
		15. Now do the same as exercise 14, but use the += operator.
		*/
		
		fullName += " Esquire";
		System.out.println("15. " + fullName);

		/*
		16. Create a variable to hold "Saw" and add a 2 onto the end of it.
		*/
		
		String movie = "Saw";
		movie += 2;
		System.out.println("16. Movie = " + movie);

		/*
		17. Add a 0 onto the end of the variable from exercise 16.
		*/
		
		movie += 0;
		System.out.println("17. " + movie);

		/*
		18. What is 4.4 divided by 2.2?
		*/
		
		double numerator = 4.4;
		double denominator = 2.2;
		double answer = numerator / denominator;
		System.out.println("18. 4.4 / 2.2 = " + answer);

		/*
		19. What is 5.4 divided by 2?
		*/
		
		double numerator2 = 5.4;
		int denominator2 = 2;
		double answer2 = numerator2 / denominator2;
		System.out.println("19. 5.4 / 2 = " + answer2);

		/*
		20. What is 5 divided by 2?
		*/
		
		int numerator3 = 5;
		int denominator3 = 2;
		double answer3 = numerator3 / denominator3;
		System.out.println("20. 5 / 2 = " + answer3);

		/*
		21. What is 5.0 divided by 2?
		*/
		
		double numerator4 = 5.0;
		int denominator4 = 2;
		double answer4 = numerator4 / denominator4;
		System.out.println("21. 5.0 / 2 = " + answer4);

		/*
		22. What is 66.6 divided by 100? Is the answer you get right or wrong?
		*/
		
		double numberator22 = 66.6;
		int denominator22 = 100;
		double answer22 = numberator22 / denominator22;
		System.out.println("22. " + answer22);

		/*
		23. If I divide 5 by 2, what's my remainder?
		*/
		
		int one23 = 5;
		int two23 = 2;
		int remainder23 = one23 % two23; // % returns the remainder;
		System.out.println("23. 19 / 4 = " + remainder23);

		/*
		24. What is 1,000,000,000 * 3?
		*/
		
		long billion = 1000000000;
		long threeBillion = billion * 3;
		System.out.println("24. Three Billion = " + threeBillion);

		/*
		25. Create a variable that holds a boolean called doneWithExercises and
		set it to false.
		*/
		
		boolean doneWithExercises = false;

		/*
		26. Now set doneWithExercise to true.
		*/
				
		doneWithExercises = true;
		
	}

}
