package com.constructor;

public class Marker {
	String color;
	double length;
	Marker (String color, double length)
	{
		this.color=color;
		this.length=length;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Marker m1 = new Marker("Black",3.5);
		System.out.println("color:"+ m1.color+ "   length:"+m1.length);

	}

}
