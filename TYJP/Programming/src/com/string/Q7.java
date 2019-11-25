//7.	Write a java program to find the duplicate words and their number of occurrences in a string?
package com.string;

import java.util.Scanner;

public class Q7 {
	public static void main(String[] args) {
		System.out.println("Enter the String ");
		Scanner sc = new Scanner(System.in);
		String string = sc.nextLine();
		int count = 0;
		string = string.toLowerCase();
		String words[] = string.split(" ");
		System.out.println("Duplicate words in a given string is ");
		sc.close();		
		for (int i = 0; i < words.length; i++)
		{
			count = 1;
			for (int j = i + 1; j < words.length; j++)
			{
				if (words[i].equals(words[j]))
				{
					count++;
				}
			}
			if (count > 1 && words[i] != "0")
				System.out.println("The " + words[i] + " repeated for " + count + " time");
			else {
				System.out.println("There is no Duplicate words");
			}
		}
	}

}
