package com.test02;

import java.util.Scanner;

public class MTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//동적 바인딩 - 런타임 시 메모리 할당을 하면서 메모리를 동적으로 연결하는 방식
		// 하는 이유
		// 1. 메모리 절약
		// 2.실행 속도 향상
		//
		// 3.행위 은닉

		System.out.println("선택해주세요[1:고양이2:멍멍이3:팬더]");
		Scanner sc = new Scanner(System.in);

		int select = sc.nextInt();

		Animal some = null;

		switch (select) {
		case 1:
			some = new Cat();
			break;
		case 2:
			some = new Dog();
			break;
		case 3:
			some = new Panda();
			break;
		}

		some.start();
		some.stop();

	}

}
