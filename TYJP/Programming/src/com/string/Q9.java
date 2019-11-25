//9.	Rotate the string word wise by one
package com.string;

import java.util.ArrayList;
import java.util.Scanner;

public class Q9 {
	public static void main(String[] args) {
		System.out.println("Enter the String ");
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		String [] words=str.split(" ");
		String name = " ";
		sc.close();		
		ArrayList<String> ls=new ArrayList<String>();
		for(String word : words) {
			ls.add(word);
		
		}
		for(int j=ls.size()-1; j>=0;j--)
		{
			name=ls.get(j);
			break;
		}
		String name1=name;
		//System.out.println(ls);
		for(int i=0;i<=ls.size()-2;i++) {
		
			//System.out.print(ls.get(i)+"  ");
			name1=name1+" "+ls.get(i);
		}
		System.out.println(name1);

	}
}