package com.prog;

public class PatternW {
	public static void main(String[] args) {
		int n=5; 
		 for (int i=0; i<n; i++)
			{
			 for(int j=0; j<5; j++)
					if(j==0|| i==j && j>=2 ||i+j==n-1&&j<=2 ||j==n-1) {
					System.out.print("* ");	
					}
					else {
						System.out.print("  ");
					}
			 System.out.println();
			}
	}

}
