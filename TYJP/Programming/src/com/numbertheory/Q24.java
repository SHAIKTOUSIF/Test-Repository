package com.numbertheory;

import java.util.Scanner;

public class Q24 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number from where You want to print Prime number");
		int a=sc.nextInt();
		int b=sc.nextInt();
		boolean isPrime=true;
		//		int prime=0;
		int count=0;
		for(int l=a;l<=b;l++) 
		{
			int i;
			for(i=2;i<l;i++)
			{
				if(l%i==0)
				{		
					isPrime=false;

					break;
				}
			}
			if(i==l) {
				if(count!=100) {
					count++;
					System.out.println(""+l+" is prime number");
					}
			}
		}
	}
}
