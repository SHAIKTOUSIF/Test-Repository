/* WAP TO REPRESENT AN ENTITY HAVING THE FOLLOWING PROPERT KNOW AS MARKER, MARKER SHOULD HAVE COLOR , NAME, LENGTH, PRICE DESIGN A METHOD  TO KNOWN AS  INITIALIZE TO ASSIGN A VALUE*/ 

package com.nonstatic;

public class Marker {
	String color;
	String name;
	double length;
	double price;
	void initialise(String a, String b, double c, double d)
	{
		color=a;
		name=b;
		length=c;
		price=d;
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Marker ob1 = new Marker();
		ob1.initialise("blue", "Rorito", 3.3, 10);
		System.out.println("colour:"+ob1.color+"\n name:"+ob1.name+"\n Length:" +ob1.length+"\n price:"+ob1.price);
		
		

	}

}
