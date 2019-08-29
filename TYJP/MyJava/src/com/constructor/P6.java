package com.constructor;

public class P6 {
	int j;
	static int i;
	P6()			// constructor is a non static context
	{
		i=10;			//accessing static member directly
		System.out.println(P6.i);//10//accessing static member using class name
		System.out.println(j);//0// accessing non static member directly
		j=20;
		System.out.println(this.j);//20// accessing non static member using this 
		System.out.println(this);//P6@100
	}
	public static void main(String[] args) {
		P6 ob = new  P6();
		// TODO Auto-generated method stub

	}

}
