package com.anglepatterns;

public class P20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5; int k=1;
		for(int i=0;i<n;i++)
		{
			for (int j=0;j<n;j++)
			{
				if(i+j>=(n-1))
					System.out.print(k+++" ");
				else
					System.out.print(" " + " ");
			}
			System.out.println();
		}

	}

}
