package com.equals;

public class Employee{
	String name;
	int id;
	Employee()
	{
		
	
	}
	Employee(String name, int id){
		this.name=name;
		this.id=id;
	}
	public String toString() {
		return "Employee name is"+name+"and his id is "+id;
	}
	public boolean equals(Object ob) {
		Employee temp =(Employee)ob;
		return this.id==((Employee)ob).id;
		
	}
}
