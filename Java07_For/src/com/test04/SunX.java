package com.test04;

public class SunX {

	public static void main(String[] args) {

		prn();

	}

	public static void prn() {

		int sum = 0; // x자의 숫자들의 총합
		int count = 1;// 1씩 증가하면서 1부터 25까지 숫자 출력하는 변수
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {

				if ((i == j) || (i + j == 4)) {
					sum += count;
				}

				System.out.printf("%3d", count++);
			}
			System.out.println();

		}
		System.out.println("총합 : " + sum);
		System.out.println("평균 : " + sum / 9.0);
	}
}
