package com.techelevator;

public class Employee
{
	private int employeeId;
	private String firstName;
	private String lastName;
	private String department;
	private double annualSalary;
		
	public int getEmployeeId()
	{
		return employeeId;
	}
	public String getFirstName()
	{
		return firstName;
	}
	public String getLastName()
	{
		return lastName;
	}
	public String getFullName()
	{
		return lastName + ", " + firstName;
	}
	public String getDepartment()
	{
		return department;
	}
	public double getAnnualSalary()
	{
		return annualSalary;
	}
	public void setLastName(String inputLastName)
	{
		lastName = inputLastName;
	}
	public void setDepartment (String inputDepartment)
	{
		department = inputDepartment;
	}
	public void raiseSalary (double percent)
	{
		double raiseTotal = annualSalary * percent/100; 
		annualSalary += raiseTotal;
	}
	
	public Employee (int employeeId, String firstName, String lastName, double salary)
	{
		this.employeeId = employeeId;
		this.firstName = firstName;
		this.lastName = lastName;
		annualSalary = salary;
	}
	
}
