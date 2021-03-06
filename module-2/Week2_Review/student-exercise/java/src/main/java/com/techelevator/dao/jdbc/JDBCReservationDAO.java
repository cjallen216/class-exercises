package com.techelevator.dao.jdbc;

import com.techelevator.dao.ReservationDAO;
import com.techelevator.model.Reservation;
import com.techelevator.model.Site;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;

import javax.sql.DataSource;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class JDBCReservationDAO implements ReservationDAO
{

	private JdbcTemplate jdbcTemplate;

	public JDBCReservationDAO(DataSource dataSource)
	{
		jdbcTemplate = new JdbcTemplate(dataSource);
	}

	@Override
	public int createReservation(int siteId, String name, LocalDate fromDate, LocalDate toDate)
	{
		int nextId = getNextReservationId();
		
		//Reservation reservation = new Reservation();
		
		//long reservationId = 0;
		
		//insert the reservation
		String sql = "INSERT INTO reservation\r\n" + 
				"(\r\n" + 
				"    reservation_id    "
				+ ", site_id\r\n" + 
				"        , name\r\n" + 
				"        , from_date\r\n" + 
				"        , to_date\r\n" + 
				")\r\n" + 
				"VALUES\r\n" + 
				"(\r\n" + 
				"        ?\r\n" + 
				"        , ?\r\n" + 
				"        , ?\r\n" +
				"        , ?\r\n" + 
				"        , ?\r\n" + 
				");";
		
		//reservation.setReservationId((int) getNextReservationId());
		
		//reservation.setReservationId(1);
		
		jdbcTemplate.update(sql, nextId, siteId, name, fromDate, toDate);
		
//		String sqlReturn = "SELECT reservation_id\r\n" + 
//				"        , site_id\r\n" + 
//				"        , name\r\n" + 
//				"        , from_date\r\n" + 
//				"        , to_date\r\n" + 
//				"        , create_date\r\n" + 
//				"FROM reservation;";
		
		//reservationId = reservation.getReservationId();
		
		//return the new reservation_id 
		return nextId;
	}
	
	@Override
	public List<Reservation> getAllReservationsForNext30Days(int parkId)
	{
		List<Reservation> reservations = new ArrayList<Reservation>();
		
		String sql = "SELECT reservation_id\r\n" + 
				"        , r.site_id\r\n" + 
				"        , r.name\r\n" + 
				"        , from_date\r\n" + 
				"        , to_date\r\n" + 
				"        , create_date\r\n" + 
				"FROM reservation AS r\r\n" + 
				"INNER JOIN site AS s\r\n" + 
				"        ON r.site_id = s.site_id\r\n" + 
				"INNER JOIN campground AS c\r\n" + 
				"        ON s.campground_id = c.campground_id\r\n" + 
				"WHERE from_date BETWEEN NOW() AND NOW() + INTERVAL '30 days'\r\n" + 
				"        AND c.park_id = ?;";
		
		SqlRowSet rows = jdbcTemplate.queryForRowSet(sql, parkId);
		
		while (rows.next())
		{
			Reservation reservation2 = mapRowToReservation(rows);
			reservations.add(reservation2);
		}
		
		return reservations;
	}

	private Reservation mapRowToReservation(SqlRowSet results)
	{
		Reservation r = new Reservation();
		r.setReservationId(results.getInt("reservation_id"));
		r.setSiteId(results.getInt("site_id"));
		r.setName(results.getString("name"));
		r.setFromDate(results.getDate("from_date").toLocalDate());
		r.setToDate(results.getDate("to_date").toLocalDate());
		r.setCreateDate(results.getDate("create_date").toLocalDate());
		return r;
	}
	
	private int getNextReservationId()
	{
		SqlRowSet nextIdResult = jdbcTemplate.queryForRowSet("SELECT nextval('reservation_reservation_id_seq') AS id;");
		
		if(nextIdResult.next())
		{
			return nextIdResult.getInt("id");
		}
		else
		{
			throw new RuntimeException("Something went wrong while getting an id for the new reservation");
		}
	}

}
