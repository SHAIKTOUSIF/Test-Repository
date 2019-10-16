package com.ArrayList;

import java.util.ArrayList;

public class AL4 {

	public static void main(String[] args) {
		ArrayList ls =new ArrayList();
		ls.add(10);
		ls.add("Tousif");
		ls.add(new Bike("Black ", 20));
		ls.add(new Emp(10,20.8));
		ls.add(new Student(10,8));
		System.out.println(ls);
		System.out.println("***********");
		for(int i=0;i<ls.size();i++)
		{
			Object ob=ls.get(i);
			System.out.println(ob);
		}
		System.out.println("*************");
		for(Object ob:ls)
		{
			System.out.println(ob);
		}
		System.out.println("********* ");
	}

}
