package com.test02;

import java.util.Scanner;

public class Test01 {

	
	public void game() {
		int j=0;
		System.out.println("가위 바위 보 게임을 하러 오셨습니다. 10회 도전할 수 있습니다.");

		Scanner sc = new Scanner(System.in);
		
		int coin = sc.nextInt();
		
		if(coin>10) {
			
			System.out.println("10회 이상 사용할 수 없습니다.");
            return;
		}
		
		System.out.println("가위 바위 보 셋 중에 하나를 내세요.");
		
		for(int i = 0 ; i<=coin; i++) {

			String arr = sc.nextLine();
			String str = "";
			

			int num = (int) (Math.random() * 3);

			switch (num) {

			case 0:
				str = "가위";
				break;
			case 1:
				str = "바위";
				break;
			case 2:
				str = "보";
				break;

			}

			if (arr.equals(str)) {

				System.out.println("비겼습니다. 다시 입력해주세요");

			} else {

				if (arr.equals("가위")) {

					if (str.equals("바위")) {

						System.out.println("당신이 졌습니다. 너무 슬퍼하지 마세요. 내일은 행복한 일이 생기고 말거예요.안녕히 가세요.");
					} else {

						System.out.println("당신이 이겼습니다. 아, 운이 좋으시군요. 오늘 좋은 일이 있을 거예요. 축하합니다.");
						
					}
				} else if (arr.equals("바위")) {

					if (str.equals("보")) {

						System.out.println("당신이 졌습니다. 너무 슬퍼하지 마세요. 내일은 행복한 일이 생기고 말거에요. 안녕히 가세요");
					} else {
						System.out.println("당신이 이겼습니다. 아, 운이 좋으시군요. 오늘 좋은 일이 있을 거예요. 축하합니다.");
						
					}
				} else if (arr.equals("보")) {
					if (str.equals("가위")) {

						System.out.println("당신이 졌습니다. 너무 슬퍼하지 마세요. 내일은 행복한 일이 생기고 말거예요. 안녕히 가세요");
					} else {
						System.out.println("당신이 이겼습니다. 아, 운이 좋으시군요. 오늘 좋은 일이 있을 거예요. 축하합니다.");
						
					}
				}
			}

		}
		sc.close();
		
	}
}
