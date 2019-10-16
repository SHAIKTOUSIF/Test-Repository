package com.treeset;

import java.util.TreeSet;

public class TS4 {

	public static void main(String[] args) {
		TreeSet ts=new TreeSet();
		ts.add('a');
		ts.add(20);//CCE at line no 10 bcz Hetrogeneous is not allowed
		System.out.println(ts);
	}

}
