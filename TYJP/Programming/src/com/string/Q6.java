//6.	Find out how many words are there in a given string?
package com.string;

import java.util.Scanner;

public class Q6 {
	public static void main(String[] args) {
		System.out.println("Enter a string you want to reverse");
		Scanner sc=new Scanner(System.in);
		String string =sc.nextLine();
		sc.close();		
		int count=0;
		for(int i=0;i<string.length();i++)
		{
			if(string.charAt(i)==' ')
			{
				count++;
			}			
		}
		count+=1;
			System.out.println("Length of words is :"+count);		
	}
}