package com.polymorphism;

public class Car extends Vehicle {
	String name;
	Car()
	{
		
	}
	Car(String color , String name) {
		super(color);
		this.name = name;
	}
	void move()
	{
		System.out.println(color+"color car is moving!!!!!!!!");
	}

}
