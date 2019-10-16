package com.Threads;

public class P1 {
public static void main(String[] args) {
	I1 i=(int x)->{
		System.out.println("Implements "+x);
	};
	/*I1 i2=(int x)->{
		System.out.println("Differrent Implements"+x);
	};*/
	i.test(10);
	//i2.test(20);
}
}
