package com.nonstatic;

public class P4 {
	int a;
	void m1()
	{
		int a =300;
		System.out.println(this.a);
		this.a=a;
		System.out.println(a);
		System.out.println(this.a);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			P4 ob1 =new P4();
			ob1.a=20;
			ob1.m1();
			P4 ob2 = new P4();
			System.out.println(ob2.a);
			ob2.a=30;
			System.out.println(ob2.a);
			ob2.m1();
	}

}
