package com.techelevator.auctions.model;

import java.util.ArrayList;
import java.util.List;

public class AuctionFilters
{
	public static List<Auction> filterByTitle(List<Auction> auctions, String name)
	{
		List<Auction> filteredList = new ArrayList<Auction>();
		
		for (Auction auction : auctions)
		{
			if (auction.getTitle().toLowerCase().contains(name.toLowerCase()))
			{
				filteredList.add(auction);
			}
		}
		
		return filteredList;
	}
	
	public static List<Auction> filterByPrice(List<Auction> auctions, double currentBid)
	{
		List<Auction> filteredList = new ArrayList<Auction>();
		
		for (Auction auction : auctions)
		{
			if (auction.getCurrentBid() <= currentBid)
			{
				filteredList.add(auction);
			}
		}
		
		return filteredList;
	}
	
	public static List<Auction> filterByTitleAndPrice(List<Auction> auctions, String name, double currentBid)
	{
		List<Auction> filteredList = new ArrayList<Auction>();
		
		for (Auction auction : auctions)
		{
			if (auction.getTitle().toLowerCase().contains(name))
			{
				filteredList.add(auction);
			}
						
			if (auction.getCurrentBid() <= currentBid)
			{
				filteredList.add(auction);
			}
			
			if (auction.getCurrentBid() <= currentBid && auction.getTitle().toLowerCase().contains(name))
			{
				filteredList.add(auction);
			}

		}
		
		return filteredList;
	}
	
	public static List<Auction> filterByTitleAndPrice2(List<Auction> auctions, String name, double currentBid)
	{
		List<Auction> filteredList = new ArrayList<Auction>();
		
		for (Auction auction : auctions)
		{
			if (auction.getCurrentBid() <= currentBid)
			{
				filteredList.add(auction);
			}
		
			if (auction.getTitle().toLowerCase().contains(name.toLowerCase()))
			{
				filteredList.add(auction);
			}
		}
		
		return filteredList;
	}
	
}
