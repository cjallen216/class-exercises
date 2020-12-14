package com.techelevator;

public class SavingsAccount extends BankAccount
{
	public SavingsAccount (String accountHolderName, String accountNumber, int balance)
	{
		super(accountHolderName, accountNumber, balance);
	}
	
	@Override
	public int withdraw (int amountToWithDraw)
	{
		return amountToWithDraw;
	}
}
