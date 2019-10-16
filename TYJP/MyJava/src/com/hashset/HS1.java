package com.hashset;

import java.util.HashSet;

public class HS1 {

	public static void main(String[] args) {
		HashSet hs=new HashSet();
		hs.add(10);
		hs.add(20);
		hs.add(100);
		hs.add("hello");
		hs.add(30);
		hs.add(18.6);
		System.out.println(hs);//[20, 100, 18.6, 10, hello, 30]
		hs.add(10);//Duplicat  not allowed
		hs.add(null);  //null allowed
		System.out.println(hs);//[null, 20, 100, 18.6, 10, hello, 30]
		System.out.println(hs.size());
		hs.remove(18.6);
		System.out.println(hs);
		hs.clear();
		System.out.println(hs);
		hs.contains(18.6);
		System.out.println(hs);
		
		
	}

}
