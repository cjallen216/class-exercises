package com.techelevator.auctions.controller;

import com.techelevator.auctions.DAO.AuctionDAO;
import com.techelevator.auctions.DAO.MemoryAuctionDAO;
import com.techelevator.auctions.model.Auction;
import com.techelevator.auctions.model.AuctionFilters;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/auctions")
public class AuctionController {

    private AuctionDAO dao;

    public AuctionController() {
        this.dao = new MemoryAuctionDAO();
    }
    
    @RequestMapping (method = RequestMethod.GET)
    public List<Auction> list(
    		@RequestParam (value = "title_like", defaultValue = "") String name
    		, @RequestParam (value = "currentBid_lte", defaultValue = "0") double currentBid 
    		)
    {
    	List<Auction> auctions = dao.list();
    	auctions = AuctionFilters.filterByTitle(auctions, name);
    	auctions = AuctionFilters.filterByPrice(auctions, currentBid);
    	
    	return auctions;
    }
    
    @RequestMapping (path = "{id}", method = RequestMethod.GET)
    public Auction get(@PathVariable int id)
    {
    	return dao.get(id);
    }
    
    @RequestMapping (path = "", method = RequestMethod.POST)
    public void create(@RequestBody Auction auction)
    {
    	dao.create(auction);
    }
    
    

}
