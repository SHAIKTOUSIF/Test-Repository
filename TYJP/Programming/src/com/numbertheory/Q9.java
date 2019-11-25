//9.	Print all odd numbers between two given numbers?
package com.numbertheory;

import java.util.Scanner;

public class Q9 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter any 2 Integer");
	int a=sc.nextInt();
	int b=sc.nextInt();
	for (int i=a;i<=b;i++) {
		if(i%2==1) {
			System.out.println(i);
		}
	}
	
	
	
}
}
