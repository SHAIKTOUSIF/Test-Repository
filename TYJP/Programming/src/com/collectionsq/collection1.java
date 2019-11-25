package com.collectionsq;

import java.util.ArrayList;

public class collection1 {
	public static void main(String[] args) {
		ArrayList ls=new ArrayList();
		ls.add(15);
		ls.add("Shaik");
		ls.add("Tousif");
		ls.add(90);
		System.out.println(ls);
		ArrayList ls1=new ArrayList();
		
		ls1.addAll(ls);
		
		System.out.println(ls1);
	}
}
