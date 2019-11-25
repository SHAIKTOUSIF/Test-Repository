//2.	Print smaller number from 3 given numbers.
package com.numbertheory;

import java.util.Scanner;

public class SmallestOf3Number {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any 3 Integer");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		if(a<b && a<c) {
			System.out.println("smaller is:"+a);
		}
		else if(b<c && b<a) {
			System.out.println("Smaller is :"+b);
		}
		else {
			System.out.println("Smalller is :"+c);
		}
	}

}
