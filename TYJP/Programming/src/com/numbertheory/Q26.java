package com.numbertheory;

public class Q26 {
	public static void main(String[] args) {

		boolean isPrime = true;
		int count = 0;
		int sum = 0;
		for (int l = 0; l <= 300; l++) {
			int i;
			for (i = 2; i < l; i++) {
				if (l % i == 0) {
					isPrime = false;
					break;
				}
			}
			if (i == l) {
				if (count != 30) {
					count++;
					System.out.println(l+"  is a prime number");
					sum = sum + l;
				} else {
					break;
				}
			}
		}
		System.out.println(sum);
	}
}
