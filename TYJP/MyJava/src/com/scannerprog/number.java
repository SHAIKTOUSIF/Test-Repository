package com.scannerprog;

import java.util.Scanner;

public class number {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number");
		int i =sc.nextInt();
		if(i %2==0)
		{
			System.out.println("The Number is Even");
			
		}
		else
			System.out.println("The number is odd");
	}

}
