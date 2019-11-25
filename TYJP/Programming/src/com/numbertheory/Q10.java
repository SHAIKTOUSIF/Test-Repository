//10.	Find out sum of all even numbers between two given numbers?
package com.numbertheory;

import java.util.Scanner;

public class Q10 {
public static void main(String[] args) {

	Scanner sc=new Scanner(System.in);
	System.out.println("Enter any 2 Integer");
	int a=sc.nextInt();
	int b=sc.nextInt();
	int sum=0;
	for (int i=a;i<=b;i++) {
		if(i%2==0) {
			sum=i+b;
			System.out.println(sum);
		}
	}
	
	
	

}
}
