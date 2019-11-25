//3.	Write a program to reverse first half separately and 2nd half separately?
package com.string;

import java.util.Scanner;

public class Q3 {
	public static void main(String[] args) {
		String reverse="";
		String reverse1="";
		System.out.println("Enter a string you want to reverse");
		Scanner sc=new Scanner(System.in);
		String str =sc.nextLine();
		String word=str;
		sc.close();		

		for(int i=(str.length()-1)/2;i>=0;i--)
		{
			reverse=reverse+str.charAt(i);
		}
		for(int j=(str.length()-1);j>=(str.length())/2;j--)
		{
			reverse1=reverse1+str.charAt(j);
		}
		//System.out.println(reverse+reverse1);
		System.out.println("first half : "+reverse);
		System.out.println("second half : "+reverse1);	
		if(reverse==word)
			System.out.println("palindrome string");
		//(string.length()+4)/2
		else
			System.out.println("Not a palindrome string");
	}

	
}

