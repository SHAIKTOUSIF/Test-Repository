package com.encapsulation;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e1=new Employee("Dingo",10000,001);
		System.out.println("Salary is "+e1.name+"is "+e1.getsalary()+"and Id is "+e1.id);
		e1.setsalary(20000);
		System.out.println("Salary is" +e1.name+"is "+e1.getsalary()+"and Id is "+e1.id);

	}

}
