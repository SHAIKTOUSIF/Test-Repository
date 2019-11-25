package com.numbertheory;

public class Q25 {

	public static void main(String[] args) {
	boolean isPrime=true;
	int count=0;
	for(int l=100;l<=200;l++) 
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
				System.out.println(+l+" is prime number");}
			else
			{
				break;
			}
		}
	}
}
}
