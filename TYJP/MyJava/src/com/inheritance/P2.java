package com.inheritance;

public class P2 extends P1 {
		int j=20;
		{
			System.out.println(i);
			System.out.println(j);
			System.out.println("from IIB of P2 ");
		}
		P2()
		{
			System.out.println("From P2()");
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("From Main ");
		P2 ob1=new P2();
		System.out.println(ob1);
		System.out.println("i:"+ob1.i+"j:"+ob1.j);

	}

}
