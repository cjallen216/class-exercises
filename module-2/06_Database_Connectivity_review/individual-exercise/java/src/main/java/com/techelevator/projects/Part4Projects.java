package com.techelevator.projects;

import java.time.LocalDate;

import org.apache.commons.dbcp2.BasicDataSource;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;

public class Part4Projects
{
    JdbcTemplate jdbcTemplate;

    public Part4Projects()
    {
        BasicDataSource dataSource = new BasicDataSource();
		dataSource.setUrl("jdbc:postgresql://localhost:5432/projects");
		dataSource.setUsername("postgres");
        dataSource.setPassword("postgres1");
        
        jdbcTemplate = new JdbcTemplate(dataSource);
    }

    public void run()
    {
        //*********************************
        //Part 4 - Working with Projects
        //*********************************
    	
    	// 4.1 - add all projects to the database
    	System.out.println("*** 4.1 Adding projects ***\n");        
        // TODO: add all projects (add all in the screen shot - and add some of your own)
    	//addProject(projectId, projectName, startDate, endDate);
    	addProject(1, "Project X", LocalDate.parse("1962-03-01"), LocalDate.parse("2003-08-31"));
    	addProject(2, "Forelorn Cupcake", null, null);
    	addProject(3, "The Never-ending Project", LocalDate.parse("1962-03-01"), null);
    	addProject(4, "Absolutely Done By", null, LocalDate.parse("2021-08-31"));
    	addProject(5, "Royal Shakespeare", LocalDate.parse("2016-03-01"), LocalDate.parse("2003-08-31"));
    	addProject(6, "Plan 9", LocalDate.parse("2015-03-01"), LocalDate.parse("2003-08-31"));
    	addProject(7, "A Pointless Project", null, LocalDate.parse("3055-01-01"));
    	
    	
        
                
        // 4.2 - select all projects from the database
        System.out.println("\n*** 4.2 Get all projects ***\n");
        //getAllProjects();
        getAllProjects();
        
        
        // 4.3 - find a project by id
        System.out.println("\n*** 4.3 Get project by Id ***\n");
        //TODO: search for project by id - try several ids - even some that don't exist
        //getProjectById(projectId);
        getProjectById(1);
        getProjectById(41);
        getProjectById(6);
        
        
        // 4.4 - search for active projects
        System.out.println("\n*** 4.4 Search for active projects ***\n");
        // TODO: get active projects
        //getAllActiveProjects();
        getAllActiveProjects();
        
        
        // 4.5
        System.out.println("\n*** 4.5 Change project data (UPDATE)***\n");
        //TODO: try changing the name, startDate or any other bit of project information
        //updateProject(projectId, projectName, startDate, endDate);
        updateProject(2, "Forelorn Cupcake", LocalDate.parse("2055-01-01"), null);
        //TODO: verify that the update worked
        //getProjectById(projectId);      
        getProjectById(2);

        
        // 4.6
        System.out.println("\n*** 4.6 Delete a project***\n");
        //deleteProject(projectId);
        //verify that the delete worked
        //getProjectById(projectId);
        deleteProject(7);
        getProjectById(7);
        
        
        

    	
    }
    
    private void addProject(int projectId, String projectName, LocalDate startDate, LocalDate endDate)
    {
    	try
		{
			String sql = "INSERT INTO project\r\n" + 
					"(\r\n" + 
					"        project_id\r\n" + 
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
			
			jdbcTemplate.update(sql, projectId, projectName, startDate, endDate);
			
			
		} catch (Exception e)
		{
			// TODO: handle exception
			System.err.println("There was an error inserting project: " + projectId);
		}
    }
    
    private void getAllProjects()
    {
    	try
		{
			String sql = "SELECT project_id\r\n" + 
					"        , name\r\n" + 
					"        , from_date\r\n" + 
					"        , to_date\r\n" + 
					"FROM project;";
			
			SqlRowSet rows = jdbcTemplate.queryForRowSet(sql);
			
			while (rows.next())
			{
				int projectId = rows.getInt("project_id");
				String name = rows.getString("name");
				LocalDate fromDate = rows.getDate("from_date").toLocalDate();
				LocalDate toDate = rows.getDate("to_date").toLocalDate();
				
				System.out.println("Project ID:" + projectId + ", Project Name: " + name + " from Date: " + fromDate + " To Date: " + toDate);
			}
			
		} catch (Exception e)
		{
			// TODO: handle exception
			System.err.println("There was an error selecting all projects: " + e.getMessage());
		}
    }

    private void getProjectById(int projectId)
    {
    	// -----------START HERE---------------
    }

    private void getAllActiveProjects()
    {
    	// Active project criteria
    	// 1 - the projects end date is after today
    	// 2 - the project has no end date
    	// DON'T worry about the start date
    }

    private void updateProject(int projectId, String projectName, LocalDate startDate, LocalDate endDate)
    {
    	
    }

    private void deleteProject(int projectId)
    {
    }


}
