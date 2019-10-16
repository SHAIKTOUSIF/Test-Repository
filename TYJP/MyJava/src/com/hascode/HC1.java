package com.hascode;

public class HC1 {
int i;
HC1(){
}
HC1(int i){
	this.i=i;
}
public boolean equals(Object ob)
{
	return this.i==(((HC1)ob).i);
}
public int hashCode()
{
	return i;
}
public static void main(String[] args) {
	HC1 ob1=new HC1();
	HC1 ob2=new HC1();
	HC1 ob3=new HC1();
	System.out.println(ob1);
	System.out.println(ob2);
	System.out.println(ob3);
	System.out.println(ob1.equals(ob2));
	System.out.println(ob1.equals(ob3));
	System.out.println(ob3.equals(ob2));
	System.out.println(ob1.hashCode());
	System.out.println(ob2.hashCode());
	System.out.println(ob3.hashCode());
}
}

