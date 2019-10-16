package com.exeption;

public class P3 {
	
	static void test()
	{
		System.out.println("in test()");
		int a=10, b=0;
		try {
		int c=a/b;
		}
		catch(NullPointerException e) {
			System.out.println("caught");
			e.printStackTrace();
		}
		System.out.println("test ends");
	}
	public static void main(String[] args) {
		System.out.println("from main");
		try {
		test();
		}
		catch(ArithmeticException e)
		{
			System.out.println("caught in main");
			e.printStackTrace();
		}
		System.out.println("main ends");

	}

}
