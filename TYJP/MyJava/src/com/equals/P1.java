package com.equals;

public class P1 {
	public static void main(String[] args) {
		String s1="ABC";
		String s2="XYZ";
		String s3="ABC";
		String s4= new String("ABC");
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s4);
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s3));
		System.out.println(s1==s3);
		System.out.println(s2.equals(s3));
		System.out.println(s4.equals(s1));
		System.out.println(s1==s4);

	}

}
