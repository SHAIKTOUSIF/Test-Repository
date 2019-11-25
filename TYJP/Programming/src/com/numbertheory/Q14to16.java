//13.	Find out total digits of a given number?
package com.numbertheory;

import java.util.Scanner;

public class Q14to16 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the first number: ");
		int n=sc.nextInt();
		int temp=n;
		int r,sum=0,count=0,rev=0;
		while(n>0)
		{
			r=n%10;
			sum=sum+r;
			rev=(rev*10)+r;
			count++;
			n=n/10;
		}
		System.out.println("Sum of digits: "+sum);
		System.out.println("Total digits: "+count);
		System.out.println("Reverse of given num: "+rev);
		if(temp==rev)
			System.out.println("number is palindrome");
		else
			System.out.println("number is not a palindrome");
	}

}
