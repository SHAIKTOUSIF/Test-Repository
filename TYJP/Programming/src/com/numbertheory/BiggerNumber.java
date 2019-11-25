//1.	Print bigger number from 2 given numbers.
package com.numbertheory;

import java.util.Scanner;

public class BiggerNumber {
	public static void main(String[] args) {
		Scanner sc=new  Scanner(System.in);
		System.out.println("Enter the any Two integer");
		int a=sc.nextInt();
		int b=sc.nextInt();
		if(a>b) {
			System.out.println("Bigger Number is "+a);
		}
		else
		{
			System.out.println(b+" is The Bigger Number");
		}
	}

}
