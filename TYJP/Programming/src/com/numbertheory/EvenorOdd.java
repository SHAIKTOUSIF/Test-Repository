//7.	Find out given number is an even or odd?
package com.numbertheory;

import java.util.Scanner;

public class EvenorOdd {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any  Integer");
		int a=sc.nextInt();
		if(a%2==0) {
			System.out.println("The Given number is odd");
		}
		else
		{
			System.out.println("The Given number is Even");
		}
	}

}
