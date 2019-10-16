package com.encapsulation;

public class Employee {
	String name;
	private double salary;
	public double getsalary()
	{
		return salary;
		
	}
	public void setsalary(double salary)
	{
		if(salary>this.salary)
			this.salary=salary;
		else
			System.out.println("Entered salary is unacceptable");
	}
	int id;
	public Employee(String name,double salary, int id) {
		this.name=name;
		this.id=id;
		this.salary=salary;
		
	}
}
