//2.	Write a program to reverse a String with recursive algorithm?
package com.string;

import java.util.Scanner;

public class Q2 {
public static void main(String[] args) {
	 String str;
     System.out.println("Enter your username: ");
     Scanner sc = new Scanner(System.in);
     str = sc.nextLine();
     
     String reversed = reverseString(str);
     System.out.println("The reversed string is: " + reversed);
     sc.close();		
 
}

 public static String reverseString(String str)
 {
     if (str.isEmpty())
         return str;
     return reverseString(str.substring(1)) + str.charAt(0);
 }
		

}

