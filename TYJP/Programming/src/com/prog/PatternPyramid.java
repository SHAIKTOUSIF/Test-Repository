package com.prog;

public class PatternPyramid {
	public static void main(String[] args) {
		 int n=9;
		 
		     for(int i=1;i<=n;i++)
		     {
		        for(int j=1;j<=n-i;j++)
		         {
		     System.out.print(" ");
		 } 
		        for(int j=i;j>0;j--)
		         {
		     System.out.print("* ");
		 } 
		 
		         System.out.println();
		     }
	}
}
