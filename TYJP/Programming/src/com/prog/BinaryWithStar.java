package com.prog;

public class BinaryWithStar {
	public static void main(String[] args) {
		int n = 5;
		int k = 0;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < 2 * i + 1; j++) {
				if (j % 2 == 0) {
					if (k % 2 == 0) {
						System.out.print("1 ");
					} else {
						System.out.print("0 ");
					}
					k++;
				}

				else {
					System.out.print("* ");

				}
			}
			System.out.println();
		}

	}
}
