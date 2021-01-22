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
		Reservation reservation = new Reservation();
		
		long reservationId = 0;
		
		String sql = "INSERT INTO reservation\r\n" + 
				"(\r\n" + 
				"        site_id\r\n" + 
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
				");";
		
		//reservation.setReservationId((int) getNextReservationId());
		
		reservation.setReservationId(0);
		
		jdbcTemplate.update(sql, siteId, name, fromDate, toDate);
		
		reservationId = reservation.getReservationId();
		
		return (int)reservationId;
	}
	
	public List<Reservation> getAllReservationsForNext30Days()
	{
		List<Reservation> reservations = new ArrayList<Reservation>();
		
		String sql = "SELECT reservation_id\r\n" + 
				"        , site_id\r\n" + 
				"        , name\r\n" + 
				"        , from_date\r\n" + 
				"        , to_date\r\n" + 
				"        , create_date\r\n" + 
				"FROM reservation\r\n" + 
				"WHERE from_date BETWEEN NOW() AND NOW() + INTERVAL '30 days';";
		
		SqlRowSet rows = jdbcTemplate.queryForRowSet(sql);
		
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
	
	private long getNextReservationId()
	{
		SqlRowSet nextIdResult = jdbcTemplate.queryForRowSet("SELECT nextval('reservation_reservation_id_seq')");
		
		if(nextIdResult.next())
		{
			return nextIdResult.getLong(1);
		}
		else
		{
			throw new RuntimeException("Something went wrong while getting an id for the new reservation");
		}
	}

}
