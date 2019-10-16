package com.inheritance;

public class Car extends Vehicle {
	String brand;

	Car()
	{
		
	}
	Car(String color, int vno, String brand)
	{
		super(color, vno);
		this.brand=brand;	
	}
}
