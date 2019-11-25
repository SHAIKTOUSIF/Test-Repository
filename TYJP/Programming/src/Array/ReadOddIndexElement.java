//26.	Read only odd indexed elements from an array?
package Array;

public class ReadOddIndexElement {
	public static void main(String[] args) {
		int i;

		int[] a = { 78, 1, 7, 98, 3, 9 };
		for (i = 0; i < a.length; i++) {
				if(i%2!=0) {
				System.out.println(a[i]);
				}
		}
	}
}
