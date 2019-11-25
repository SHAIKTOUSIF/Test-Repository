//23.	Read second half of the elements in the reverse direction from an array?
package Array;

public class ReadSecondHalfReverse {
	public static void main(String[] args) {
		int i;

		int[] a = { 78, 1, 7, 98, 3, 9 };
		for (i =(a.length-1); i >= a.length/2; i--) {
			if (i >= 0)
				System.out.println(a[i]);
		}
	}
}
