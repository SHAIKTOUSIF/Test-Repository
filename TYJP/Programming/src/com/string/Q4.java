//4.	Write a program to rotate one char in a given string
package com.string;

import java.util.Scanner;

public class Q4 {
public static void main(String[] args) {
		
	
		System.out.println("Enter a string you want to reverse");
		Scanner sc=new Scanner(System.in);
		String string =sc.nextLine();
		sc.close();		
		String rev1="";
		for(int i=(string.length()-1);i>=0;)
		{
			rev1=rev1+string.charAt(i);
			break;
		}
		String reverse=rev1;
		for(int i=0;i<string.length()-1;i++)
		{
			reverse=reverse+string.charAt(i);
		}
		System.out.println(reverse);	
	}
}
