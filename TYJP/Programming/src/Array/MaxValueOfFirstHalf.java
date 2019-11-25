//17.	Find out the max value from a first half of given int array?
package Array;

public class MaxValueOfFirstHalf {
	public static void main(String[] args) {
		int i;
		int[] a = new int[] { 10, 20, 30, 40, 50, 76 };
		int max = a[0];
		for (i = 0; i < a.length / 2; i++) {
			System.out.println(a[i]);
			if (a[i] > max)
				max = a[i];
		}

		System.out.println("Maximum Value of First Half is " + max);
	}
}
