package com.lotto;

//중복되지 않는 1~45 사이의 난수 7개를 만들고 정렬해서 출력하자
public class Lotto01 {

	public void lott001() {

		int[] lot = new int[45];
		int cnt = 0;
		while (true) {
			if (cnt == 7) {
				break;
			}
			int v = (int) (Math.random() * 45) + 1;
			if (lot[v] == 1) {//랜던으로 나온 숫자 중에서 하나의 숫자와 일치한 숫자만 배열에 따로 담아서 중복을 피한다.
				continue;
			}

			lot[v] = 1;
			cnt++;
		}
		for (int i = 0; i < lot.length; i++) {
			if (lot[i] == 1) {
				System.out.printf("%d ", (i + 1));
			}
		}

	}
}
