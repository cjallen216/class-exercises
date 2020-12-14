package com.techelevator;

public class CheckingAccount extends BankAccount
{
	public CheckingAccount(String accountHolderName, String accountNumber, int balance)
	{
		super(accountHolderName, accountNumber, balance);
	}
	
	@Override
	public int withdraw (int amountToWithDraw)
	{
		return amountToWithDraw;
	}
}