package com.ObjectClass;

public class Vehicle {
	int vno;
	String color;
	Vehicle(){
		vno=vno++;
	}
	Vehicle(int vno,String color)
	{
		this.vno=vno;
		this.color=color;
	}
	public String toString(){
		return "Vehicle no: "+vno+" Color is:"+color;
	}
	
}

