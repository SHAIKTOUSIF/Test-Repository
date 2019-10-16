package com.abstarction2;

public class MainClass1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//In1 ob =new In1(); Cant instattiated an interface
							// INterface doesnt have a contructor
		In1 ob;// can create reference variable of a interface 
		//ImC ob2=new ImC();//ImC is concrete hence an instantiated
		In1 ob2=new ImC();
		ob2.test();

	}

}
