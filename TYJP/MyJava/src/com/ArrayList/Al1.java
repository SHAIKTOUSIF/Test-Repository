package com.ArrayList;

import java.util.ArrayList;

public class Al1 {
public static void main(String[] args) {
	ArrayList ls=new ArrayList();
	System.out.println(ls.size());
	System.out.println(ls.isEmpty());
	ls.add(10);
	ls.add("shilpa");
	System.out.println(ls);
	ls.add("Prasanna");
	ls.add(10.9);
	System.out.println(ls);
	ls.add(2,"Fathima");
	System.out.println((ls.set(3, "Basheer")));
	System.out.println(ls.contains("prassanna"));
	System.out.println(ls);
	System.out.println(ls.remove("Shilpa"));
	System.out.println(ls);
	Object ob=ls.get(1);
	System.out.println(ob);
	System.out.println(ls.remove(0));
	System.out.println(ls);
	ls.clear();
	System.out.println(ls);
	
}
}
