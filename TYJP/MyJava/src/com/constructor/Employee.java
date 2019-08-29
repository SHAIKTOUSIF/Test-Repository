package com.constructor;

public class Employee {
	int id;
	String name;
	double salary;
	Employee(int id, String name, double salary)
	{
		this.id=id;
		this.name=name;
		this.salary=salary;
	}
	Employee()
	{
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e1=new Employee(001,"Tousif", 28000);
		Employee e2=new Employee(002,"Aleem", 27000);
		

	}

}
