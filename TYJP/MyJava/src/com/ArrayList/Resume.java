package com.ArrayList;

public class Resume implements Comparable<Resume>{
	String name;
	double percentage;
	int yop;
	Resume(){}
	 Resume(String name, double percentage, int yop) {
		super();
		this.name = name;
		this.percentage = percentage;
		this.yop = yop;
	}
	public int compareTo(Resume r) {
		if( r.yop>r.yop)
			return 1;
		else if (r.yop>r.yop)
			return -1;
		else 
			return 0;
	}
	public String toString() {
		return "Name"+name+"Percentage"+percentage+"Year of Pass Out"+yop;
	}
	

}
