package com.nonstatic;

public class Ns3 {
	static int i;
	int j;
	{
		System.out.println(i);
		System.out.println(Ns3.i);
		System.out.println(this);
		System.out.println(j);
		this.j=30;
		System.out.println(j);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ns3 ob =new Ns3(); 

	}

}
