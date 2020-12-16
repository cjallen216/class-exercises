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
	
	
	
	public void addAccount(Accountable accounts)
	{
		List<Accountable> addAccount = new ArrayList<Accountable>();		
	}
	
	public boolean isVip()
	{
//		int minVipLevel = 25000;
//		
//		if (getBalance() >= minVipLevel)
//		{
//			return true;
//		}
//		else if (getBalance() < minVipLevel)
//		{
//			return false;
//		}
		return true;
	}
	
	
	
}
