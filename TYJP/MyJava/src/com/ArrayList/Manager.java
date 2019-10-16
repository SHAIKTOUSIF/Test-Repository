package com.ArrayList;

public class Manager extends Employee {
 String domain;
 Manager(){
}
 Manager(int id, double salary ,String domain)
 {
	 super(id, salary);
	 this.domain=domain;
 }
}
