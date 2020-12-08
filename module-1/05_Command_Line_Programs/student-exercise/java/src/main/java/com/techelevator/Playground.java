package com.techelevator;

public class Playground
{
	public static void main(String[] args)
	{
		//Scanner scanner = new Scanner(System.in);
		
		int[] fibonacciSeq = new int [] {0};
		
		int previousNumber = 0; 
		int nextNumber = 1;
		int finalNumber = 0;
		
		for (int i = 0; i < 10; i++)
		{
			System.out.println(previousNumber);
			int addToArray = fibonacciSeq[fibonacciSeq.length -1];
			finalNumber = previousNumber + nextNumber;
			previousNumber = nextNumber;
			nextNumber = finalNumber;
			
		}
	}
	
	//public static int determineFibSeq (int fibSeq)
	{
		int fibSeq1 = 0;
		
		for (int i = 0; i < 10; i++)
		{
			
		}
	}
}
