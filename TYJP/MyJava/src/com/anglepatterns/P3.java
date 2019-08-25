package com.anglepatterns;

public class P3 {
	public static void main(String[] arg)
	{
		int n=5;
		for(int i=0;i<n;i++)
		{
			for (int j=0;j<n;j++)
			{
				if(i==j)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
	}


}
