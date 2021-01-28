package com.techelevator.auctions.controller;

import com.techelevator.auctions.DAO.AuctionDAO;
import com.techelevator.auctions.DAO.MemoryAuctionDAO;
import com.techelevator.auctions.model.Auction;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/auctions")
public class AuctionController
{

	private AuctionDAO dao;

	public AuctionController()
	{
		this.dao = new MemoryAuctionDAO();
	}

	@RequestMapping(method = RequestMethod.GET)
	public List<Auction> list(
			@RequestParam(value = "title_like", defaultValue = "") String title_like
			, @RequestParam(value = "currentBid_lte", defaultValue = "0") double currentBid)
	{
		List<Auction> auctions = dao.list();
		
		if (!title_like.equals("") && currentBid > 0)
        {
        	return dao.searchByTitleAndPrice(title_like, currentBid);
        }
		
		if (!title_like.equals(""))
		{
			return dao.searchByTitle(title_like);
		}
		if (currentBid > 0)
		{
			return dao.searchByPrice(currentBid);
		}
		
		return auctions;
	}

	@RequestMapping(path = "{id}", method = RequestMethod.GET)
	public Auction get(@PathVariable int id)
	{
		return dao.get(id);
	}

	@RequestMapping(method = RequestMethod.POST)
	public Auction create(@RequestBody Auction auction)
	{
		return dao.create(auction);
	}

}
