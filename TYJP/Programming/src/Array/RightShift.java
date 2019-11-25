//36.	Do right shift by one for elements of given array?
package Array;

public class RightShift {
	public static void main(String[] args) {
		int[] a = { 1, 2, 3, 4, 5 };
		int n = 1;
		System.out.println("Original array: ");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}

		for (int i = 0; i < n; i++) {
			int j, last;
			last = a[a.length - 1];

			for (j = a.length - 1; j > 0; j--) {
				a[j] = a[j - 1];
			}
			a[0] = last;
		}
		System.out.println();
		System.out.println("Array after right Shift: ");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
	}
}
