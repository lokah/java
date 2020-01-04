package com.lotto;

public class Lotto02 {

	public void lot() {

		int[] arr = new int[45];
		int cnt = 0;

		while (true) {
			if (cnt == 7) {

				break;
			}

			int v = (int) Math.random() * 45 + 1;
			if (arr[v - 1] == 1) {

				continue;

			}

			arr[v - 1] = 1;
			cnt++;

		}

		for(i=0; i )
	}

}
