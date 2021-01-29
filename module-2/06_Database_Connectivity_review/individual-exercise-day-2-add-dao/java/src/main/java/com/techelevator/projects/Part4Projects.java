package com.techelevator.projects;

import java.sql.Date;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.dbcp2.BasicDataSource;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;

import com.techelevator.projects.models.Project;
import com.techelevator.projects.models.dao.ProjectDAO;
import com.techelevator.projects.models.jdbc.JDBCProjectDAO;

public class Part4Projects
{
	ProjectDAO dao = new JDBCProjectDAO();

    public void run()
    {
        //*********************************
        //Part 4 - Working with Projects
        //*********************************
    	
    	// 4.1 - add all projects to the database
    	System.out.println("*** 4.1 Adding projects ***\n");        
        // TODO: add all projects (add all in the screen shot - and add some of your own)
    	addProject(1, "Project X", LocalDate.parse("1962-03-01"), LocalDate.parse("2003-08-31"));
    	addProject(2, "Forelorn Cupcake", null, null);
    	addProject(3, "The Never-ending Project", LocalDate.parse("2011-09-01"), null);
    	addProject(4, "Absolutely Done By", null, LocalDate.parse("2021-06-30"));
    	addProject(5, "Royal Shakespeare", LocalDate.parse("2016-10-15"), LocalDate.parse("2017-03-14"));
    	addProject(6, "Plan 9", LocalDate.parse("2015-10-01"), LocalDate.parse("2021-12-31"));
    	addProject(7, "Project: Search", LocalDate.parse("2019-08-19"), null);
    	addProject(8, "The Perfect UX", LocalDate.parse("2020-04-07"), LocalDate.parse("2021-09-23"));
    	
        
                
        // 4.2 - select all projects from the database
        System.out.println("\n*** 4.2 Get all projects ***\n");
        getAllProjects();
        
        
        // 4.3 - find a project by id
        System.out.println("\n*** 4.3 Get project by Id ***\n");
        //TODO: search for project by id - try several ids - even some that don't exist
        getProjectById(0);
        getProjectById(1);
        getProjectById(5);
        getProjectById(8);
        getProjectById(9);
        
        
        // 4.4 - search for active projects
        System.out.println("\n*** 4.4 Search for active projects ***\n");
        // TODO: get active projects
        getAllActiveProjects();
        
        
        // 4.5
        System.out.println("\n*** 4.5 Change project data (UPDATE)***\n");
        //TODO: try changing the name, startDate or any other bit of project information
        // added end date to  "Project: Search"
        updateProject(7, "Project: Search", LocalDate.parse("2019-08-19"), LocalDate.parse("2021-12-20"));
        //TODO: verify that the update worked
        getProjectById(7);      

        
        // 4.6
        System.out.println("\n*** 4.6 Delete a project***\n");
        deleteProject(8);
        //verify that the delete worked
        getProjectById(8);  

    }
    
    private void addProject(int id, String name, LocalDate startDate, LocalDate endDate)
    {
    	
    	try
		{
    		//TODO create a Project from the input parameters
    		Project project = new Project(id, name,startDate,endDate);
    		//TODO: use the dao to insert the project
    		dao.addProject(project);
    		//System.out.println("Everything added correctly");
    		
		} 
    	catch (Exception e)
		{
			System.err.println("There was an error inserting project: " + id);
			System.err.println(e.getMessage());
			System.out.println();
		}
    	
    }
    
    private void getAllProjects()
    {
    	try
		{
			//TODO: use the DAO to get all projects
    		List<Project> projects = dao.getAllProjects();
    		//TODO: loop through the list of projects and display the details of each
    		for (Project project : projects)
			{
				System.out.println(project.getId() + ": " + project.getName());
			}
    		
		} 
    	catch (Exception e)
		{
			System.err.println("There was an error getting all projects");
			System.err.println(e.getMessage());
			System.out.println();
		}
    }

    private void getProjectById(int id)
    {
    	try
		{
			//TODO: use the DAO to get project by id
    		Project project = dao.getProject(id);
    		//TODO: display the details of the selected project
    		if (project != null)
    		{
    			System.out.println(project.getId() + ": " + project.getName());
    		}
    		
		} 
    	catch (Exception e)
		{
			System.err.println("There was an error getting project: " + id);
			System.err.println(e.getMessage());
			System.out.println();
		}
    }

    private void getAllActiveProjects()
    {
    	try
		{
			//TODO: use the DAO to get all projects
    		List<Project> projects = dao.getActiveProjects();
    		
    		//TODO: loop through the list of projects and display the details of each
    		for (Project project : projects)
			{
				System.out.println(project.getId() + ": " + project.getName());
			}
		} 
    	catch (Exception e)
		{
			System.err.println("There was an error getting active projects");
			System.err.println(e.getMessage());
			System.out.println();
		}
    }

    private void updateProject(int id, String name, LocalDate startDate, LocalDate endDate)
    {
    	try
		{
    		//TODO: create a project from the input parameters
    		Project project = new Project(id, name, startDate, endDate);
    		//TODO: use the DAO to update the project
    		dao.updateProject(id, project);
			
		} 
    	catch (Exception e)
		{
			System.err.println("There was an error updating project: " + id);
			System.err.println(e.getMessage());
			System.out.println();
		}
    }

    private void deleteProject(int id)
    {
    	try
		{
    		//TODO: use the DAO to delete the project
    		dao.deleteProject(id);
    		//System.out.println("Everything ran correctly");
			
		} 
    	catch (Exception e)
		{
			System.err.println("There was an error deleting project: " + id);
			System.err.println(e.getMessage());
			System.out.println();
		}
    }


}
