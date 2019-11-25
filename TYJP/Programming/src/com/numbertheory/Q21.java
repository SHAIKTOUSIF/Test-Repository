//21.	Develop a program to find out given number is a prime or not?
package com.numbertheory;

import java.util.Scanner;

public class Q21 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the Number To Check It is Prime or Not");
	int n=sc.nextInt();

	//int n=15;
	boolean isPrime=true;
	int i=3;
	for(int j=2;j<n;j++)
	{
		if(n%j==0) {
			isPrime=false;
			break;
		}
		i++;
	}if(isPrime==false) {
		System.out.println("Not a Prime Number");
	}
	else
	{
		System.out.println("It is prime number");
	}
	
}
}
