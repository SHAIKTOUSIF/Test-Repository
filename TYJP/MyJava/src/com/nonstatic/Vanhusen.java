package com.nonstatic;

public class Vanhusen {
	String color;
	int size;
	String prdcd;
	static int count;
		{
			
			count++;
			prdcd="VN"+count;
			
		}
		Vanhusen()
		{
			System.out.println("");
		}
		Vanhusen(String color,int size)
		{
			this.color=color;
			this.size=size;
		}

		public static void main(String[] args) {
			Vanhusen s1=new Vanhusen();
			System.out.println("color:"+s1.color +" Size:"+s1.size+" Product code is "+s1.prdcd);
			Vanhusen s2=new Vanhusen("Black", 35);
			System.out.println("color:"+s2.color +" Size:"+s2.size+" Product code is "+s2.prdcd);
			Vanhusen s3=new Vanhusen("White", 38);
			System.out.println("color:"+s3.color +" Size:"+s3.size+" Product code is "+s3.prdcd);
			System.out.println(count);
			
		}

}
