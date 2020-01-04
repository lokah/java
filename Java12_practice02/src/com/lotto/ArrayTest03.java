package com.lotto;

public class ArrayTest03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		char[] ch = new char[26];
		for (int i = 0; i < ch.length; i++) {
			ch[i] = (char) ('a' + i);
		}
		prn02(ch);
	}

	public static void prn02(char[] arr) {

		
		for (int i = 1; i <= arr.length; i++) {

			System.out.print(arr[i-1] + " ");
			if (i % 6 == 0) {
				System.out.println();
			}

			
		}
	}
}
