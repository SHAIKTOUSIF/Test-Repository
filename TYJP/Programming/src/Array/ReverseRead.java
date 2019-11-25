//21.	Read all elements from an array in the reverse order?
package Array;

public class ReverseRead {
	public static void main(String[] args) {
		int i;

		int[] a = { 78, 1, 7, 98, 3, 9 };
		for (i = a.length - 1; i <= a.length; i--) {
			if (i >= 0)
				System.out.println(a[i]);
		}
	}
}
