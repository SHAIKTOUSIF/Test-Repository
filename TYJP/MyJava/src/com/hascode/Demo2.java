package com.hascode;

public class Demo2 {

	public static void main(String[] args) {
		Demo2 d1=new Demo2();
		Demo2 d2 =d1 ;
		System.out.println(d1);
		System.out.println(d2);
		System.out.println(d1.equals(d2));
		System.out.println(d1.hashCode());
		System.out.println(d2.hashCode());
		
	}

}
