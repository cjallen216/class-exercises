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
	public int withdraw (int amountToWithdraw)
	{
		int serviceCharge = 2;
		int noChargeMin = 150;
		
		if (getBalance() >= amountToWithdraw)
		{
			super.withdraw(amountToWithdraw);
		}
		
		if (getBalance() < noChargeMin && getBalance() >= amountToWithdraw)
		{
			super.withdraw(serviceCharge);
		}
		return getBalance();
	}
}
