package com.nonstatic;

public class Ns1 {
	{
		System.out.println("from non static block ");
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("fromm main");
		Ns1 ob1=new Ns1();
		System.out.println(new Ns1());
		

	}

}
