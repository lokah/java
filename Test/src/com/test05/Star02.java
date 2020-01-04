package com.test05;

public class Star02 {

	int num = 5;

	public void test01() {
		for (int i = 0; i < num; i++) {
			for (int j = 0; j < i+1 ; j++) {
				System.out.print("*");
			}

			System.out.println();
		}

	}
}