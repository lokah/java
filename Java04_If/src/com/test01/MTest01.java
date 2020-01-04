package com.test01;

public class MTest01 {
//프로그램의 주 진입점, 메소드를 호출해주는 역할을 하는 maim 매소드
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		prn01(10, 20);
		// 아래 메소드에서 미리 변수를 선언했다면 prn01();
		prn02(true, false);

	}

	public static void prn01(int i, int j) {// prn0();

		// int i = 10; main 메소드에서 변수를 넣지 않고 이렇게 선언해도 된다.
		// int j = 20;

		if (i < j) {

			System.out.println("I가 J보다 작아요");
		}

		if (i > j) {

			System.out.println("i가 j보다 커요");

		} else {
			System.out.println("i가 j보다 안커요");
		} // if ~else if ~
		if (i > 15) {

			System.out.println("i가 15보다 커요");
		} else if (i > 10) {
			System.out.println("i가 10보다 커요");

		} else if (i == 10) {
			System.out.println("i가 10이랑 같아요");

		} else {
			System.out.println("i가 10보다 작아요");// 없어도 된다.
		}
	}

	private static void prn02(boolean ring, boolean married) {

		if (ring) {
			if (married) {

				System.out.println("결혼하셨군요.");
			} else {
				System.out.println("연인이 있으시군요 !");
			}

		} else {
			if (married) {
				System.out.println("연인이 있으시군요");
			} else {
				System.out.println("솔로시군요");
			}

			if (ring && married) {
				System.out.println("결혼하셨군요");

			} else if (ring || married) {
				System.out.println("연인이 있으시군요");
			} else {
				System.out.println("솔로시군요");
			}
		}
		if (ring) {
			System.out.println("반지 있다.");

		}

		if (married) {
			System.out.println("결혼했다.");
			System.out.println("부럽다.");
		}

	}
}
