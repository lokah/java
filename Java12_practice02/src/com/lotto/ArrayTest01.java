package com.lotto;

public class ArrayTest01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr1 = new int[5];
		for (int i = 0; i < arr1.length; i++) {
			arr1[i] = (1 + i);

		}

		prn02(arr1);
	}

	public static void prn02(int[] arr) {

		int cnt = 1;
		for (int i = 1; i <= arr.length; i++) {
			if (i ==1) {
				System.out.println();

			}
			System.out.print(arr[i - 1] + " ");
			cnt++;
		}

	}
}
