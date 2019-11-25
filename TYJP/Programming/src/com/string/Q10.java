//10.	Write a java program to count the total number of occurrences of a given character in a string?
package com.string;

import java.util.Scanner;

public class Q10 {
	public static void main(String[] args) {
		String s="Tousif Bhai";
		int count=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a String ");
		String input=sc.nextLine();
		sc.close();		
		s=" "+s+" ";
		String[] words=s.split(input);
		for(String word:words)
		{
			count++;
		}	
		System.out.println((count-1)+ " times the inputed char repeateds");	
	}
}
