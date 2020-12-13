package com.techelevator;

public class Employee
{
	private int employeeId;
	private String firstName;
	private String lastName;
	private String department;
	private double annualSalary;
	
	public String getFullName()
	{
		return lastName + ", " + firstName;
	}
	
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
	public String getDepartment()
	{
		return department;
	}
	public double getAnnualSalary()
	{
		return annualSalary;
	}
	
	public void setLastName(String newLastName)
	{
		lastName = newLastName;
	}
	public void setDepartment (String departmentName)
	{
		department = departmentName;
	}
	public void raiseSalary (double percent)
	{
		double raiseTotal = annualSalary * percent/100; 
		annualSalary += raiseTotal;
	}
	
	public Employee (int inputEmployeeId, String inputFirstName, String inputLastName, double inputSalary)
	{
		employeeId = inputEmployeeId;
		firstName = inputFirstName;
		lastName = inputLastName;
		annualSalary = inputSalary;
	}
	
}
