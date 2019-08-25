package com.nonstatic;

public class P2 {
	 void test()
	 {
		 System.out.println(":from test()");
	 }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			System.out.println("from Main");
			P2 ob1 = new P2();
			ob1.test();
			System.out.println("Main Enfds");
	}

}
