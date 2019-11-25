//29.	Swap two given indexed elements from the array?
package Array;

import java.util.Scanner;

public class SwapTwoValue {
	public static void main(String[] args) {
		int temp;
		int a[]= {10,98,76,6,54,5};
		System.out.println("Before Swapping");
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println();
		temp=a[1];
		a[1]=a[3];
		a[3]=temp;
		System.out.println("***********");
		System.out.println("After Swapping");
		for(int i=0;i<a.length;i++) {
			
			System.out.print(a[i]+" ");
		
		
	}
	}
}

