package com.inheritance;

public class X {
	static int i=10;
	static
	{
		System.out.println(i);
		System.out.println("SIB of X");
	}
public static void main(String[] arg) {
	System.out.println("From Main of X");
	}
}

