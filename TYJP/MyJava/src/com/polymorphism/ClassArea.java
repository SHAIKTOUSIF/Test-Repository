package com.polymorphism;

public class ClassArea {
public static void main(String[] args) {
	I1 c= (int length)->{
		double i=length*length*I1.PI;
		System.out.println("Area of circle is "+i);
	};
	I1 s=(int length)->{
		double i=length*length;
		System.out.println("Area of Square is "+i);
	};
	c.area(40);
	s.area(40);
}
}
