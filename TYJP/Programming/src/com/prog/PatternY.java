package com.prog;

public class PatternY {
	public static void main(String[] args) {
		int n=5; 
		 for (int i=0; i<n; i++)
			{
			 for(int j=0; j<5; j++)
					if(i==j&&j<n/2||i+j==n-1&&j>n/2|| j==n/2&& i>=2) {
					System.out.print("* ");	
					}
					else {
						System.out.print("  ");
					}
			 System.out.println();
			}
	}

}
