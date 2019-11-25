package com.numbertheory;

public class Q28 {
	public static void main(String[] args) {
		for(int l=70;l>=20;l--) 
		{
			int i;
			for(i=2;i<l;i++)
			{
				if(l%i==0)
				{		
					break;
				}
			}
			if(i==l) {
				
					System.out.println(+l+" is prime number");
				}
			}
		}
}
