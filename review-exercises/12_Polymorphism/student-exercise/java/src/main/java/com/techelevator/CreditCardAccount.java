package com.techelevator;

public class CreditCardAccount implements Accountable
{
	private String accountHolder;
	private String accountNumber;
	private int debt = 0;
	
	public CreditCardAccount (String accountHolder, String accountNumber)
	{
		this.accountHolder = accountHolder;
		this.accountNumber = accountNumber;
	}
	
	public int getBalance()
	{
		return -debt;
	}
	
	public String getAccountHolder()
	{
		return accountHolder;
	}
	public String getAccountNumber()
	{
		return accountNumber;
	}
	public int getDebt()
	{
		return debt;
	}
	
	public int pay (int amountToPay)
	{
		debt -= amountToPay;
		return amountToPay;
	}
	
	public int charge (int amountToCharge)
	{
		debt += amountToCharge;
		return amountToCharge;
	}
}
