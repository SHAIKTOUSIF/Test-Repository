package com.array3;

public class Songs2 {
	public static void main(String[] args) {
	Songs[] s = {new Songs ("teri meri ",4.2,"RFAK"),new Songs("abcd",7.4,"efgh")};
	for (Songs s2: s)
	{
		System.out.println("Title:"+s2.title);
		System.out.println("Singer:"+s2.singer);
		System.out.println("Duration:"+s2.duration);
	}
		
	}

}
