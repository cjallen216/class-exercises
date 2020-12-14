package com.techelevator.cardexample;

import java.util.ArrayList;
import java.util.List;

public class Program
{
	public static void main(String[] args)
	{
		String card1Suit = "Spades";
		int card1Value = 14;
		String card1FaceValue = "Ace";
		boolean card1IsFaceUp = false;
		String card1Color = "Black";
		
		card1IsFaceUp = !card1IsFaceUp;
		
		if (card1IsFaceUp)
		{
			//String message = card1FaceValue + " of " + card1Suit;
			
			String message = String.format("%s of %s", card1FaceValue, card1Suit);
			System.out.println(message);
		}
		else
		{
			System.out.println("##");
		}
		
		Card card1 = new Card("Spades", 14);
		card1.flip();
		System.out.println(card1.getCardFace());
		
//		List<String> cardSuit = new ArrayList<String>();
//		List<Integer> cardValues = new ArrayList<Integer>();
//		List<String> cardFaceValue = new ArrayList<String>();
//		List<Boolean> cardsAreFaceUp = new ArrayList<Boolean>();
//		List<String> cardColors = new ArrayList<String>();
//		
		
		
	}
}
