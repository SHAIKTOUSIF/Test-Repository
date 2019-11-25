//13.	Write a program to check whether given string is a palindrome or not
package com.string;

import java.io.InputStream;
import java.util.Scanner;

public class Q13 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the String to convert Palindrome");
	String str=sc.nextLine();
	sc.close();		
	String rev="";
	for(int i=str.length()-1;i>=0;i--) {
		rev=rev+str.charAt(i);
	}
	if(str.equalsIgnoreCase(rev)) {
		System.out.println(str+" is a Palindrome");
	}
	else
	{
		System.out.println(str+" is not a palindrome");
	}
}
}
