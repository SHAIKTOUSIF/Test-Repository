package com.exeption;

public class P4 {
	static void test()
	{
		System.out.println("in tets()");
		int a=10;
		int b=0;
		int c=a/b;
		System.out.println("test() ends");
	}
	public static void main(String[] args) {
		System.out.println("from main");
		test();
		System.out.println("main ends");
	}
}
