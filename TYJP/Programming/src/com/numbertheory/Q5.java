//5.	Print true, if sum of any 2 numbers is a 3rd given number
package com.numbertheory;

import java.util.Scanner;

public class Q5 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter three values: ");
	int a = sc.nextInt();
	int b = sc.nextInt();
	int c = sc.nextInt();
	if(a+b==c || b+c==a || c+a==b)
	{
		System.out.println("True");
	}
	else {
		System.out.println("False");
	}
}
}
