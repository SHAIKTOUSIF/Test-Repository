package com.hashset;

import java.util.HashSet;
import java.util.Iterator;

public class HS3 {

	public static void main(String[] args) {
		HashSet<Integer> hs=new HashSet<>();
		hs.add(10);
		hs.add(20);
		hs.add(100);
		hs.add(80);
		
		//Accesing using For each
		for(Integer ob : hs) {
			System.out.println(ob);
		}
		//Accessing using Iterator
		Iterator t=hs.iterator();
		while(t.hasNext()) {
			Object ob =t.next();
			System.out.println(ob);
			System.out.println("*************");
		}
	}

}
