package com.inheritance;

public class Road {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car c1=new Car("Black",1233,"BMW");
		Car c2=new Car("Red", 7861,"Ferrari");
		Vehicle v1=new Vehicle("blue",1431);
		System.out.println("Colour is:"+c1.color+"Vehicle no:"+c1.vno+" Brand:"+c1.brand);
		System.out.println("Colour is:"+c2.color+"Vehicle No:"+c2.vno+" Brand:"+c2.brand);
		System.out.println("Colour is:"+v1.color+"Vehicle No:"+v1.vno);
		v1.move();
		c1.move();
		c2.move();
	}

}
