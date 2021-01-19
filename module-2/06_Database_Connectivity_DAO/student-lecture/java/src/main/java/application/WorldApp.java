package application;

import java.util.List;
import java.util.Scanner;

import org.apache.commons.dbcp2.BasicDataSource;

import com.techelevator.models.dao.JDBCCityDAO;
import com.techelevator.models.dto.City;
import com.techelevator.models.interfaces.CityDAO;

public class WorldApp
{
	CityDAO cityDAO;
	
	public WorldApp()
	{
		// create data source
		BasicDataSource worldDataSource = new BasicDataSource();
		worldDataSource.setUrl("jdbc:postgresql://localhost:5432/world");
		worldDataSource.setUsername("postgres");
		worldDataSource.setPassword("postgres1");
		
		// create the DAO based on the data source
		cityDAO = new JDBCCityDAO(worldDataSource);
	}
	
	public void run()
	{
		displayCities();
	}
	
	public void displayCities()
	{
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter a country: ");
		String country = scanner.nextLine().toUpperCase();
		
		List<City> cities = cityDAO.findCityByCountryCode(country);
		
		System.out.println("Cities in :"+ country);
		for (City city : cities)
		{
			System.out.println(city.getName());
		}
		
		
		
	}
}
