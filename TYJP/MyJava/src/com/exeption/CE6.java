package com.exeption;

public class CE6 {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		System.out.println(1);
		try {
			int c=10/10;
			Class.forName("java.util.Scanner");
			
		}
		catch(Exception e)//or Throwable
		{
			System.out.println(e);
		}
		System.out.println(2);
	}

}
