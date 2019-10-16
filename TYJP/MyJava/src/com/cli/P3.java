package com.cli;
abstract interface P3 {
	static int i=10;
	public static void main(String[] args) {
		int i= Integer.parseInt(args[0]);
		int j= Integer.parseInt(args[1]);
		System.out.print(i+j);
		
	}

}
