package com.ArrayList;

public class Bike {
	String color;
	double mileage;
	Bike()
	{
		
	}
	Bike(String color, double mileage)
	{
		this.color=color;
		this.mileage=mileage;
		
	}
	public String toString() {
		return "Color is "+color+"Mileage is"+mileage;
	}
}
