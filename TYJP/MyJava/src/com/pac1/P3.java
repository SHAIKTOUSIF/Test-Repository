package com.pac1;

public class P3 extends P1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(P3.j);
		//System.out.println(P3.i);//cte bcz i is private member of P1 hence not inherited in sub class P3 
		P3 ob =new P3();
		//System.out.println(P3.x);// cte bccz x is private in sub class
	}

}
