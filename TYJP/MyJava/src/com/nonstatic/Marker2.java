package com.nonstatic;

public class Marker2 {
String color;
String name;
double length;
double price;
void initialise(String color, String name, double length, double  price)
{
	this.color=color;
	this.name=name;
	this.length= length;
	this.price= price;
	System.out.println("colour:"+this.color+"\n name:"+this.name+"\n Length:" +this.length+"\n price:"+this.price);
}

public static void main(String[] args) {
	// TODO Auto-generated method stub
	Marker2 ob1 = new Marker2();
	ob1.initialise("blue", "Rorito", 3.3, 100);
	Marker2 ob2 =new Marker2();
	ob2.initialise("Black", "Cello", 3.4, 100);
	
	
	

}

}

