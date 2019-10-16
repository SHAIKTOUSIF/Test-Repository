package com.exeption;

public class CE5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(1);
		try {
			Class.forName("java.util.Scanner");
			
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		System.out.println(2);
	}

}
