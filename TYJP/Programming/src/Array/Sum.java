package Array;

public class Sum {
//	  static int a[] = {12,3,34,15}; 
//      
//	     static int sum() 
//	     { 
//	         int sum = 0; 
//	         int i; 
//	        
//	         for (i = 0; i < a.length; i++) 
//	            sum +=  a[i]; 
//	        
//	         return sum; 
//	     } 
//	       
//	     public static void main(String[] args)  
//	     { 
//	         System.out.println("Sum of given array is " + sum()); 
//	        } 
	public static void main(String[] args) {
		int sum =0;
		int i,j;
		int[] a=new int [5];
		for(i=0,j=10; i<a.length;i++) { 
			a[i]=j;
			System.out.println(a[i]);
			sum=sum+a[i];
			j++;
		}
		System.out.println("Sum of given array is "+sum);
	}
} 
