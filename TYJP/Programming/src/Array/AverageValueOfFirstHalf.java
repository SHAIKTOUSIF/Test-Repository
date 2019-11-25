//19.	Find out the avg value from a first half of given int array?
package Array;

public class AverageValueOfFirstHalf {
	public static void main(String[] args) {
		int i;
		int sum = 0;
		int avg = 0;
		int count=0;
		int[] a = new int[] { 78, 1, 7, 98, 3, 9 };
		for (i = 0; i < a.length / 2; i++) {
			System.out.println(a[i]);
			sum = sum + a[i];
			count++;
			avg = sum / count;

		}

		System.out.println("Average Value of First Half is " + avg);
	}
}
