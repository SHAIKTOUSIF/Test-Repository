//5.	Find the 2nd max element from the given int array?
package Array;

public class SecondLargestElement {
	public static void main(String[] args) {
		int i;
		int [] a = new int [] {25, 11, 9, 75, 56};  
        int min=a[0]; 
        int smin=a[0];
        for ( i = 0; i < a.length; i++) {  
           if(a[i] >min) {
        	   smin=min;
        	   min=a[i]; 
           }
           else if(a[i]>smin) {
        	   smin=a[i];
           }
        	   
         }
	System.out.println("Second Largest Element is :"+smin);
	}
	

}
