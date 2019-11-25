//6.	Print true, if sum of squares of any 2 numbers is a 3rd given number
package com.numbertheory;

import java.util.Scanner;

public class Q6 {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter three values: ");
	int a = sc.nextInt();
	int b = sc.nextInt();
	int c = sc.nextInt();
	if((a*a)+(b*b)==c || (b*b)+(c*c)==a || (c*c)+(a*a)==b)
	{
		System.out.println("True");
	}
	else
	{
		System.out.println("False");
	}
}
}

