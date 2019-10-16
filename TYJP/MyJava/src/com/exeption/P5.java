package com.exeption;

public class P5 {
	int i;
	static void test1()
	{
		System.out.println("in test1()");
		try {
			test2();
		}
		catch(NullPointerException e)
		{
			System.out.println("caught in test1()");
			e.printStackTrace();
		}
	}
	static void test2()
	{
		System.out.println("in test2");
		try {
			test3();
		}
		catch(ArithmeticException e)
		{
			System.out.println("caught in test2()");
			e.printStackTrace();
		}
	}
	static void test3()	{
		P5 ob=null;
		ob.i=10;
	}
	public static void main(String[] args) {
		System.out.println("in main");
		test1();
		System.out.println("end main");
	}
}
