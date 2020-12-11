package com.techelevator.cardexample;

public class MainProgram
{

	public static void main(String[] args)
	{
		// creating an object template
		// type variable = new 
		//String name = new String("Chris"); <- my template
		// calls the constructor
		Card myCard = new Card("Spades", 12);
		//myCard.setSuit("Spades");
		
		System.out.println(myCard.getSuit());
		System.out.println(myCard.getFaceValue());
		System.out.println(myCard.getValue());
		System.out.println(myCard.isFaceUp());
		System.out.println(myCard.getColor());
		
		System.out.println();
		System.out.println(myCard.getCardInfo());
		
		System.out.println();
		System.out.println("Flipping Card");
		myCard.flip();
		
		System.out.println();
		System.out.println(myCard.getCardInfo());
		
		System.out.println();
		System.out.println("Flipping Card");
		myCard.flip();
		
		System.out.println();
		System.out.println(myCard.getCardInfo());
	}

}
