package com.techelevator;

public class SavingsAccount extends BankAccount
{
	public SavingsAccount (String accountHolderName, String accountNumber)
	{
		super(accountHolderName, accountNumber);
	}
	
	public SavingsAccount (String accountHolderName, String accountNumber, int balance)
	{
		super(accountHolderName, accountNumber, balance);
	}
	
	@Override
	public int withdraw (int amountToWithDraw)
	{
		if (getBalance() < 15000)
		{
			int newBalance = getBalance() - amountToWithDraw - 200;
			newBalance = getBalance();
			return getBalance();
		}
		if (getBalance() < amountToWithDraw)
		{
			return getBalance();
		}
		
		return getBalance();
	}
}
