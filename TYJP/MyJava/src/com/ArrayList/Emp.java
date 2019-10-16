package com.ArrayList;

public class Emp {
	int id;
	double salary;
	Emp(){
		
	}
	Emp(int id, double salary)
	{
		this.id=id;
		this.salary=salary;
	}
	public String toString() {
		return "Employee id is"+id+"Salary"+salary;
	}

}
