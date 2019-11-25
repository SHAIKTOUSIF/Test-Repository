//30.	Reverse the elements of given array?
package Array;

public class ReverseElement {
	
		public static void main(String[] args) {
			int i;

			int[] a = { 23,65,7,2,66,12 };
			for (i = a.length - 1; i <= a.length; i--) {
				if (i >= 0)
					System.out.println(a[i]);
			}
		}
}
