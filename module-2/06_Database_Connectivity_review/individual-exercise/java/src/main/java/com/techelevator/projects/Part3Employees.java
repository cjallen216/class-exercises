package com.techelevator.projects;

import java.time.LocalDate;

import org.apache.commons.dbcp2.BasicDataSource;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;

public class Part3Employees
{
    JdbcTemplate jdbcTemplate;

    public Part3Employees()
    {
        BasicDataSource dataSource = new BasicDataSource();
		dataSource.setUrl("jdbc:postgresql://localhost:5432/projects");
		dataSource.setUsername("postgres");
        dataSource.setPassword("postgres1");
        
        jdbcTemplate = new JdbcTemplate(dataSource);
    }

    public void run()
    {       

    	// *********************************
        // Part 3 - Working with employees
    	// *********************************
    	
    	// 3.1 - add all departments to the database
    	System.out.println("*** 3.1 Adding employees ***\n");        
        // TODO: add all employees
        addEmployee(1, null, "Fredrick", "Keppard", LocalDate.parse("1953-07-15"), "M", LocalDate.parse("2001-04-01"));
        addEmployee(2, 1, "Flo", "Henderson", LocalDate.parse("1990-12-28"), "F", LocalDate.parse("2011-08-01"));
        addEmployee(3, 2, "Franklin", "Trumbauer", LocalDate.parse("1980-07-14"), "M", LocalDate.parse("1998-09-01"));
        addEmployee(4, 2, "Delora", "Coty", LocalDate.parse("1976-07-04"), "F", LocalDate.parse("2009-03-01"));
        addEmployee(5, 2, "Sid", "Goodman", LocalDate.parse("1972-06-04"), "M", LocalDate.parse("1998-09-01"));
        addEmployee(6, 3, "Mary Lou", "Wolinski", LocalDate.parse("1983-04-08"), "F", LocalDate.parse("2012-04-01"));
        addEmployee(7, 3, "Jammie", "Mohl", LocalDate.parse("1987-11-11"), "M", LocalDate.parse("2013-07-01"));
        addEmployee(8, 3, "Neville", "Zellers", LocalDate.parse("1983-04-04"), "M", LocalDate.parse("2013-07-01"));
        addEmployee(9, 3, "Meg", "Buskirk", LocalDate.parse("1987-05-13"), "F", LocalDate.parse("2007-11-01"));
        addEmployee(10, 3, "Matthew", "Duford", LocalDate.parse("1968-04-05"), "M", LocalDate.parse("2016-02-16"));
        addEmployee(11, 4, "Jarred", "Lukach", LocalDate.parse("1981-09-25"), "M", LocalDate.parse("2003-05-01"));
        addEmployee(12, 4, "Gabreila", "Christie", LocalDate.parse("1980-03-17"), "F", LocalDate.parse("1999-08-01"));
        addEmployee(41, 1, "Christopher", "Allen", LocalDate.parse("1980-01-01"), "M", LocalDate.parse("2000-01-01"));
        // add the rest
        // add some of your own
        
                
        // 3.2 - select all departments from the database
        System.out.println("\n*** 3.2 Get all employees ***\n");
        getAllEmployees();
        
        
        // 3.3 - find a department by id
        System.out.println("\n*** 3.3 Get employee by Id ***\n");
        //TODO: search for employees by id - try several ids - even some that don't exist
        getEmployeeById(7);
        getEmployeeById(3);
        getEmployeeById(41);
        getEmployeeById(2);
        
        
        // 3.4 - search for department by name
        System.out.println("\n*** 3.4 Search for employee by name ***\n");
        searchForEmployeeByName("frank", "");
        searchForEmployeeByName("bob", "");
        searchForEmployeeByName("", "smith");
        searchForEmployeeByName("flo", "h");
        // try some other names - make sure your search works
        
        
        // 3.5
        System.out.println("\n*** 3.5 Change employee data (UPDATE)***\n");
        //TODO: try changing the name, hireDate or any other bit of employee information
        //updateEmployee(employeeId, departmentId, firstName, lastName, birthDate, gender, hireDate);
        updateEmployee(41, 3, "Chris", "Allen", LocalDate.parse("1980-05-05"), "M", LocalDate.parse("1999-05-05"));
        //TODO: verify that the update worked
        //getEmployeeById(employeeId);
        getEmployeeById(41);

        
        // 3.6
        System.out.println("\n*** 3.6 Delete an employee***\n");
        //deleteEmployee(employeeId);
        deleteEmployee(41);
        //verify that the delete worked
        //getEmployeeById(employeeId);
        getEmployeeById(41);
    	
    }
    
    private void addEmployee(int employeeId, Integer departmentId, String firstName, String lastName, LocalDate birthDate, String gender, LocalDate hireDate)
    {
    	try
		{
			// build the SQL INSERT statement (hint: do it in DBVisualizer first)
    		String sql = "INSERT INTO employee\r\n" + 
    				"(\r\n" + 
    				"        employee_id\r\n" + 
    				"        , department_id\r\n" + 
    				"        , first_name\r\n" + 
    				"        , last_name\r\n" + 
    				"        , birth_date\r\n" + 
    				"        , gender\r\n" + 
    				"        , hire_date\r\n" + 
    				")\r\n" + 
    				"VALUES\r\n" + 
    				"(\r\n" + 
    				"        ?\r\n" + 
    				"        , ?\r\n" + 
    				"        , ?\r\n" + 
    				"        , ?\r\n" + 
    				"        , ?\r\n" + 
    				"        , ?\r\n" + 
    				"        , ?\r\n" + 
    				");";
    		
    		// use jdbcTemplate to execute the statement
    		jdbcTemplate.update(sql
    				, employeeId
    				, departmentId
    				, firstName
    				, lastName
    				, birthDate
    				, gender
    				, hireDate); // make sure that you add the remaining employee variables as parameters
		} 
    	catch (Exception e)
		{
			System.err.println("There was an error inserting employee: " + employeeId);
		}
    }
    
    private void getAllEmployees()
    {
    	try
		{
			// build the SQL SELECT statement (hint: do it in DBVisualizer first)
    		String sql = "SELECT employee_id\r\n" + 
    				"        , department_id\r\n" + 
    				"        , first_name\r\n" + 
    				"        , last_name\r\n" + 
    				"        , birth_date\r\n" + 
    				"        , gender\r\n" + 
    				"        , hire_date\r\n" + 
    				"FROM employee;";
    		
    		// use jdbcTemplate to execute the query - it returns a SqlRowSet
    		SqlRowSet rows = jdbcTemplate.queryForRowSet(sql);
    		
    		// loop through the rows
    		while(rows.next())
    		{
    			// get the values from the columns
    			int employeeId = rows.getInt("employee_id");
    			int departmentId = rows.getInt("department_id");
    			String firstName = rows.getString("first_name");
    			String lastName = rows.getString("last_name");
    			LocalDate birthDate = rows.getDate("birth_date").toLocalDate();
    			String gender = rows.getString("birth_date");
    			LocalDate hireDate = rows.getDate("hire_date").toLocalDate();
    			// get all the other employee information
    			
    			// print the employee information
    			System.out.println("Employee ID: " + employeeId + ", Department ID: " + departmentId + ", Name: " + firstName + " " + lastName + ", birthdate: " + birthDate + ", gender: " + gender + ", hire date: " + hireDate);
    		}
    		
		} 
    	catch (Exception e)
		{
			System.err.println("There was an error selecting all employees: " + e.getMessage());
		}
    }

    private void getEmployeeById(int employeeId)
    {
    	try
		{
			// build the SQL SELECT statement (hint: do it in DBVisualizer first)
    		String sql = "SELECT employee_id\r\n" + 
    				"        , first_name\r\n" + 
    				"        , last_name\r\n" + 
    				"FROM employee\r\n" + 
    				"WHERE employee_id = ?;";
    		
    		// use jdbcTemplate to execute the query - it returns a SqlRowSet
    		SqlRowSet rows = jdbcTemplate.queryForRowSet(sql, employeeId);
    		
    		// check for an employee
    		if(rows.next())
    		{
    			// get the values from the columns
    			String employeeFirstName = rows.getString("first_name");
    			String employeeLastName = rows.getString("last_name");
    			// print the employee information
    			System.out.println(employeeId + ": " + employeeFirstName + " " + employeeLastName);
    		}
    		else 
    		{
				System.err.println("There is no employee with id: " + employeeId);
			}
    		
		} 
    	catch (Exception e)
		{
			System.err.println("There was an error selecting all employees: " + e.getMessage());
		}
    }

    private void searchForEmployeeByName(String firstName, String lastName)
    {
    	try
		{
			// build the SQL SELECT statement (hint: do it in DBVisualizer first)
    		String sql = "SELECT employee_id\r\n" + 
    				"        , first_name\r\n" + 
    				"        , last_name\r\n" + 
    				"FROM employee\r\n" + 
    				"WHERE first_name ILIKE ?\r\n" + 
    				"        AND last_name ILIKE ?;";
    		
    		// use jdbcTemplate to execute the query - it returns a SqlRowSet
    		SqlRowSet rows = jdbcTemplate.queryForRowSet(sql, firstName, lastName);
    		
    		// loop through the rows
    		while(rows.next())
    		{
    			// get the values from the columns
    			int employeeId = rows.getInt("employee_id");
    			String employeeFirstName = rows.getString("first_name");
    			String employeeLastName = rows.getString("last_name");
    			// get all the other employee information
    			
    			// print the employee information
    			System.out.println(employeeId + ": " + employeeFirstName + " " + employeeLastName);
    		}
    		
		} 
    	catch (Exception e)
		{
			System.err.println("There was an error searching for employee by name:\n " + e.getMessage());
		}
    }

    private void updateEmployee(int employeeId, Integer departmentId, String firstName, String lastName, LocalDate birthDate, String gender, LocalDate hireDate)
    {
    	try
		{
			// build the SQL INSERT statement (hint: do it in DBVisualizer first)
    		String sql = "UPDATE employee\r\n" + 
    				"SET department_id = ?\r\n" + 
    				"        , first_name = ?\r\n" + 
    				"        , last_name = ?\r\n" + 
    				"        , birth_date = ?\r\n" + 
    				"        , gender = ?\r\n" + 
    				"        , hire_date = ?\r\n" + 
    				"WHERE employee_id = ?;";
    		
    		// use jdbcTemplate to execute the statement
    		jdbcTemplate.update(sql
			    				, departmentId
			    				, firstName
			    				, lastName
			    				, birthDate
			    				, gender
			    				, hireDate
			    				, employeeId); // make sure that you add the remaining employee variables as parameters
		} 
    	catch (Exception e)
		{
			System.err.println("There was an error updating employee: " + employeeId);
		}
    }

    private void deleteEmployee(int employeeId)
    {
    	try
		{
			// build the SQL SELECT statement (hint: do it in DBVisualizer first)
    		String sql = "DELETE FROM employee\r\n" + 
    				"WHERE employee_id = ?;";
    		
    		// use jdbcTemplate to execute the query - it returns a SqlRowSet
    		jdbcTemplate.update(sql, employeeId);
    		    		
		} 
    	catch (Exception e)
		{
			System.err.println("There was an error deleting employee: " + employeeId);
		}
    }


}
