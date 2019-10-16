package com.pac2;

import com.pac1.R1;

public class R5 extends R1{
 public static void main(String[] args) {
	System.out.println(R5.i);// static member are inherited in sub class
	R5 ob =new R5();
	System.out.println(ob.j);
}
}
