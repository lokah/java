package com.lotto;

import java.util.Arrays;

//중복되지 않는 1~45 사이의 난수 7개를 만들고 정렬해서 출력하자

//중복되지 않게 하려면, 어떤 숫자가 나왔을 때 먼저 저장을 하고, 그 다음의 랜덤 숫자가 기존에 저장된
//숫자와 같으면, 다른 숫자를 뽑을 수 있도록 한다.
public class Lotto {

	// 로또 배열 생성 메소드
	private int[] make() {
		int[] arr = new int[7];

		int index = 0;
		while (index < 7) {

			int ran = (int) (Math.random() * 45) ;

			if (!isSame(arr, ran)) {
				arr[index] = ran;
				index++;

			}
		}

		return arr;
	}

	// 중복값 판별 하는 메소드

	private boolean isSame(int[] arr, int ran) {

		boolean same = false;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == ran) {

				same = true;
				break;
			}

		}

		return same;
	}

	// 정렬 메소드

	private void sort(int[] arr) {

		for (int i = 0; i < arr.length; i++) {
			for (int j = 1; j < arr.length; j++) {
				if (arr[j] < arr[j - 1]) {
					int tmp = arr[j];
					arr[j] = arr[j - 1];
					arr[j - 1] = tmp;
				}
			}
		}

	}

	// 출력하는 메소드
	public void prn() {

		int[] arr = make();

		sort(arr);
		// Arrays.sort(arr); //이렇게 써도 된다.
		for (int i = 0; i < arr.length; i++) {

			System.out.printf("%3d", arr[i]);
		}
	}

}
