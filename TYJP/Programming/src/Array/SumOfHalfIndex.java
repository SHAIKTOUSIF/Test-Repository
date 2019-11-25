//13.	Find out the sum of all elements from a first half of given int array?
package Array;

public class SumOfHalfIndex {
public static void main(String[] args) {

	int sum =0;
	int i;
	int [] a=new int [] {10,20,30,40,50,76} ;
	for(i=0; i<a.length/2;i++) {
	
			
			sum=sum+a[i];
			System.out.println(a[i]);
			
		
		
	}
	System.out.println("Sum of half  array index is "+sum);

}
}
