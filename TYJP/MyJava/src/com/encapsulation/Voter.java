package com.encapsulation;

public class Voter {
	private int id;
	private int age;
	public double getAge()
	{
		return age;
		
	}
	public void setId(int id)
	{
		id=id++;
		
	}
	public int getId()
	{
		 return id;
	}
	public void setAge(double age)
	{
		if(age<this.age)
			System.out.println("Eligibleg for voting");
		else
			System.out.println("Not Eligible for voting");
	}
	public Voter(int age) {
		this.age=age;

}
}