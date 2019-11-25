package com.numbertheory;

public class Q34 {
	public static void main(String[] args) {
		int f=0;
		int s=1;
		int count =0;
		System.out.println("Fibonacci Series");
		System.out.print(" "+f);
		System.out.print(" "+s);
		int sum=f+s;
		while(sum<=100) {
			System.out.print(" "+sum);
			f=s;
			s=sum;
			sum=f+s;
		}
	}

}
