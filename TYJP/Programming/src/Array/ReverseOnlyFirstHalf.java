//31.	Reverse only first half of the elements of given array?
package Array;

public class ReverseOnlyFirstHalf {
	public static void main(String[] args) {
		int i;

		int[] a = { 78, 1, 7, 98, 3, 9 };
		for (i =a.length/2-1; i >= 0; i--) {
				System.out.println(a[i]+" ");
		}
		for (i =a.length/2; i <=a.length-1; i++) {
			System.out.println(a[i]+" ");
	}
}
}
