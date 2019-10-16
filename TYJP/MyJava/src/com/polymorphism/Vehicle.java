package com.polymorphism;

public class Vehicle {
	String vno;
	String color;
	static int count;
	Vehicle()
	{
	  count++;
	  vno="KA"+count;
	}
	Vehicle(String color)
	{
		this();
		this.color=color;
	}
	
	void move()
	{
		System.out.println("Vehicle is moving" );
	}
	void move(String location)
	{
		System.out.println("Vehicle is moving towards"+location);
	}
}
