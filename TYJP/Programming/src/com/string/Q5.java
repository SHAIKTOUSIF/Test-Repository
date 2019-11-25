//5.	Find out length of the string without length() method of a String?
package com.string;

import java.util.Scanner;

public class Q5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The String");
		String str = sc.nextLine();
		sc.close();		
		int i = 0;
		char ch[] = str.toCharArray();
		for (char c : ch) {
			i++;
		}
		System.out.println("Length of the string = " + i);
	}
}
