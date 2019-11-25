package com.prog;

public class PatternX {
	public static void main(String[] args) {
		int n=5; 
		 for (int i=0; i<n; i++)
			{
			 for(int j=0; j<5; j++)
					if(i==j || i+j==n-1 ) {
					System.out.print("* ");	
					}
					else {
						System.out.print("  ");
					}
			 System.out.println();
			}
	}

}
