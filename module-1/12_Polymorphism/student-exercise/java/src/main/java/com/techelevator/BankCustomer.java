package com.techelevator;

import java.util.ArrayList;
import java.util.List;

public class BankCustomer implements Accountable
{
	private String name;
	private String address;
	private String phoneNumber;
	
	public int getBalance()
	{
		return getBalance();
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
	
	public void addAccount(Accountable newAccount)
	{
		List<Accountable> addAccount = new ArrayList<Accountable>();		
	}
	
	public boolean isVip()
	{
//		if (getBalance() >= 25000)
//		{
//			return true;
//		}
//		else if (getBalance() < 25000)
//		{
//			return false;
//		}
		return true;
	}
	
	
	
}
