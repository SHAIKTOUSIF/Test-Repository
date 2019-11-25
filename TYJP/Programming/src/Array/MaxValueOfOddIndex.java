//10.	Find out the max value from all odd indexed elements from a given int array?
package Array;

public class MaxValueOfOddIndex {
	public static void main(String[] args) {
		int sum =0;
		int i;
		int[] a=new int [] {10,20,30,40,50} ;
		int max=a[0];
		for(i=0; i<a.length;i++) {
			if(i%2!=0) {
				sum=sum+a[i];
				System.out.println(a[i]);
				{
					if(a[i] >max)  
			               max = a[i];  
				}
				
			}
			
		}
		System.out.println("Sum of even array index is "+max);
	}

}
