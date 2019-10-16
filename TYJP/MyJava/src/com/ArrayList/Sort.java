package com.ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class Sort {
	public static void main(String[] args) {
		ArrayList<Integer> i=new ArrayList<>();
		i.add(100);
		i.add(10);
		i.add(20);
		i.add(5);
		System.out.println("Before Sorting");
		System.out.println(i);
		Collections.sort(i);
		System.out.println("After sort");
		System.out.println(i);
	}

}
