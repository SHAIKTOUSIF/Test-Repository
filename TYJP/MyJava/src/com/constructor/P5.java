package com.constructor;

public class P5 {
	P5()
	{
		System.out.println("P4 () Constructor");
	}
	P5(int a)
	{
		System.out.println("P4() Constructor");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		P4 ob = new P4();
		System.out.println("++++++++++++");
		P4 ob2 = new P4(10);

	}

}