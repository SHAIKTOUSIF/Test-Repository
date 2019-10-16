package com.treeset;

import java.util.TreeSet;

public class TS5 {

	public static void main(String[] args) {
		TreeSet ts=new TreeSet();
		ts.add(true);
		ts.add(10>=20);
		ts.add(40);//CCE Bcz Hetrogenruos object is not allowed
		ts.add(30);
		System.out.println(ts);
	}

}
