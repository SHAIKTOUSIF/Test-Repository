package com.hashset;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class HS5 {
	public static void main(String[] args) {
		HashSet hs=new HashSet();
		hs.add(10);
		hs.add(20);
		hs.add(100);
		System.out.println("Before");
		System.out.println(hs);
		ArrayList ls=new ArrayList(hs);
		Collections.sort(ls);
		System.out.println("After");
		System.out.println(ls);
	}

}
