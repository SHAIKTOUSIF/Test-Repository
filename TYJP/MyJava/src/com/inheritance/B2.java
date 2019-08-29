package com.inheritance;

public class B2 extends A2{
	int y;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B2 ob1=new B2();
				System.out.println("X of A:"+ob1.x);
				System.out.println("Y of B:"+ob1.y);
		A2 ob2=new A2();
		System.out.println("X:"+ob2.x);
		//System.out.println("Y:"+ob2.y);
		ob2.x=200;
		System.out.println("X:"+ob2.x);
	}

}
