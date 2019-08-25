package com.patterns;

public class P13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5, k=1;
		for (int i=0; i<n; i++)
		{
			for(int j=0; j<n; j++)
			{
				if(k<10)
					System.out.print(k++ +" ");
				else
					k=1; System.out.print(k +" "); k++;
			}
			System.out.println();
	}

	}

}
