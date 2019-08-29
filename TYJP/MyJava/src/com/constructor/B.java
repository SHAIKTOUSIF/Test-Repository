package com.constructor;

public class B {
	B()
	{
		this(10);
		System.out.println("from B");
	}
	B(int i)
	{
		
		System.out.println("Form B(int)");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B ob1 = new  B();// from A
		System.out.println("-------------");
		B ob2=new B(10);// from A(int)

	}

}
