package com.techelevator;

import java.util.ArrayList;
import java.util.List;

public class BankCustomer
{
	private String name;
	private String address;
	private String phoneNumber;
	private List<Accountable> accounts = new ArrayList<Accountable>();
	
	private int getNetWorth()
	{
		int netWorth = 0;
		for (Accountable accountable : accounts)
		{
			netWorth += accountable.getBalance();
		}
		return netWorth;
	}
	
	public String getName()
	{
		return name;
	}
	public String getAddress()
	{
		return address;
	}
	public String getPhoneNumber()
	{
		return phoneNumber;
	}
	
	public void setName(String name)
	{
		this.name = name;
	}
	public void setAddress(String address)
	{
		this.address = address;
	}
	public void setPhoneNumber (String phoneNumber)
	{
		this.phoneNumber = phoneNumber;
	}
	
	public Accountable[] getAccounts()
	{
		return accounts.toArray(new Accountable[accounts.size()]);
	}
	
	public void addAccount(Accountable account)
	{
		accounts.add(account);
	}
	
	public boolean isVip()
	{
		int minVipLevel = 25000;
		
		if (getNetWorth() >= minVipLevel)
		{
			return true;
		}
		return false;
	}
	
	
	
}
