//19.	Find out factorial value for a given number?
package com.numbertheory;

import java.util.Scanner;

public class Q19 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the value");
		int a = sc.nextInt();
		int b = sc.nextInt();
		for (int i = 1; i <= b; i++) {
			a = a * i;
		}
		System.out.println("The Factorial of given number is " + a);
	}
}
