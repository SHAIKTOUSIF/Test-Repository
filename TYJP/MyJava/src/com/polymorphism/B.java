package com.polymorphism;

public class B extends A {
	void test()
	{
		System.out.println("From test of B");
	}
	public static void main(String[] args) {
		/*A ob ;
		ob =new A();
		ob.test();
		System.out.println("________________");
		ob=new B();//  auto UC
		ob.test();
		A ob2=new B();
		ob2.test();or*/
		A[] array = { new A(),new B(),new A(),new B()};
		for(int i=0; i<array.length; i++)
			
		{
			array[i].test();
			System.out.println("____________________");
		}
		 // or for(A obj:array){ obj.test();}
		
	}
}
