package com.exeption;
import java.util.Scanner;
public class Employee {
	int salary;
	void readSalary() {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the Salary");
		int  salary =sc.nextInt();
		if (salary<=this.salary)
		{
			System.out.println("Invalid salary");
			try {
			throw new ArithmeticException();
			}
		
			catch(ArithmeticException e)
			{
				e.printStackTrace();
				readSalary();
			}
		}
		else
			this.salary=salary;

	 }
		
	
	public static void main(String[] args) {
		Employee e=new Employee();
		System.out.println("Employee Salary is="+e.salary);
		e.readSalary();
		System.out.println("Raised Salary is ="+e.salary);


	}
}
