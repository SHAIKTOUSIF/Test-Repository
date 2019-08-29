package com.constructor;

public class Company {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Laptop l1 =new Laptop("HP",4,"I5");
		Laptop l2 =new Laptop("Lenovo",8,"I7");
		Laptop l3 =new Laptop("Dell",10,"I9");
		System.out.println("Brand:"+l1.brand+" Ram:"+l1.ram+"GB Ram Processor:"+l1.processor);
		System.out.println("Brand:"+l2.brand+" Ram:"+l2.ram+"GB Ram Processor:"+l2.processor);
		System.out.println("Brand:"+l3.brand+" Ram:"+l3.ram+"GB Ram Processor:"+l3.processor);
	}

	}


