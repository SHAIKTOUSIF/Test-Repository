//16.	Find out the min value from a second half of given int array?

package Array;

public class MinimumOfSecondHalf {
	public static void main(String[] args) {
		int i;
		int[] a = new int[] { 78, 1, 7, 98, 3, 9 };
		int min = a[0];
		for (i = (a.length - 1); i >= a.length / 2; i--) {
			System.out.println(a[i]);
			if (a[i] < min)
				min = a[i];
		}

		System.out.println("Minimum Value of Second Half is " + min);
	}
}
