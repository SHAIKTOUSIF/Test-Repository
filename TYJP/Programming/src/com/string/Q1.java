//1.	Write a program to reverse a String
package com.string;

import java.util.Scanner;

public class Q1 {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter The String to Reverse");
		String str=sc.nextLine();
		
		for (int i=str.length()-1;i>=0;i--) {
			System.out.print(str.charAt(i));
		}
sc.close();		
	}

}
