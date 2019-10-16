package com.ArrayList;

import java.util.ArrayList;

public class AL6 {
public static void main(String[] args) {
	ArrayList ls=new ArrayList();
	ls.add(10);
	ls.add("Helllo");
	ls.add(new Bike ("red", 10.9));
	Bike b = new Bike ("Black",20) ;
	ls.add(b);
	System.out.println(ls);
	for (int i=0; i<ls.size(); i++)
	{
		Object ob=ls.get(i);
		if(ob instanceof Integer) {
			Integer i1 =(Integer)ob;
			int i2=i1;
			System.out.println(i2+30);
		}
		if(ob instanceof Bike) {
			Bike b1=(Bike) ob;
			b1.color="Black";
			System.out.println(b1.color);
			
		}System.out.println("*************");
	}
}
}
