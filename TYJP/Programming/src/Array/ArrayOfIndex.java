//28.	Find out an index of a specified element from a given array?
package Array;

import java.util.Scanner;

public class ArrayOfIndex {
	public static void main(String[] args) {
		int a[]= {65,7,1,87,45,2};
		Scanner sc=new Scanner(System.in);
		System.out.println("Enterr the array element ");
		int b=sc.nextInt();
		for(int i=0;i<a.length;i++) {
			if(a[i]==b)
		System.out.println("The Index Value Given Element is "+i);
		}
	}
}

