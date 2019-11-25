//15.	Find out the min value from a first half of given int array?
package Array;

public class MinValueofFirsthalf {
	public static void main(String[] args) {
		int i;
		int[] a = new int[] { 10, 20, 30, 40, 50, 76 };
		int min = a[0];
		for (i = 0; i < a.length / 2; i++) {
			System.out.println(a[i]);
			if (a[i] < min)
				min = a[i];
		}

		System.out.println("Minimum Value of First Half is " + min);
	}
}
