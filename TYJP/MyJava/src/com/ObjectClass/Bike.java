package com.ObjectClass;

public class Bike extends Vehicle{
double mileage;
String name;
Bike()
{
	
}
Bike(int vno, String color, double mileage,String name )
{
	super(vno,color);
	this.mileage=mileage;
	this.name=name;
}
public String toString(){
	return super.toString()+" Mileage is "+mileage+" Name is "+name;
	}

	
}

