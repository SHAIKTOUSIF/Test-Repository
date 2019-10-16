package com.exeption;

public class CE4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(1);
		try {
			Class.forName("java.util.Scanner");
			
		}
		catch(ArithmeticException e)
		{
			System.out.println(e);
		}
		System.out.println(2);
	}

}
