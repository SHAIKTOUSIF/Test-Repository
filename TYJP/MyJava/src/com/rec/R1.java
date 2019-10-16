package com.rec;

public class R1 {
	static void printNum(int n)
	{
		if(n==4)
			return;
		System.out.println(n);
		printNum(++n);
		System.out.println(n);
	}
	public static void main(String[] args) {
		System.out.println("Main Begins");
		printNum(0);
		System.out.println("Main Ends");
	}

}
