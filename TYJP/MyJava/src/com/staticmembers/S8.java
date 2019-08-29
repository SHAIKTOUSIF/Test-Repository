package com.staticmembers;

public class S8 {
		static void test()
		{
			System.out.println("From test()");
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Main Begins()");
		test();
		System.out.println("++++");
		S8.test();
		System.out.println("Main Ends()");
	}

}
