package com.constructor;

public class P4 {
	P4()
	{
		System.out.println("P4 () Constructor");
	}
	P4(int i)
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
