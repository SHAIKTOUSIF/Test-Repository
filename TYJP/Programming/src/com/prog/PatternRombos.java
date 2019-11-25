package com.prog;

public class PatternRombos {
	public static void main(String[] args) {
		int n = 5;
		int sp = n / 2, ele = 1;
		for (int i = 0; i < n; i++) {
			for (int s = sp; s > 0; s--) {
				System.out.print("  ");
			}
			for (int j = 0; j < ele; j++) {
				System.out.print("* ");
			}
			if (i < n / 2) {
				sp--;
				ele = ele + 2;
			}
			else {
				sp++;
				ele=ele-2;
			}
			System.out.println();
		}
	}
}
