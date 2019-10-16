package com.Threads;

public class R {
public static void main(String[] args) {
	Runnable r1=()->{
		for(int i=0;i<3;i++)
		{
			System.out.println("Child 1");
		}
	};
	Runnable r2=()->{
		for(int i=0;i<3;i++) {
			System.out.println("child 2");
		}
	};
	Thread t1=new Thread(r1);
	Thread t2=new Thread(r2);
	t1.start();
	t2.start();
 
}
}
