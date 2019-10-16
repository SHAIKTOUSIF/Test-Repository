package com.exeption;

public class E5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(1);
		int a=10, b=0, c;
		System.out.println(2);
		try {
			c=a/b;
			System.out.println(3);
		}
		catch(ArithmeticException e)
		{
			System.out.println("caught");
		}
		System.out.println(4);

	}

}
