//25.	Read only even indexed elements from an array in the reverse order?
package Array;

public class ReadEvenElementInReverse {
	public static void main(String[] args) {
	int i;

	int[] a = { 78, 1, 7, 98, 3, 9 };
	for (i =(a.length-1); i>=0; i--) {
			
			if(i%2==0) {
			System.out.println(a[i]);
			}
	}
	}
}
