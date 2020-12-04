package com.techelevator;

public class Demo {

	public static void main(String[] args) {
		
		int counter = 0;
		
		while (counter < 5)
		{
			System.out.println(counter);
			
//			counter = counter + 1;
//			counter += 1;
			counter++;
		}
		
		for (int count = 0; count < 5; count ++)
		{
			System.out.println(count);
		}
		
		System.out.println("end of program");

	}

	public static void intoToArrays() {
		
//		
//		int score1 = 99;
//		int score2 = 87;
//		int score3 = 92;
//		
//		// average
//		int averageScore = (score1 + score2 + score3)/ 3;
//		
		int[] scores;
		scores = new int[3];
		
		scores[0] = 99;
		scores[1] = 87;
		scores[2] = 92;
		
		//print the second score
		System.out.println(scores[1]);
		
		//print how many scores
		System.out.println(scores.length);
		
		int sum = 0;
		//print all scores
		for (int i = 0; i < scores.length; i++)
		{
			sum += scores[i];
			System.out.println(scores[i]);
		}
		
		
	}
}
