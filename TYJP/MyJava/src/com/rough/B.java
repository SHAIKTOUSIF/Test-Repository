package com.rough;

public class B {


private static int i;

public static void main(String [] arg) {
	int i=10;
	System.out.println(B.i);
	 B.i=20;
	System.out.println(A.i);
}
}