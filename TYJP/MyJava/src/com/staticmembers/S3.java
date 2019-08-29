package com.staticmembers;

public class S3 {
	static int  i=20;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(i); //directly
		System.out.println(S3.i); //using class name
		S3.i=30;
		System.out.println(i);
	}

}
