package com.anglepatterns;

public class P18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5; char k=1;
		for(int i=0;i<n;i++)
		{
			for (int j=0;j<n;j++)
			{
				if(i<=j)
					System.out.print(k++ +" ");
				else
					System.out.println(" "+" ");
				
			}
			System.out.println();
		}

	}

}
