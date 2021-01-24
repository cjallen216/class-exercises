package com.techelevator.dao.jdbc;

import com.techelevator.dao.ReservationDAO;
import com.techelevator.model.Reservation;
import org.junit.Before;
import org.junit.Test;

import java.time.LocalDate;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class JDBCReservationDAOTests extends BaseDAOTests
{

	private ReservationDAO dao;

	@Before
	public void setup()
	{
		dao = new JDBCReservationDAO(dataSource);
	}

	@Test
	public void createReservation_Should_ReturnNewReservationId()
	{
		int reservationCreated = dao.createReservation(1, "TEST NAME", LocalDate.now().plusDays(1),
				LocalDate.now().plusDays(3));

		assertEquals(1, reservationCreated);
	}
	
	@Test
	public void getAllReservationsForNext30Days_should_returnTwentyOneNewReservations()
	{
		int expectedCount = 21; 
		
		int actual = dao.getAllReservationsForNext30Days(1).size();
		
		assertEquals("because there are 21 reservations on site 1 in the next 30 days", expectedCount, actual);		
	}

}
