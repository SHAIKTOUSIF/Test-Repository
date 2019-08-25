package com.nonstatic;

public class P3 {
	int i;
	void test()
	{
		System.out.println("From Test()");
		System.out.println(i);
		System.out.println("this:" + this);
		i=20;
		System.out.println(this.i);
		System.out.println("end o the test");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("From Main");
		P3 ob =new P3();
		ob.i=10;
		ob.test();
		//System.out.println(this); //CTE
		System.out.println("End Main");
		
	}

}
