package com.string;

import java.util.ArrayList;

public class Q12 {
public static void main(String[] args) {
	String s="pavan is my friend";
	String[] i = s.split(" ");
	String s1="";
	ArrayList< String> ar=new ArrayList<String>();
	for(String c:i)
	{
		ar.add(c);
	}
	for(int j=0;j<ar.size();j++)
	{
		s1=s1.concat(ar.get(j));
	}
	System.out.println(s1);
}
}
