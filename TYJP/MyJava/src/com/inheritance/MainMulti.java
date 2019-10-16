package com.inheritance;

public class MainMulti {
	public static void main(String[] args) {
		Multi1 ob=new Multi1();
		System.out.println("I:"+ob.i);
		//System.out.println("J:"+ob.j);
		//System.out.println("K:"+ob.k);
		Multi2 ob1=new Multi2();
		System.out.println("I:"+ob1.i);
		System.out.println("J:"+ob1.j);
		//System.out.println("K:"+ob1.k);
		Multi3 ob2=new Multi3();
		System.out.println("I:"+ob2.i);
		System.out.println("J:"+ob2.j);
		System.out.println("k:"+ob2.j);
	}

}
