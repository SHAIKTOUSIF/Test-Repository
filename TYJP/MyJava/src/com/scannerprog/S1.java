package com.scannerprog;

import java.util.Scanner;

public class S1 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the first number");
		double i = sc.nextDouble();
		System.out.println("Enter the second number");
		int j = sc.nextInt();
		System.out.println("Sum is:"+(i+j));
		sc.close();
	}

}
