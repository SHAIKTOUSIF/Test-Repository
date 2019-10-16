package com.exeption;

public class P1 {
	
	public static void main(String[] args) {
			int b=0;									// b = 0
														// output:
		try {											//b =10
														//output:
			int c=10/b;
			System.out.println("in try");
			
		}
		catch(ArithmeticException e)					//catch not suitable			
		{
				System.out.println("suitable catch");
		}
		finally {
			System.out.println("finally");
		}
		
		
	}
	

}
