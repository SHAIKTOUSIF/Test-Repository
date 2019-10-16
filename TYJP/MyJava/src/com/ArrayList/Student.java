package com.ArrayList;

public class Student {
int rolno;
int std;
Student(){
	
}
Student(int rolno, int std){
	this.rolno=rolno;
	this.std=std;
}
public String toString() {
	return "Roll no is "+rolno+"Standard is"+std;
}
}
