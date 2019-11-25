package com.string;

import java.util.Arrays;
import java.util.Scanner;

public class Q14 {
	 public static void main(String args[]) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter First String");
		String str1 = sc.nextLine();
		System.out.println("Enter Second String");
		String str2 = sc.nextLine();

		if (str1.length() == str2.length()) 
		
		{
			char[] arr1 = str1.toCharArray();
			Arrays.sort(arr1);
			System.out.println(Arrays.toString(arr1));
			
			char[] arr2 = str2.toCharArray();
			Arrays.sort(arr2);
			System.out.println(Arrays.toString(arr2));
			
			System.out.println(Arrays.equals(arr1, arr2));
			
			if (Arrays.equals(arr1, arr2))
				System.out.println("Given strings are anagrams");
			else 
				System.out.println("Given strings are not anagrams");
		}
sc.close();
	}
	 
}


