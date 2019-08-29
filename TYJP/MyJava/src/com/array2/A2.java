package com.array2;

public class A2 {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr=new int[5];
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=i+1;
		
		}
		display(arr);

	}
	static void display(int[] a)
	{
		for (int i=0; i<a.length; i++)
			System.out.println(a[i]);
			
	}
}
