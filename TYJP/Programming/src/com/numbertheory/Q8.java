//8.	Find out immediate next 5 multiple of a given number?
package com.numbertheory;

import java.util.Scanner;

public class Q8 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any  Integer");
		int a=sc.nextInt();
		int i=0;
		int s = 0;
		for (i=1;i<=5;i++)
			s=a*i;
		System.out.println(s);	
	}

}
