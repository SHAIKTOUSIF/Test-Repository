package com.anglepatterns;

public class P14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5; char ch='A'; int i;
		for( i=0;i<n;i++)
		{
			for (int j=0;j<n;j++)
			{
				if(i>=j)
				{
					if (i%2==0)
						System.out.print(ch);
					else
						System.out.print('*');
				}
		}
		if (i%2==1)
			ch++;
			System.out.println();
		}
	}
}

