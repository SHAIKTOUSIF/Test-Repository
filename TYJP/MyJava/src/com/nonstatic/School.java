package com.nonstatic;

public class School {

	public static void main(String[] args) {
		// TODO Auto-generated method stubS
		Students S1 = new Students();
		Students S2 = new Students();
		System.out.println("Student Name: "+ S1.name + " Marks: "+ S1.marks);
		System.out.println("Student Name: "+ S2.name + " Marks: "+ S2.marks);
		S1.name="Tousif";
		S1.marks=98;
		S2.name="Moyeen";
		S2.marks=88;
		System.out.println("Student Name: "+ S1.name + " Marks: "+ S1.marks);
		System.out.println("Student Name: "+ S2.name + " Marks: "+ S2.marks);
		
	}

}
