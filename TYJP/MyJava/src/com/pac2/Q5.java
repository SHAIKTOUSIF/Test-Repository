package com.pac2;

import com.pac1.Q1;

public class Q5 extends Q1{

	public static void main(String[] args) {
		//System.out.println(Q5.i);// i is not inherited
		Q5 ob=new Q5();
		//System.out.println(ob.j);// j is not inherited in object of Q5 subclass
		
	}

}// static or non static members of superclass are not inherited out side 
// the package if they default access specifier