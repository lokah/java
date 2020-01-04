package come.coffee03;

import java.util.Scanner;

public class CoffeeMachine {

	// 입력 예
	// 일반 커피 / 고급커피 선택해주세요
	// 일반 커피 :1 / 고급커피 :2
	// 2
	// 돈을 넣어주세요
	// 10000
	// 커피 몇 잔이 필요하신가요?
	// 3
	// 고급 커피 1 잔이 나왔습니다.
	// 잔돈은 9700원입니다.

	public void inputMoney() {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		// "돈을 넣어 주세요. \n(한 잔당 300원)");

		int money = 0;
		int count = 0;
		int select = 0;
		int price = 0;

		System.out.println("일반 커피(300) / 고급 커피(500)\n일반커피는 1 / 고급커피는 2 선택해주세요.");

		select = sc.nextInt();
		switch (select) {
		case 1:
			price = 300;
			break;

		case 2:
			price = 500;
			break;

		}

		System.out.println("돈을 넣어 주세요. \n(한 잔당 300원)");
		money = sc.nextInt();
		
		if (select == 1 && money >= 300) {
			System.out.println("몇 잔이 필요하십니까 ?(숫자만 입력)");
			count = sc.nextInt();
			coffeeMake(money, count, price);
		} else if (select == 2 && money >= 500) {
			coffeeMake(money, count, price);
		} else {
			System.out.println("금액이 부족합니다.");
			System.out.printf("잔돈은 %d 원 입니다. \n", money);

		}
	}

	
// 몇 잔을 선택할 것인가에 대한...첨가
	private void coffeeMake(int money, int count, int price) {

		// int coffee = money / 300;
		int change = money - (count * price);

		if (change >= 0) {
			System.out.printf("고급 커피 %d 잔 나왔습니다.\n", count);
			System.out.printf("잔돈은 %d 원 입니다. \n", change);
		} else if (change >= 0) {

			System.out.printf("일반 커피 %d 잔 나왔습니다. \n.", count);
			System.out.printf("잔돈은  + %d 원 입니다.\n", change);

		}

	}
}
