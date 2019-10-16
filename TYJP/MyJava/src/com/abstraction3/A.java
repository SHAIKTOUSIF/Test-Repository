package com.abstraction3;

public class A  implements I1,I2{
	public void test()
	{
		System.out.println("test() of I1 implements of A");
	}
	@Override
	public void test2() {
		
		// TODO Auto-generated method
		
		{
			System.out.println("test2() of I2 of A");
		}
	
}
}