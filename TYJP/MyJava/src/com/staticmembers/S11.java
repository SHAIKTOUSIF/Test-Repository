package com.staticmembers;

public class S11 {
	static int a=20;
	static void test()
	{
		int a=10;
		System.out.println(a);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(a);
		System.out.println(S11.a);
		test();
		System.out.println(a);

	}

}
