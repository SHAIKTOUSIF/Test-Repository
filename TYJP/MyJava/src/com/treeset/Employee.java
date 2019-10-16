package com.treeset;

public class Employee {
	String name;
	int id;
	Employee(){}
	Employee(String name, int id) {
		this.name = name;
		this.id = id;
	}
	public String toString() {
		return "" + name + "" + id;
	}
	public int compareTo(Employee emp) {
		return this.name.compareTo(emp.name);
	}
	
	

}
