package com.Threads;

public class MainThread {
public static void main(String[] args) {
	MyThread t=new MyThread();
	Thread s=new Thread(t);
	s.start();  
	for(int i=0;i<10;i++)
	{
		System.out.println("Main class using Runnable");
	}
	
}
}
