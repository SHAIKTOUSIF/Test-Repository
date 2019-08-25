package com.nonstatic;

public class A {
	int i, j;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A ob1 = new A();
		System.out.println("i:" +ob1.i+ "\nj:" + ob1.j);
		A ob2 = new A();
		ob2.i = 10;
		ob2.j = 20;
		System.out.println("i:" +ob2.i+ "\nj:" + ob2.j);
		A ob3 = new A();
		ob3.i= 30;
		ob3.j= 40;
		System.out.println("i:" +ob3.i+ "\nj:" + ob3.j);
		ob1.i = 50;
		ob1.j = 60;
		System.out.println("i:" +ob1.i+ "\nj:" + ob1.j);
	}

}
