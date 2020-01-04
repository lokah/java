package come.coffee02;

import java.util.Scanner;

public class CoffeeMachine {

	public void inputMoney() {
		// TODO Auto-generated method stub

		System.out.println("돈을 넣어 주세요. \n(한 잔당 300원)");

		Scanner sc = new Scanner(System.in);
		int money = sc.nextInt();

		if (money >= 300) {
			System.out.println("몇 잔이 필요하십니까 ?(숫자만 입력)");
			int count = sc.nextInt();
			coffeeMake(money, count);
		} else {
			System.out.println("금액이 부족합니다.");
			System.out.println("잔돈은 " + money + "원 입니다.");
		}

	}

	private void coffeeMake(int money, int count) {

		//int coffee = money / 300;
		int change = money -(count*300);
		if(change >=0) {
			System.out.printf("커피 %d 잔 나왔습니다.\n", count);
			System.out.printf("잔돈은 %d 원 입니다. \n", change);
		} else {

		System.out.println("금액이 부족합니다.");
		System.out.printf("잔돈은  + %d 원 입니다.\n", money);

	}

}
}
