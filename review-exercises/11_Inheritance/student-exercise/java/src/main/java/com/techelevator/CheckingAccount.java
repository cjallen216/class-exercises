package com.techelevator;

public class CheckingAccount extends BankAccount
{
	public CheckingAccount (String accountHolderName, String accountNumber)
	{
		super(accountHolderName, accountNumber);
	}
	public CheckingAccount (String accountHolderName, String accountNumber, int balance)
	{
		super(accountHolderName, accountNumber, balance);
	}
	
	@Override
	public int withdraw (int amountToWithdraw)
	{
		int overdraftFee = 10;
		int minWithoutCharge = 0;
		int minWithCharge = -100;
		
		if (getBalance() - amountToWithdraw > minWithCharge)
		{
			super.withdraw(amountToWithdraw);
		}
		
		if (getBalance() > minWithCharge && getBalance() < minWithoutCharge)
		{
			super.withdraw(overdraftFee);
		}
		return getBalance();
	}
}
