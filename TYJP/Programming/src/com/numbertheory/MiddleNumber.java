package com.numbertheory;

import java.util.Scanner;

public class MiddleNumber {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter any 3 Integer");
	int a=sc.nextInt();
	int b=sc.nextInt();
	int c=sc.nextInt();
	if( b>a && a>c || c>a && a>b ) {
		System.out.println("Middle number is "+a);
	}
	if( a>b && b>c || c>b && b>a ){
		System.out.println("Middle number is "+b);
	}
	if( a>c && c>b || b>c && c>a )
	{
		System.out.println("Middle number is "+c);
	}
}
}
