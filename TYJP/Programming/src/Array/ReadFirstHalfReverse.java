//22.	Read first half of the elements in the reverse direction from an array?
package Array;

public class ReadFirstHalfReverse {
	public static void main(String[] args) {
		int i;

		int[] a = { 78, 1, 7, 98, 3, 9 };
		for (i =a.length/2-1; i >= 0; i--) {
				System.out.println(a[i]);
		}
	}

}
