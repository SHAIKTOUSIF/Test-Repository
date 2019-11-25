//8.	Find out the sum of all odd indexed elements from a given int array?
package Array;

public class SumOfOddArray {
	public static void main(String[] args) {
		int sum =0;
		int i;
		int[] a=new int [] {10,20,30,40,50} ;
		for(i=0; i<a.length;i++) {
			if(i%2!=0) {
				sum=sum+a[i];
				System.out.println(a[i]);
				
			}
			
		}
		System.out.println("Sum of even array index is "+sum);
	}

}
