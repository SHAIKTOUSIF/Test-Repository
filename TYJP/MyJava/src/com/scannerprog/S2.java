package com.scannerprog;

import java.util.Scanner;

public class S2 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the First name");
	String b=sc.nextLine();
	System.out.println("Enter the Last name");
	String b1=sc.nextLine();
	System.out.println("Enter your Age");
	int b2=sc.nextInt();
	if(b2>=18) {
		System.out.println(b+" "+b1+" Eligible For voting");
		
	}
	else 
		System.out.println(b+" "+b1+" Not Eligible for Voting");
}
}
