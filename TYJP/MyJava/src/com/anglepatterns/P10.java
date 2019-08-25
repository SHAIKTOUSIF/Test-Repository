package com.anglepatterns;

public class P10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5; char k='A';
		for(int i=0;i<n;i++)
		{
			for (int j=0;j<=i;j++)
			{
				
					System.out.print(k++);
			}
			System.out.println();
		}
	}
}
