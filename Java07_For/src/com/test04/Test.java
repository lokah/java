package com.test04;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		prn09();

	}

	public static void prn09() {
		// *
		// **
		// ***
		// ****
		// *****
		int num = 6;
		for (int i = 0; i < num; i++) {

			for (int k = num - (i + 2); k >= 0; k--) {
				System.out.print(" ");
			}
			for (int j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println(" ");
		}

	}

}
