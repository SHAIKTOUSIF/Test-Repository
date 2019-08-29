package com.nonstatic;

public class X2 {
	String id;
	static int count;
	String name;
	{
		
		count++;
		id="TY"+count;
		
	}
	X2()
	{
		System.out.println("from Employee");
	}
	X2(String name)
	{
		this.name=name;
	}

	public static void main(String[] args) {
		X2 e1=new X2();
		System.out.println(e1.name+"Has"+e1.id+"as id");
		X2 e2=new X2();
		System.out.println(e2.name+"Has"+e2.id+"as id");
		X2 e3=new X2();
		System.out.println(e3.name+"Has"+e3.id+"as id");
		System.out.println(count);
		
	}

}
