package com.constructor;

public class P1 {
	P1()
	{
		System.out.println("from constructor of P1");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("from main");
		P1 ob =new P1();
		System.out.println(new P1());// creating object so print first method statement the print address
	}

}
