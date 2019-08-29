package com.constructor;

public class B1 {
	int i;
	
	public B1 initialise(int i)
	{
		this.i=i;
		return this;
		
	}
	public static B1 createObject()
	{
		return new B1();
	}
	void display()
	{
		System.out.println("I:"+this.i);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B1.createObject().initialise(10).display();;

	}

}
