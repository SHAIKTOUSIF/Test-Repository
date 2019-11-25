//6.	Find the average value of an int array?
package Array;

public class AverageSumOfArray {
	public static void main(String[] args) {
		int sum =0;
		int count=0;
		int i,j;
		int avg = 0;
		int[] a=new int [5];
		for(i=0,j=10; i<a.length;i++) { 
			a[i]=j;
			System.out.println(a[i]);
			sum=sum+a[i];
			count++;
			avg=sum/count;
			j++;
		}
		System.out.println("average of given array is " + avg);
	}

}
