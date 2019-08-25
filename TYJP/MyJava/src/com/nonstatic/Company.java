package com.nonstatic;

public class Company {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee E1 = new Employee();
		System.out.println("Employee Name: " +E1.name + ", Employee ID: " + E1.id);
		Employee E2 = new Employee();
		System.out.println("Employee Name: " +E2.name + ", Employee ID: " + E2.id);
		E2.name= "Chiki";
		E2.id = 1;
		Employee E3 = new Employee();
		E3.name ="Chikku";
		E3.id = 2;
		System.out.println("Employee Name: " +E3.name+ ", Employee ID: " +E3.id);
	}

}
