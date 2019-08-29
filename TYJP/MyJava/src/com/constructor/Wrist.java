package com.constructor;

public class Wrist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Watch w1 =new Watch("Analog ",2000);
		Watch w2 =new Watch("Digital ",7600);
		Watch w3 =new Watch("Chronological ",5400);
		System.out.println("Type:"+w1.type+"Price:"+w1.price);
		System.out.println("Type:"+w2.type+"Price:"+w2.price);
		System.out.println("Type:"+w3.type+"Price:"+w3.price);
	}

}
