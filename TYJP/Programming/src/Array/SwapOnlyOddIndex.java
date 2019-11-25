//35.	Swap odd indexed elements with its immediate next even indexed elements of given array?
package Array;

public class SwapOnlyOddIndex {
	public static void main(String[] args) {
		int temp;
		int a[]= {10,98,76,6,54,5};
		System.out.println("Before Swapping");
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println();
		temp=a[0];
		a[0]=a[2];
		a[2]=temp;
		System.out.println("***********");
		System.out.println("After Swapping");
		for(int i=0;i<a.length;i++) {
			
			System.out.print(a[i]+" ");
		
		
	}
}
}

