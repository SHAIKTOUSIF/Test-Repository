package com.scannerprog;

import java.util.Scanner;

public class S3 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	String [] names=new String[5];
	for(int i=0; i<names.length;i++) {
	System.out.println("Enter the name");
	names[i]=sc.nextLine();
	}
	for(String name:names) {
	System.out.println(name);
	}
	sc.close();
	
}
}
