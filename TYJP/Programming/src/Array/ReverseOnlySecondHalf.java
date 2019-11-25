//32.	Reverse only last half of the elements of given array?
package Array;

public class ReverseOnlySecondHalf {
	public static void main(String[] args) {
	int i;
	int[] a = { 78, 1, 7, 98, 3, 9 };
	for (i =0; i <= a.length/2-1; i++) {
			System.out.println(a[i]+" ");
	}
	for (i =a.length-1; i >=a.length/2; i--) {
		System.out.println(a[i]+" ");
}
}
}
