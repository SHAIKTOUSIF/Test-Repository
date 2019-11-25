//8.	Write a program to reverse the given string word wise?
package com.string;

import java.util.ArrayList;
import java.util.Scanner;

public class Q8 {
	public static void main(String[] args) {
		System.out.println("Enter the String ");
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		sc.close();		
		String [] words=str.split(" ");
		ArrayList ls=new ArrayList();
		for(String word : words) {
			ls.add(word);
		
		}
		System.out.println(ls);
		for(int i=ls.size()-1;i>=0;i--) {
			System.out.print(ls.get(i)+"  ");
		}

	}
}
