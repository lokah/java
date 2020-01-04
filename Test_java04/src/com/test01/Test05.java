package com.test01;

import java.util.Scanner;

public class Test05 {

	int money;
	int count;
	int price;
	int beer;

	public void input() {

		System.out.println(
				"안녕하세요, 맥주 자판기 온담입니다. 시원한 맥주가 준비되어 있습니다." + "\n" + "원하시는 맥주를 선택해주세요. 1번은 프리미엄 수제맥주, 2번은 일반 맥주입니다.");

		Scanner sc = new Scanner(System.in);
		beer = sc.nextInt();

		switch (beer) {

		case 1:

			price = 8000;
			System.out.println("프리미엄 수제 맥주를 선택하셨습니다." + price + "원입니다. 돈을 넣어주세요");
			break;
		case 2:
			price = 6000;
			System.out.println("일반 맥주를 선택하셨습니다." + price + "원입니다. 돈을 넣어주세요.");
			break;
			default : 
				System.out.println("잘못 선택하셨습니다. 다시 선택해주세요");
				
				
				
		}

		Scanner sc1 = new Scanner(System.in);
		money = sc.nextInt();

		if (beer == 1 && money >= 8000) {

			System.out.println("몇 잔을 원하십니까 ? 잔 수를 선택해주세요");
			Scanner sc2 = new Scanner(System.in);
			count = sc2.nextInt();
			make(money, count, price);
		} else if (beer==2 && money >= 6000) {
			System.out.println("몇 잔을 원하십니까 ? 잔 수를 선택해주세요");
			Scanner sc2 = new Scanner(System.in);
			count = sc2.nextInt();
			make(money, count, price);
			
		}else {
			System.out.println("잘못 선택하셨습니다. 집에 가세요.");
		}

	}

	public void make(int money, int count, int price) {

		int coffee = money - (count * price);

		if (coffee >= 0) {
			System.out.println(count + "잔을 원하셨습니다. 잠시만 기다려주세요");
			System.out.println(count + "잔이 나왔습니다. 잔돈은" + coffee + "원입니다. 감사합니다. 또오세요 !");

		} else {

			System.out.println("당신 바보야, 넣은 돈보다 원하는 잔이 더 많잖아. 다시 눌럿 !");

		}

	}

}
