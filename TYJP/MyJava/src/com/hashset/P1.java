package com.hashset;

public class P1 {
	int i;
	P1(){}
	P1(int i){this.i=i;}
	public String toString() {
		return "i"+i;
	}
	public int hashcode() {
		return i;
	}
	public boolean equals(Object ob) {
		return this.i==((P1)ob).i;
	}
}
