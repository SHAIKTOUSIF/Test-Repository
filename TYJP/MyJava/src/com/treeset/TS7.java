package com.treeset;

import java.util.TreeSet;

import com.exeption.Employee;

public class TS7 {
public static void main(String[] args) {
	TreeSet<Employee> employee =new TreeSet<>();
	Employee e1=new Employee("ABC", 1)
	Employee e2=new Employee("XYZ",2);
	Employee e3=new Employee("LMN", 3);
	employee.add(e1);
	employee.add(e2);
	employee.add(e3);
	System.out.println(employee);
}
}
