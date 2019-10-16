package com.methodoverriding;

public class Company {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e1=new Employee();
		e1.works();
		Developer d1=new Developer();
		d1.works();
		Testers t1=new Testers();
		t1.works();
	}

}
