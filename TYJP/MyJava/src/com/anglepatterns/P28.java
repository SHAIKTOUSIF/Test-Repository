package com.anglepatterns;

public class P28 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5; char ch='A';
		for(int i=0;i<n;i++)
		{
			for (int j=0;j<n;j++)
			{
				if(i+j>=(n-1))
				System.out.print(ch++);
				else
				System.out.print(" ");
			}
			System.out.println();
		}
	}

}
