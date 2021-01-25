package com.techelevator.dao.jdbc;

import com.techelevator.dao.ReservationDAO;
import com.techelevator.model.Reservation;
import org.junit.Before;
import org.junit.Test;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;

import java.time.LocalDate;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

public class JDBCReservationDAOTests extends BaseDAOTests
{

	private ReservationDAO dao;
	private JdbcTemplate jdbcTemplate;

	@Before
	public void setup()
	{
		dao = new JDBCReservationDAO(dataSource);
		jdbcTemplate = new JdbcTemplate(dataSource);
	}

	@Test
	public void createReservation_Should_ReturnNewReservationId()
	{
		// arrange
		int siteId = 1;
		String name = "TEST NAME";
		LocalDate startDate = LocalDate.now().plusDays(1);
		LocalDate endDate = LocalDate.now().plusDays(3);
		
		String verifySql = "SELECT *"
				+ "FROM reservation"
				+ "WHERE reservation_id = ?;" ;
		
		// act - I'm testing an insert into the database
		int newReservationId = dao.createReservation(siteId, name, startDate, endDate);
		
		// assert
		SqlRowSet rows = jdbcTemplate.queryForRowSet(verifySql, newReservationId);
		
		if (rows.next())
		{
			String actualName = rows.getString("name");
			assertEquals("because teh name in the database should match what I inserted.", name, actualName);
		}
		else
		{
			fail("no row with id " + newReservationId + "was found");
		}
	}
	
	@Test
	public void getAllReservationsForNext30Days_should_returnTwentyOneNewReservations()
	{
		int expectedCount = 21; 
		
		int actual = dao.getAllReservationsForNext30Days(1).size();
		
		assertEquals("because there are 21 reservations on site 1 in the next 30 days", expectedCount, actual);		
	}

}
