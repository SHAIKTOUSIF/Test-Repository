package com.exeption;
import java.util.Scanner;

public class P2 {
	int j;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a=10;
		System.out.println("please enter an integer value");
		int b= sc.nextInt();
		System.out.println("Please enter the index");
		int i = sc.nextInt();
		int c=0;
		int[] array = new int[2];
		P2 ob=null;
		try {
			array[i]=10;
			c = a/b;
			ob.j=10;
			System.out.println(c);
		}
		catch(ArithmeticException e) {
		System.out.println("b cant be 0 enter any other valid input");
		}
		catch(IndexOutOfBoundsException e)
		{
			System.out.println("index should be <2 and > 0");
		}
		catch(Throwable e)
		{
			System.out.println("Sorrry we have an error");
		}
	}

}
