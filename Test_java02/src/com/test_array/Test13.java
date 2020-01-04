package com.test_array;

public class Test13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		char[] ch = new char[26];

		for (int i = ch.length-1; i >= 0; i--) {

			ch[i] = (char) ('a'+i);

			System.out.print(ch[i] + " ");

			if ((i-2) % 6 == 0) {

				System.out.println();
			}
		}

	}

}
