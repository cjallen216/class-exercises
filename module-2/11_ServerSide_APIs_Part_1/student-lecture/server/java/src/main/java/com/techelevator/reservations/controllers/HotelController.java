package com.techelevator.reservations.controllers;

import com.techelevator.reservations.dao.HotelDAO;
import com.techelevator.reservations.dao.MemoryHotelDAO;
import com.techelevator.reservations.dao.MemoryReservationDAO;
import com.techelevator.reservations.dao.ReservationDAO;
import com.techelevator.reservations.models.Hotel;
import com.techelevator.reservations.models.HotelFilters;
import com.techelevator.reservations.models.Reservation;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class HotelController
{

	private HotelDAO hotelDAO;
	private ReservationDAO reservationDAO;

	public HotelController()
	{
		this.hotelDAO = new MemoryHotelDAO();
		this.reservationDAO = new MemoryReservationDAO(hotelDAO);
	}

	/**
	 * Return All Hotels
	 *
	 * @return a list of all hotels in the system
	 */
	
	@RequestMapping(path = "/hotels", method = RequestMethod.GET)
	public List<Hotel> list(
			//@RequestParam(value = "name_like", defaultValue = "") String name
			//,
			@RequestParam(value = "cost_gte", defaultValue = "0") double costPerNight
			)
	{
		List<Hotel> hotels = hotelDAO.list();
		//hotels = HotelFilters.filterByName(hotels, name);
		hotels = HotelFilters.filterByCost(hotels, costPerNight);
		
		return hotels;
	}

	/**
	 * Return hotel information
	 *
	 * @param id the id of the hotel
	 * @return all info for a given hotel
	 */
	
	@RequestMapping(path = "/hotels/{id}", method = RequestMethod.GET)
	public Hotel get(@PathVariable int id)
	{
		return hotelDAO.get(id);
	}

	// @RequestParam looks in the queryString
	// use for flexibility
	@RequestMapping(path = "/hotels/getbyid", method = RequestMethod.GET)
	public Hotel getById(@RequestParam int hotelId)
	{
		return hotelDAO.get(hotelId);
	}
	
	@RequestMapping(path = "/hotels", method = RequestMethod.POST)
	public void insert(@RequestBody Hotel hotel)
	{
		hotelDAO.create(hotel);
	}

}