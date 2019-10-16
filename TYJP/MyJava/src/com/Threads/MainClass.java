package com.Threads;

public class MainClass {

	public static void main(String[] args) {
		T1 t=new T1();
		t.start();
		for(int i=0;i<10;i++)
		{
			System.out.println("Main class");
		}
	}

}
