package com.treeset;

import java.io.DataInputStream;
import java.util.Scanner;
import java.util.TreeSet;

public class TS8 {
	public static void main(String[] args) {
		TreeSet<Employee> employee =new TreeSet<>();
		Employee e1=new Employee("ABC",1);
		Employee e2=new Employee("XYZ",2);
		Employee e3=new Employee("LMN", 3);
		Scanner scanner =new Scanner(System.in);
		System.out.println("Press 1 if you want to sort by name");
		System.out.println("Press 2 if you want to sort by id");
		int choice =scanner.nextInt();
		switch (choice) {
		case 1:TreeSet<Employee> emp =new TreeSet<>();
		emp.add(e1);
		emp.add(e2);
		emp.add(e3);
		System.out.println(emp);
		break;

		case 2:TreeSet<Employee> emp1 =new TreeSet<>();
		emp1.add(e1);
		emp1.add(e2);
		emp1.add(e3);
		System.out.println(emp1);
		break;
		

		default:System.out.println("Sorry Invalid Choice");
			break;
		}

	}
}
