package com.treeset;

import java.util.Iterator;
import java.util.TreeSet;

public class DemoForAccess {

	public static void main(String[] args) {
		TreeSet<Integer> ts=new TreeSet<>();
		ts.add(10);
		ts.add(20);
		ts.add(40);
		System.out.println(ts);
		System.out.println("Accessing using for each");
		for(Integer t1 : ts)
		{
			int i1=t1+10;
			System.out.println(i1);
		}
		System.out.println("Accesssing using Iterator");
		Iterator<Integer> t2=ts.iterator();
		while(t2.hasNext())
		{
			System.out.println(t2.next());
			
		}
		System.out.println("Accessing in Descending order using Descending Iterator");
		Iterator<Integer> t3 =ts.iterator();
		while(t3.hasNext())
		{
			System.out.println(t3.next());
		}
	}

}
