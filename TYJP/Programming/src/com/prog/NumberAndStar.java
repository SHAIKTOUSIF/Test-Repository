package com.prog;

public class NumberAndStar {
	public static void main(String[] args) {
	int n=5;
	int k = 1;
	 for (int i=0; i<n; i++)
		{
		 for(int j=0; j<2*i+1; j++)
		 			{
		 if(j%2==0)
				System.out.print(k++ +" ");	
		 else
			 System.out.print("*");
				}
					System.out.println(" ");
				}
	 }

}
