package com.ArrayList;

import java.util.ArrayList;

public class AL3 {
public static void main(String[] args) {
	ArrayList ls=new ArrayList();
	ls.add(10);
	ls.add("Helllo");
	ls.add(new Bike ("red", 10.9));
	Bike b = new Bike ("Black",20) ;
	ls.add(b);
	System.out.println(ls);
}
}
