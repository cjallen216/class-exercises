package com.techelevator;

public class FruitTree
{
	private String typeOfFruit;
	private int piecesOfFruitLeft;
	
	public String getTypeOfFruit()
	{
		return typeOfFruit;
	}
	
	public int getPiecesOfFruitLeft()
	{
		return piecesOfFruitLeft;
	}
	
	public boolean pickFruit(int numberOfPiecesToRemove)
	{
		piecesOfFruitLeft =  piecesOfFruitLeft - numberOfPiecesToRemove;
		
		if (piecesOfFruitLeft < numberOfPiecesToRemove)
		{
			return true;
		}
		else
		{
			return false;	
		}
		
	}
	//constructor
	public FruitTree (String inputTypeOfFruit, int startingPiecesOfFruit)
	{
		typeOfFruit = inputTypeOfFruit;
		piecesOfFruitLeft = startingPiecesOfFruit;		
	}
}
