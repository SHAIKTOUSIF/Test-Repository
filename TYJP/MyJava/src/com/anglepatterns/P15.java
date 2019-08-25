package com.anglepatterns;

public class P15 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5; int k=1; char ch='A';
		for(int i=0;i<n;i++)
		{
			for (int j=0;j<=i;j++)
			{
				if(i%2==0)
					System.out.print(ch++);
				else 
					System.out.print(k++);
			}
			ch ='A';
			k=1;
			System.out.println();
		}
	}
}
