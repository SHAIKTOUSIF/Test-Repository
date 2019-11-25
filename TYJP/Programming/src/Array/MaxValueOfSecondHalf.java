//18.	Find out the max value from a second half of given int array?
package Array;

public class MaxValueOfSecondHalf {
	public static void main(String[] args) {
		int i;
		int[] a = new int[] { 10, 20, 30, 40, 50, 76 };
		int max = a[0];
		for (i =(a.length-1); i >= a.length / 2; i--) {
			System.out.println(a[i]);
			if (a[i] > max)
				max = a[i];
		}

		System.out.println("Maximum Value of Second Half is " + max);
	}
}
