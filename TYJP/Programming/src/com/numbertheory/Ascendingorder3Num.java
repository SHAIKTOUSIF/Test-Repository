package com.numbertheory;

import java.util.Scanner;

public class Ascendingorder3Num {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter three values: ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		if ((a < b) && (b < c)){
		    System.out.println("The sorted numbers are " + a + " " + b + " " + c);
		    }
		if ((a < b) && (b > c)){
		    System.out.println("The sorted numbers are " + a + " " + c + " " + b);
		    }
		if ((a > b) && (b > c)){
		    System.out.println("The sorted numbers are " + c + " " + b + " " + a);
		    }
		if ((a > b) && (b < c)){
		    System.out.println("The sorted numbers are " + b + " " + a + " " + c);
		    }
		}
		
	}

