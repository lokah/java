package com.test01;

public class MTest02 {

	public static void main(String[] args) {

		/*
		 * 문제 1. 아규먼트가 5의 배수이면 "5의 배수입니다."라고 출력하는 메서드를 만들자 문제2. 아규먼트가 2의 배수이면서 3의 배수이면
		 * "2와 3의 배수입니다."를 출력하고 아니면 "2와 3의 배수가 아닙니다"를 출력하는 메서드를 만들자 3. 아규먼트가 소문자라면
		 * "소문자입니다."를 출력하고 대문자라면 "대문자입니다."를 출력하는 메서드를 만들자 파라미터는 char로 하자. 4. 메서드 3개를
		 * 호출하자.
		 */

		test01(15);
		test02(6);
		test03('a');

	}

	public static void test01(int i) {

		if (i % 5 == 0) {
			System.out.println("5의 배수입니다");
		}

	}

	public static void test02(int j) {
		// 이렇게도 메서드 안에서 변수를 선언할 수 있다.
		// public static void test01() {
		// int j = 6;

		if (j % 2 == 0 && j % 3 == 0) {

			System.out.println("2와 3의 배수입이다");
		} else {
			System.out.println("2와 3의 배수가 아닙니다.");
		}
	}

	public static void test03(char i) {

		if (Character.isLowerCase(i)) {// 스태틱이므로 클래스.메소드() 형식으로 쓴다.
			System.out.println("소문자입니다.");

		} else if (Character.isUpperCase(i)) {
			System.out.println("대문자입니다.");
		}

		// ascii 코드로 하면

		if (((int) i >= 97) && ((int) i <= 122)) {
			System.out.println("소문자입니다.");
		} else if (((int) i >= 65) && ((int) i <= 90)) {
			System.out.println("대문자입니다.");

		}

	}

}
