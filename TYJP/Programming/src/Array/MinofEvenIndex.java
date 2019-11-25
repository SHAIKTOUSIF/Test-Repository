//9.	Find out the min value from all even indexed elements from a given int array?
package Array;

public class MinofEvenIndex {
	public static void main(String[] args) {
		int i;
		int[] a = new int[] { 10, 20, 30, 40, 50 };
		int min = a[0];
		for (i = 0; i < a.length; i++) {
			if (i % 2 == 0)
				System.out.println(a[i]);
			{
				if (a[i] < min)
					min = a[i];
			}

		}
		System.out.println("Sum of even array index is " + min);
	}
}
