//12.	Find out the avg value from all odd indexed elements from a given int array?
package Array;

public class AvgValueOfOddIndex {
	public static void main(String[] args) {
		int sum =0;
		int avg=0;
		int i;
		int count=0;
		int[] a=new int [] {10,20,30,40,50} ;
		for(i=0; i<a.length;i++) {
			if(i%2!=0) {
				sum=sum+a[i];
				count++;
				avg=sum/count;
				System.out.println(a[i]);
				
			}
			
		}
		System.out.println("Average of odd array index is "+avg);
	}
}
