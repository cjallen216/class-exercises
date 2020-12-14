package com.techelevator;

public class CheckingAccount extends BankAccount
{
	public CheckingAccount(String accountHolderName, String accountNumber)
	{
		super(accountHolderName, accountNumber);
	}
	
	public CheckingAccount(String accountHolderName, String accountNumber, int balance)
	{
		super(accountHolderName, accountNumber, balance);
	}
	
	@Override
	public int withdraw (int amountToWithDraw)
	{
		if (getBalance() < 10000)
		{
			int newBalance = getBalance() - amountToWithDraw - 1000;
			newBalance = getBalance();
			return getBalance();
		}
		else
		{
			int newBalance = getBalance() - amountToWithDraw;
			newBalance = getBalance();
			return getBalance();
		}
		
	}
}
