package com.pac1;

public class R2 {
public static void main(String[] args) {
	System.out.println(R1.i);
	R1 ob=new R1();
	System.out.println(ob.j);
	//protected static on non static member of R1 are visible outside the class R1
}

}
