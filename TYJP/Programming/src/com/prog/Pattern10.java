package com.prog;

public class Pattern10 {
	public static void main(String[] args) {
		int n=5; 
		 for (int i=0; i<n; i++)
			{
			 for(int j=0; j<5; j++)
					if(j==0 && i<3||i==0|| i==n/2||j==n-1&& i>=2||i==n-1) {
					System.out.print("*");	
					}
					else {
						System.out.print(" ");
					}
			 System.out.println();
			}
	}




}
