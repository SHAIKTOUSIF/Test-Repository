package com.numbertheory;

public class Q22 {
	public static void main(String[] args) {

		boolean isPrime=true;
		//		int prime=0;
		int count=0;
		for(int l=0;l<=100;l++) 
		{
			int i;
			for(i=2;i<l;i++)
			{
				if(l%i==0)
				{		
					isPrime=false;

					break;
				}
			}
			if(i==l) {
				if(count!=20) {
					count++;
					System.out.println(""+l+" is prime number");}
				else
				{
					break;
				}
			}
		}
	}	
}